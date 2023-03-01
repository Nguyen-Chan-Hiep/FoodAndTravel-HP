package com.example.detaithuctap.Controller.tintucController;

import com.example.detaithuctap.Entity.tintuc.news;
import com.example.detaithuctap.Service.tintucService.tintucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/tin-tuc")
public class tintucController {
    @Autowired
    private tintucService service;
    @GetMapping("/get-all")
    public List<news> getAll(){
        return service.getAll();
    }
    @PostMapping("/save")
    public String newNews(@RequestParam("tieude") String tieuDe, @RequestParam("noidung")String noidung,
                        @RequestParam("id_user")int idUser){
        Timestamp timepost = new Timestamp(System.currentTimeMillis());
        news news1 = new news(tieuDe, noidung, timepost, idUser);
        try {
            service.saveorupdate(news1);
            return "access";
        }
        catch (Exception e){
            return "fail";
        }
    }
    @PostMapping("/update")
    public String updateNews(@RequestParam("id")int id, @RequestParam("tieude") String tieuDe,
                          @RequestParam("noidung")String noidung,
                          @RequestParam("id_user")int idUser){
        Timestamp timepost = new Timestamp(System.currentTimeMillis());
        news news1 = new news(id, tieuDe, noidung, timepost, idUser);
        try {
            service.saveorupdate(news1);
            return "access";
        }
        catch (Exception e){
            return "fail";
        }
    }
    @DeleteMapping("/delete")
    public String delNews(@RequestParam("id")int id){
        try{
            service.delNews(id);
            return "access";
        }
        catch (Exception e){
            return "fail";
        }
    }
}
