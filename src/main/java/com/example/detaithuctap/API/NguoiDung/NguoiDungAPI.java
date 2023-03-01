package com.example.detaithuctap.API.NguoiDung;

import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Service.NguoiDung.NguoiDungService;
import com.example.detaithuctap.auth.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

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
