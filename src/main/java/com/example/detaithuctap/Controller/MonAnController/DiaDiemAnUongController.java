package com.example.detaithuctap.Controller.MonAnController;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import com.example.detaithuctap.Repository.MonAnRepository.DiaDiemAnUongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiaDiemAnUongController {

    @Autowired
    private DiaDiemAnUongRepository diaDiemAnUongRepository;

    @GetMapping("/list-dia-diem-an-uong")
    public List<DiaDiemAnUong> getAll(){
        return diaDiemAnUongRepository.findAll ();
    }
}
