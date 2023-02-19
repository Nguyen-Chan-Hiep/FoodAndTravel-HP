package com.example.detaithuctap.Controller.MonAnController;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import com.example.detaithuctap.Repository.MonAnRepository.DiaDiemAnUongRepository;
import com.example.detaithuctap.Repository.MonAnRepository.MonAn_DiaDiemAnUongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonAnController {

    @Autowired
    private DiaDiemAnUongRepository diaDiemAnUongRepository;
    @Autowired
    private MonAn_DiaDiemAnUongRepository monAn_diaDiemAnUongRepository;

    @PostMapping("/save-monAn_diaDiemAnUong")
    public void save(){
        int ii = 20;
        for(int i = 92; i <= 101; i++){
            monAn_diaDiemAnUongRepository.updateMonan_diadiemanuongById (ii, i, "Combo", "Ngon", i);
        }
    }

    @PostMapping("/update-dia_diem_an_uong")
    public List<DiaDiemAnUong> update_dia_diem_an_uong(){
        List<DiaDiemAnUong> list = diaDiemAnUongRepository.findAll ();
        return list;
    }
}
