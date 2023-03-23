package com.example.detaithuctap.Controller.MonAn;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.MonAn.NhanXetMonAn;
import com.example.detaithuctap.Entity.MonAn.monan_diadiemanuong;
import com.example.detaithuctap.Entity.User.NguoiDung;
//import com.example.detaithuctap.Entity.tintuc.news;
import com.example.detaithuctap.Entity.MonAn.Loai_hinh_am_thuc;
import com.example.detaithuctap.Entity.tintuc.news;
import com.example.detaithuctap.Service.Comment.NhanXetMonAnService;
import com.example.detaithuctap.Service.MonAn.DiaDiemAnUongService;
import com.example.detaithuctap.Service.MonAn.Loai_hinh_am_thucService;
import com.example.detaithuctap.Service.MonAn.MonAnService;
import com.example.detaithuctap.Service.NguoiDung.NguoiDungService;
import com.example.detaithuctap.Service.tintucService.tintucService;
import com.example.detaithuctap.auth.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class HomeController {
	
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

    @GetMapping({"/", "/home"})
    public ModelAndView home(HttpSession session)
    {
        ModelAndView modelAndView = new ModelAndView("home");
		List<news> list = tintucService.getAll();
		List<news> noibat = new ArrayList<news>();
		for (int i = 0; i < 3; i++){
			noibat.add(list.get(i));
		}
		modelAndView.addObject("tintuc", noibat);
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
    public String test1() {
    	return "quanlybaiviet";
    }
    
    @GetMapping("/addNew")
    public String addNew() {
    	return "addNew";
    }
    
    @GetMapping("/userDetail")
    public String userDetail() {
    	return "userDetail";
    }
    
//    @PostMapping("/saveInfomation")
//    
}
