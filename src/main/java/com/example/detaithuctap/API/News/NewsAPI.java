package com.example.detaithuctap.API.News;

import com.example.detaithuctap.Entity.tintuc.news;
import com.example.detaithuctap.Service.tintucService.tintucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;


@RestController
@RequestMapping("/news")
public class NewsAPI {
    @Autowired
    private tintucService service;
    @PostMapping("/save")
    public String save(@RequestBody news tintuc){
        Timestamp timepost = new Timestamp(System.currentTimeMillis());
        news news1 = new news(tintuc.getTieuDe(), tintuc.getImage(), tintuc.getLoaiHinh()
        , timepost, tintuc.getNoiDung(), tintuc.getHinhAnhChiTiet());
        try{
            service.saveorupdate(news1);
            return "sucess";
        } catch (Exception e){
            return "error";
        }
    }
}
