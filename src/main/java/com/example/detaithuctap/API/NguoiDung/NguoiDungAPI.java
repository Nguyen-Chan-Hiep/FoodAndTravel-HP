package com.example.detaithuctap.API.NguoiDung;

import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Service.NguoiDung.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NguoiDungAPI {

    @Autowired
    private NguoiDungService nguoiDungService;

    @GetMapping("/chi-tiet-nguoi-dung/{id}")
    public NguoiDung getNguoidung(@PathVariable("id") int id){
        NguoiDung nguoiDung = nguoiDungService.getById (id);
        if(nguoiDung != null){
            return nguoiDung;
        }
        return null;
    }


}
