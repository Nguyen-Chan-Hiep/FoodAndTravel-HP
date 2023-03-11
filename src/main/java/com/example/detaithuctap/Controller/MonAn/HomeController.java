package com.example.detaithuctap.Controller.MonAn;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.MonAn.monan_diadiemanuong;
import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Entity.MonAn.LikeMonAn;
import com.example.detaithuctap.Entity.MonAn.Loai_hinh_am_thuc;
import com.example.detaithuctap.Service.MonAn.DiaDiemAnUongService;
import com.example.detaithuctap.Service.MonAn.Loai_hinh_am_thucService;
import com.example.detaithuctap.Service.MonAn.MonAnService;
import com.example.detaithuctap.Service.NguoiDung.NguoiDungService;
import com.example.detaithuctap.Service.Yeu_Thich.LikeMonAnService;
import com.example.detaithuctap.auth.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private NguoiDungService nguoiDungService;

    @Autowired
    private MonAnService monAnService;
    @Autowired
    private LikeMonAnService likeMonAnService;

    @Autowired
    private DiaDiemAnUongService diaDiemAnUongService;
    
    @Autowired
    private Loai_hinh_am_thucService loai_hinh_am_thucService;

    @GetMapping({"/", "/home"})
    public String home(HttpSession session)
    {
        return "home";
    }

    @GetMapping("/checkLogin")
    public String checkLogin(HttpSession session){
        try{
            MyUserDetail myUserDetail = (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
            session.setAttribute ("user", myUserDetail);
        }catch (Exception e){
                session.setAttribute ("user", null);
        }
        return "redirect:/home";
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
    
    @GetMapping("/checkLogout")
    public String checkLogout(HttpSession session){
        MyUserDetail myUserDetail = (MyUserDetail)session.getAttribute ("user");
        myUserDetail = null;
        session.setAttribute ("user", myUserDetail);
        return "redirect:/home";
    }
    
    @GetMapping("/chi-tiet-dia-diem")
    public ModelAndView chi_tiet_dia_diem(@RequestParam("id")int id, @RequestParam("idmonan")int idmonan) {
    	ModelAndView modelAndView = new ModelAndView ("chitietdiadiem") ;
        List<Loai_hinh_am_thuc> list = loai_hinh_am_thucService.getAll();
    	modelAndView.addObject("listL", list);
    	DiaDiemAnUong diaDiemAnUong = diaDiemAnUongService.getById(id);
    	modelAndView.addObject("diadiem", diaDiemAnUong);
    	monan_diadiemanuong monan_diadiemanuong = monAnService.getMonan_diadiemanuong(idmonan, id);
    	modelAndView.addObject("tg", monan_diadiemanuong);
    	List<DiaDiemAnUong> listKhac = diaDiemAnUongService.listDiaDiemAnUongKhac(id);
    	modelAndView.addObject("listKhac", listKhac);
    	return modelAndView;
    }

}
