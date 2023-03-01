package com.example.detaithuctap.Controller.DuLichController;

import com.example.detaithuctap.Entity.DuLich.loaiHinh;
import com.example.detaithuctap.Service.DuLichService.loaiHinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/du-lich/loai-hinh")
public class loaiHinhController {
    @Autowired
    private loaiHinhService service;
    @GetMapping("/get-all")
    public List<loaiHinh> getAllLoaiHinh(){
        return service.finfAll();
    }
    @PostMapping("/save")
    public void newLoaiHinh(@RequestParam("ten_loai_hinh")String tenLoaiHinh){
        loaiHinh loaiHinh1 = new loaiHinh(tenLoaiHinh);
        service.newLoaiHinh(loaiHinh1);
    }
    @PostMapping("/find-by-name")
    public loaiHinh findByName(@RequestParam("name") String name){
        try{

            return service.findByName(name);
        }
        catch (Exception e){
            return null;
        }

    }
}
