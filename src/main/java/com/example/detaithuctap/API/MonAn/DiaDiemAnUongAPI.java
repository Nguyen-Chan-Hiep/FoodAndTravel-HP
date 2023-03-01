package com.example.detaithuctap.API.MonAn;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import com.example.detaithuctap.Service.MonAn.DiaDiemAnUongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/dia-diem-an-uong")
public class DiaDiemAnUongAPI {

    @Autowired
    private DiaDiemAnUongService diaDiemAnUongService;

    @PutMapping("/save-or-update-dia-diem-an-uong")
    public ResponseEntity<String> saveOrUpdate(@RequestBody DiaDiemAnUong diaDiemAnUong){
        diaDiemAnUongService.saveOrUpdate (diaDiemAnUong);
        return new ResponseEntity<> ("Thành công !!", HttpStatus.OK);
    }

    @DeleteMapping("/xoa-dia-diem-an-uong/{id}")
    public ResponseEntity<String> delete(@PathVariable("id")int id){
        diaDiemAnUongService.delete (id);
        return new ResponseEntity<> ("Xóa thành công !!", HttpStatus.OK);
    }

    @GetMapping("/chi-tiet-dia-diem-an-uong/{id}")
    public Optional<DiaDiemAnUong> chitietDiaDiem(@PathVariable("id") int id){
        return Optional.ofNullable (diaDiemAnUongService.getById (id));
    }
}
