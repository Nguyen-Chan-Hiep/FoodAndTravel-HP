package com.example.detaithuctap.API.MonAn;
import com.example.detaithuctap.Entity.MonAn.ConvertVietnamese;
import com.example.detaithuctap.Entity.MonAn.Loai_hinh_am_thuc;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Service.MonAn.Loai_hinh_am_thucService;
import com.example.detaithuctap.Service.MonAn.MonAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class MonAnAPI {
    @Autowired
    private MonAnService monAnService;
    @Autowired
    private Loai_hinh_am_thucService loai_hinh_am_thucService;

    @GetMapping("/list-Mon-An")
    public List<MonAn> GetAllMonAn(){
        return monAnService.getAll ();

    }

    @PostMapping("/save-or-edit-mon-an")
    public ResponseEntity<String> SaveOrUpdate(@RequestBody MonAn monAn){
            MonAn check = monAnService.getByName (monAn.getTenmonan ());
            monAnService.saveOrUpdate (monAn);
        if(check == null) {

            return new ResponseEntity<> ("Thành công !!!", HttpStatus.OK);
        }else {
            return new ResponseEntity<> ("Thất bại !!!!", HttpStatus.BAD_REQUEST);

        }
    }

    @DeleteMapping("/delete-mon-an/{id}")
    public ResponseEntity<String> delete(@PathVariable("id")int id){
        MonAn check = monAnService.getById (id);
        if(check != null){
            monAnService.delete (id);
            return new ResponseEntity<> ("Xóa thành công !!!", HttpStatus.OK);
        }else{
            return new ResponseEntity<> ("Xóa thất bại !!!", HttpStatus.BAD_GATEWAY);
        }
    }

    @GetMapping("/mon-an-by-id/{id}")
    public Optional<MonAn> getMonAnById(@PathVariable("id") int id){
        return Optional.ofNullable (monAnService.getById (id));
    }

    @PostMapping("/tim-kiem-theo-ten-mon-an/{name}")
    public ResponseEntity<MonAn> searchMonAn(@PathVariable("name")String name){
        name = ConvertVietnamese.convert (name);
        MonAn monAn = monAnService.getByName (name);
        if(monAn != null){
            return new ResponseEntity<> (monAn, HttpStatus.OK);
        }else{
            return new ResponseEntity<> (null, HttpStatus.NOT_FOUND);
        }
    }



    @GetMapping("/loai-hinh-am-thuc")
    public List<Loai_hinh_am_thuc> getLoaiHinh(){
        return loai_hinh_am_thucService.getAll ();
    }

    @GetMapping("/list-mon-an-theo-loai-hinh/{id}")
    public List<MonAn> getListMonAnByLoaiHinh(@PathVariable("id")int id){
        Loai_hinh_am_thuc loai_hinh_am_thuc = loai_hinh_am_thucService.getById (id);
        return monAnService.getListMonAnByIdLoaiHinh (loai_hinh_am_thuc);
    }

}
