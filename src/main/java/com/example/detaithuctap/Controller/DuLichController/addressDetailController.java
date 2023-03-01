package com.example.detaithuctap.Controller.DuLichController;

import com.example.detaithuctap.Entity.DuLich.address_detail;
import com.example.detaithuctap.Service.DuLichService.address_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RequestMapping("/du-lich/chi-tiet-dia-diem")
@RestController
public class addressDetailController {
    @Autowired
    private address_detailService service;
    @PostMapping("/find-by-id-dia-diem")
    public address_detail findByIdAddress(@RequestParam("id")int id){
        address_detail addressDetail = service.findByIdAddress(id);
        return addressDetail;
    }
    @PostMapping("/save-or-update")
    public String saveorupdate(@RequestParam("mota") String mota,
                             @RequestParam("chi_tiet_hinh_anh") String chi_tiet_hinh_anh, @RequestParam("giomocua") String giomocua,
                             @RequestParam("giodongcua") String giodongcua, @RequestParam("id_dia_diem_du_lich") int id_dia_diem_du_lich,
                             @RequestParam("gia") double gia) throws ParseException {
        try{
            address_detail addressDetail = service.findByIdAddress(id_dia_diem_du_lich);
            addressDetail.setMota(mota);
            addressDetail.setChi_tiet_hinh_anh(chi_tiet_hinh_anh);
            addressDetail.setGiomocua(giomocua);
            addressDetail.setGiodongcua(giodongcua);
            addressDetail.setAddress(id_dia_diem_du_lich);
            addressDetail.setGia(gia);
            service.saveAddress(addressDetail);
            return "update";
        }
        catch (Exception e){
            address_detail addressDetail = new address_detail(mota, chi_tiet_hinh_anh, giomocua, giodongcua, id_dia_diem_du_lich, gia);
            service.saveAddress(addressDetail);
            return "save";
        }
    }
}
