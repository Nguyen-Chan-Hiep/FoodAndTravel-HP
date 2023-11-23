package com.example.detaithuctap.Controller.MonAn;

import com.example.detaithuctap.Entity.BaiViet.BaiViet;
import com.example.detaithuctap.Entity.DuLich.Address;
import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.MonAn.NhanXetMonAn;
import com.example.detaithuctap.Entity.MonAn.monan_diadiemanuong;
import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Entity.tintuc.News;
//import com.example.detaithuctap.Entity.tintuc.news;
import com.example.detaithuctap.Entity.MonAn.Loai_hinh_am_thuc;
import com.example.detaithuctap.Service.BaiViet.BaiVietService;
import com.example.detaithuctap.Service.Comment.NhanXetMonAnService;
import com.example.detaithuctap.Service.DuLichService.AddressService;
import com.example.detaithuctap.Service.MonAn.DiaDiemAnUongService;
import com.example.detaithuctap.Service.MonAn.Loai_hinh_am_thucService;
import com.example.detaithuctap.Service.MonAn.MonAnService;
import com.example.detaithuctap.Service.NguoiDung.NguoiDungService;
import com.example.detaithuctap.Service.tintucService.tintucService;
import com.example.detaithuctap.auth.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
public class HomeController {

	@Autowired
	private AddressService diaDiemService;
	
	@Autowired
	private NhanXetMonAnService nhanXetMonAnService;

    @Autowired
    private NguoiDungService nguoiDungService;

    @Autowired
    private MonAnService monAnService;

    @Autowired
    private DiaDiemAnUongService diaDiemAnUongService;
    
    @Autowired
    private Loai_hinh_am_thucService loai_hinh_am_thucService;
    
    @Autowired
    private tintucService tintucService;
    
    @Autowired
    private BaiVietService baiVietService;

    @GetMapping({"/", "/home"})
    public ModelAndView home()
    {
        ModelAndView modelAndView = new ModelAndView("home");
		List<News> list = tintucService.getAll();
		List<News> noibat = new ArrayList<News>();
		for (int i = 0; i < 3; i++){
			noibat.add(list.get(i));
		}
		modelAndView.addObject("tintuc", noibat);
		List<Address> addresses = diaDiemService.findByLHId(4);
		List<Address> addresses1 = new ArrayList<Address>();
		for (int i = 0; i < 3; i++){
			addresses1.add(addresses.get(i));
		}
		modelAndView.addObject("dulich", addresses1);
 		return modelAndView;
    }
   

