package com.example.detaithuctap.Controller.DuLichController;

import com.example.detaithuctap.Entity.DuLich.dia_diem;
import com.example.detaithuctap.Service.DuLichService.diaDiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/dulich/diadiem")
@RestController()
@CrossOrigin(origins = "*")
public class diaDiemController {
    @Autowired
    private diaDiemService service;
    @GetMapping("/findAll")
    public List<dia_diem> getAll(){
        return service.getAll();
    }
    @PostMapping("/findById/{id}")
    public dia_diem findByAId(@PathVariable("id") int id){
        return service.getById(id);
    }

}
