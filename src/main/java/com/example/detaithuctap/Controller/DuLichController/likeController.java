package com.example.detaithuctap.Controller.DuLichController;

import com.example.detaithuctap.Service.DuLichService.likedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/du-lich/like")
public class likeController {
    @Autowired
    private likedService service;
    @PostMapping
    public String likeClick(@RequestParam("id_user")int idUser, @RequestParam("id_dia_diem")int idAddress){
        return service.likeClick(idUser, idAddress);
    }
}