    @GetMapping("/checkLogin")
    public String checkLogin(HttpSession session){
    	MyUserDetail myUserDetail = (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
        session.setAttribute ("user", myUserDetail);
        return "redirect:/";
    }

    @GetMapping("/food")
    public ModelAndView food(){
    	ModelAndView modelAndView = new ModelAndView("food");
    	List<Loai_hinh_am_thuc> list = loai_hinh_am_thucService.getAll();
    	modelAndView.addObject("listL", list);
    	List<MonAn> listMonAns = monAnService.getAll();
    	modelAndView.addObject("listM", listMonAns);
        return modelAndView;
    }

    @GetMapping("/food-detail")
    public ModelAndView food_detail(@RequestParam("id") int id, HttpSession session){
        ModelAndView modelAndView = new ModelAndView ("food_detail") ;
        List<Loai_hinh_am_thuc> list = loai_hinh_am_thucService.getAll();
    	modelAndView.addObject("listL", list);
    	MonAn monAn = monAnService.getById(id);
    	modelAndView.addObject("monan", monAn);
		String search = "%Ẩm thực%";
		List<News> noibat = new ArrayList<News>();
		for (int i = 0; i < tintucService.getAll(search).toArray().length; i++){
			noibat.add(tintucService.getAll(search).get(i));
		}
		modelAndView.addObject("news", noibat);
        return modelAndView;
    }
    
    
    
    @GetMapping("/chi-tiet-dia-diem")
    public ModelAndView chi_tiet_dia_diem(@RequestParam("id")int id, @RequestParam("idmonan")int idmonan
    		, HttpSession session){
    	
    	MyUserDetail myUserDetail = (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
    	if(myUserDetail != null){
    		session.setAttribute ("user", myUserDetail);
    	}
        
    	ModelAndView modelAndView = new ModelAndView ("chitietdiadiem") ;
        List<Loai_hinh_am_thuc> list = loai_hinh_am_thucService.getAll();
    	modelAndView.addObject("listL", list);
    	DiaDiemAnUong diaDiemAnUong = diaDiemAnUongService.getById(id);
    	modelAndView.addObject("diadiem", diaDiemAnUong);
    	monan_diadiemanuong monan_diadiemanuong = monAnService.getMonan_diadiemanuong(idmonan, id);
    	modelAndView.addObject("tg", monan_diadiemanuong);
    	List<DiaDiemAnUong> listKhac = diaDiemAnUongService.listDiaDiemAnUongKhac(id, idmonan);
    	List<NhanXetMonAn> nhanXetMonAns = nhanXetMonAnService.list3Comment(monan_diadiemanuong.getId());
    	modelAndView.addObject("listNhanxet", nhanXetMonAns);
    	modelAndView.addObject("listKhac", listKhac);
    	return modelAndView;
    }
    
    @PostMapping("/them-like")
    @ResponseBody
    public void updateLike(@RequestParam("idmonan")int idmonan, @RequestParam("stt")int stt) {
    	monan_diadiemanuong monan_diadiemanuong = monAnService.getMonan_diadiemanuong(idmonan);
    	if(stt == 1) {
    		monan_diadiemanuong.setSoluonglike(monan_diadiemanuong.getSoluonglike() + 1);
    	}
    	else {
    		monan_diadiemanuong.setSoluonglike(monan_diadiemanuong.getSoluonglike() - 1);
    	}
    	monAnService.save(monan_diadiemanuong);
    }
    
    @PostMapping("/comment")
    @ResponseBody
    public String comment(@RequestParam("comment")String comment,
    		@RequestParam("sosao")int sosao, @RequestParam("iduser")int id, @RequestParam("idmonan")int idmonan) {
    	monan_diadiemanuong monan_diadiemanuong = monAnService.getMonan_diadiemanuong(idmonan);
    	NguoiDung nguoiDung = nguoiDungService.getById(id);
    	DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    	LocalDateTime ldt = LocalDateTime.now();
    	String date = ldt.format(CUSTOM_FORMATTER);
    	NhanXetMonAn nhanXetMonAn = new NhanXetMonAn(comment, "", sosao, monan_diadiemanuong, nguoiDung, date, date);
    	nhanXetMonAnService.saveOrUpdate(nhanXetMonAn);
    	String html = "";
		   html += "<div class=\"co-item\">\r\n"
		    	+ "								<div class=\"avatar-pic\">\r\n"
		    	+ "									<img src=\"img/user/default-user.png\" alt=\"\">\r\n"
		    	+ "								</div>\r\n"
		    	+ "								<div class=\"avatar-text\">\r\n"
		    	+ "									<div class=\"at-rating\">\r\n";
		   
		    	for (int i = 1; i <=5; i++) {
					if(i <= nhanXetMonAn.getStar()) {
						html+= "<i class=\"fa fa-star\"></i> ";
					}
					else {
						html += "<i class=\"fa fa-star-o\"></i> ";
					}
				}
		    
		    	html+= "									</div>\r\n"
		    	+ "									<h5>\r\n"
		    	+ "										"+nguoiDung.getTendaidien()+" <span>"+date+"</span>\r\n"
		    	+ "									</h5>\r\n"
		    	+ "									<div class=\"at-reply\">"+comment+"</div>\r\n"
		    	+ "								</div>\r\n"
		    	+ "							</div>";
    	return html;
    }
    
    @GetMapping("/account")
    public ModelAndView test1(HttpSession session) {
    	
    	MyUserDetail myUserDetail = (MyUserDetail)session.getAttribute("user");
    	List<BaiViet> list = baiVietService.getList(myUserDetail.getId());
    	ModelAndView modelAndView = new ModelAndView("quanlybaiviet");
    	modelAndView.addObject("listBaiviet", list);
    	return modelAndView;
    }
    
    @GetMapping("/addNew")
    public ModelAndView addNew() {
    	List<MonAn> list = monAnService.getAll();
    	ModelAndView modelAndView = new ModelAndView("addNew"); 
    	modelAndView.addObject("listM", list);
    	return modelAndView;
    }
    
	@GetMapping("/userDetail")
    public ModelAndView userDetail(HttpSession session) {
    	ModelAndView modelAndView = new ModelAndView();
    	MyUserDetail myUserDetail = (MyUserDetail)session.getAttribute("user");
    	if(!myUserDetail.getUsername().equals("admin")){
    		modelAndView.setViewName("userDetail");
    		return modelAndView;
    	}
    	else {
    		List<BaiViet> list = baiVietService.getAll();
    		modelAndView.setViewName("FormAdmin");
    		modelAndView.addObject("listBV", list);
    		return modelAndView;
    	}
    	
    	
    }
    
    @PostMapping(value = "/saveInfomation")
    @ResponseBody
    public String saveInfo(@RequestParam("img")MultipartFile multipartFile, @RequestParam("name")String name,
    		@RequestParam("diachi")String diachi, @RequestParam("loaihinh")String loaihinh, @RequestParam("dongia")String dongia,
    		@RequestParam("mota")String mota, @RequestParam("giodong")String giodong, @RequestParam("giomo")String giomo,
    		@RequestParam("tendiadiem")String tendiadiem, @RequestParam("sdt")String sdt, HttpSession session) {
    	Path path = Paths.get("src/main/resources/static/img/");
    	String string = "", string2=multipartFile.getOriginalFilename();
    	MyUserDetail nguoiDung = (MyUserDetail)session.getAttribute("user");
		String timePost = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		MonAn monAn = monAnService.getById(Integer.parseInt(name));
		Loai_hinh_am_thuc loai_hinh_am_thuc = loai_hinh_am_thucService.getById(Integer.parseInt(loaihinh));
		
		BaiViet baiViet = new BaiViet(monAn.getTenmonan(), tendiadiem,  diachi, string2, mota, loai_hinh_am_thuc.getTen_loai_hinh(), sdt, Double.parseDouble(dongia), giomo, giodong, nguoiDung.getId(), timePost);
		baiVietService.saveOrUpdate(baiViet);
    	try {
			InputStream inputStream = multipartFile.getInputStream();
			Files.copy(inputStream, path.resolve(multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			
			string = "Thông tin của bạn đang được chờ phê duyệt !";
    	} catch (Exception e) {
			string = "Có lỗi xảy ra trong khi gửi thông tin chờ phê duyệt !";
		}
    	
    	return string;
    }
    
      @GetMapping("/monan-show")
      public ModelAndView travel_show(@RequestParam("id")int id) {
    	  BaiViet baiViet = baiVietService.getById(id);
    	  ModelAndView modelAndView = new ModelAndView("monan-show");
    	  modelAndView.addObject("baiviet",baiViet );
    	  return modelAndView;
      }
      
      @GetMapping("/pheduyet")
      public String pheduyet(@RequestParam("id")int id) {
    	  baiVietService.delete(id);
    	  return "redirect:/userDetail";
      }
}
