package com.example.detaithuctap.Controller.MonAnController;

import com.example.detaithuctap.Entity.MonAn.MonAn;
//import com.example.detaithuctap.Repository.MonAnRepository.MonAn_DiaDiemAnUongRepository;
import com.example.detaithuctap.Service.MonAnService.MonAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MonAnController {

    @Autowired
    private MonAnService monAnService;

    @GetMapping("/list-Mon-An")
    public List<MonAn> GetAllMonAn(){
        List<MonAn> list = monAnService.getAll ();
        return list;
    }



}
