package com.example.detaithuctap.Controller.DuLichController;

import com.example.detaithuctap.Entity.tintuc.news;
import com.example.detaithuctap.Service.tintucService.tintucService;
import com.example.detaithuctap.auth.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private tintucService tintucService;
    @GetMapping("/contact")
    public String contactHome(HttpSession session){
        return "contact";
    }
    @GetMapping("/news")
    public ModelAndView newsHome(HttpSession session){
        try{
            MyUserDetail myUserDetail = (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
            session.setAttribute ("user", myUserDetail);
        }catch (Exception e){

        }
        ModelAndView modelAndView = new ModelAndView("blog");
        List<news> list = tintucService.getAll();
        List<news> noibat = new ArrayList<news>();
        for (int i = 0; i < 4; i++){
           noibat.add(list.get(i));
        }
        modelAndView.addObject("listNews", list);
        modelAndView.addObject("noibat", noibat);
        return modelAndView;
    }
    @GetMapping("/blog-detail")
    public ModelAndView blogDetail(HttpSession session, @RequestParam("bid") int bid){
        ModelAndView modelAndView = new ModelAndView("blog_detail");
        news tintuc = tintucService.getById(bid);
        modelAndView.addObject("tintuc", tintuc);
        String[] arrayImg = tintuc.getHinhAnhChiTiet().split(" ");
        List<String> listImg = new ArrayList<String>();
        for (String w : arrayImg){
            listImg.add(w);
        }
        modelAndView.addObject("listImg", listImg);
        return modelAndView;
    }
    @PostMapping("/saveNews")
    public void newNews(HttpSession session, @RequestParam("tieu_de") String tieuDe,
                          @RequestParam("image") String image, @RequestParam("loai_hinh") String loaiHinh,
                          @RequestParam("noi_dung") String noiDung, @RequestParam("chi_tiet_hinh_anh") String hinhAnhChiTiet){
        Timestamp timepost = new Timestamp(System.currentTimeMillis());
        news news1 = new news(tieuDe, image, loaiHinh, timepost, noiDung, hinhAnhChiTiet);
        tintucService.saveorupdate(news1);
    }
}
