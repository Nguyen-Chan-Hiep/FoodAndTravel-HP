package com.example.detaithuctap.Controller;

import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Entity.Yeu_Thich.MonAn.LikeMonAn;
import com.example.detaithuctap.Service.MonAn.MonAnService;
import com.example.detaithuctap.Service.NguoiDung.NguoiDungService;
import com.example.detaithuctap.Service.Yeu_Thich.LikeMonAnService;
import com.example.detaithuctap.auth.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
@Controller
public class HomeController {

    @Autowired
    private NguoiDungService nguoiDungService;

    @Autowired
    private MonAnService monAnService;
    @Autowired
    private LikeMonAnService likeMonAnService;

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
    public String food(){
        return "food";
    }

    @GetMapping("/food-detail/{id}")
    public ModelAndView food_detail(@PathVariable("id") int id, HttpSession session){
        MyUserDetail myUserDetail = (MyUserDetail) session.getAttribute ("user");
        NguoiDung nguoiDung = nguoiDungService.getById (myUserDetail.getId ());
        ModelAndView modelAndView = new ModelAndView ("food-detail") ;
        MonAn monAn =  monAnService.getById (id);
        modelAndView.addObject ("monan", monAn);
        LikeMonAn likeMonAn = likeMonAnService.getLikeByIdMonAnAndIdUser (monAn, nguoiDung);
        System.out.println (likeMonAn == null);
        if(likeMonAn == null){
            session.setAttribute ("like", null);
        }
        else{
            session.setAttribute ("like", likeMonAn);
        }

        return modelAndView;
    }
    @GetMapping("/checkLogout")
    public String checkLogout(HttpSession session){
        MyUserDetail myUserDetail = (MyUserDetail)session.getAttribute ("user");
        myUserDetail = null;
        session.setAttribute ("user", myUserDetail);
        return "redirect:/home";
    }

}
