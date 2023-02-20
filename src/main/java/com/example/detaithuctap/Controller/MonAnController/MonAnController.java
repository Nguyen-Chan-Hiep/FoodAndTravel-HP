package com.example.detaithuctap.Controller.MonAnController;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Repository.MonAnRepository.DiaDiemAnUongRepository;
import com.example.detaithuctap.Repository.MonAnRepository.MonAnRepository;
//import com.example.detaithuctap.Repository.MonAnRepository.MonAn_DiaDiemAnUongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MonAnController {

    @Autowired
    private MonAnRepository monAnRepository;

    @GetMapping("/list-Mon-An")

    public List<MonAn> GetAllMonAn(){
        List<MonAn> list = monAnRepository.findAll ();
        return list;
    }



}
