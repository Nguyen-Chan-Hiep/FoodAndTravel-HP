//package com.example.detaithuctap.Controller.DuLichController;
//
//import com.example.detaithuctap.Entity.DuLich.address;
//import com.example.detaithuctap.Entity.DuLich.loaiHinh;
//import com.example.detaithuctap.Service.DuLichService.diaDiemService;
//import com.example.detaithuctap.Service.DuLichService.loaiHinhService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequestMapping("/du-lich/dia-diem")
//@RestController()
//@CrossOrigin(origins = "*")
//public class diaDiemController {
//    @Autowired
//    private loaiHinhService lhService;
//    @Autowired
//    private diaDiemService service;
//    @GetMapping("/find-all")
//    public List<address> getAll(){
//        return service.getAll();
//    }
//    @PostMapping("/find-by-id")
//    public address findById(@RequestParam("id") int id){
//        return service.getById(id);
//    }
//    @PostMapping("/find-by-loai-hinh")
//    public List<address> findByLoaiHinh(@RequestParam("name") String tenLoaiHinh){
//        return service.getByLHName(tenLoaiHinh);
//    }
//    @PostMapping("/update")
//    public String updateAddress(@RequestParam("id")int id, @RequestParam("tenLoaiHinh") String tenloaihinh,
//                                @RequestParam("tenDiaDiem") String tenDiaDiem, @RequestParam("diaChi") String diachi,
//                                @RequestParam("trangThai") String trangthai, @RequestParam("hinhAnh") String hinhanh,
//                                @RequestParam("slLike")int slLike){
//        address add1 = new address(id, lhService.findByName(tenloaihinh), tenDiaDiem, diachi, trangthai, hinhanh, slLike);
//        try{
//
//            service.saveorupdate(add1);
//            return "access";
//        }
//        catch (Exception e){
//            return "fail";
//        }
//    }
//    @PostMapping("/save")
//    public String newAddress(@RequestParam("tenLoaiHinh") String tenloaihinh,
//                           @RequestParam("tenDiaDiem") String tenDiaDiem, @RequestParam("diaChi") String diachi,
//                           @RequestParam("trangThai") String trangthai, @RequestParam("hinhAnh") String hinhanh){
//        try{
//            loaiHinh loaiHinh1 = lhService.findByName(tenloaihinh);
//            address add1 = new address(loaiHinh1, tenDiaDiem, diachi, trangthai, hinhanh);
//            service.saveorupdate(add1);
//            return "access";
//        }catch (Exception e){
//            return "fail";
//        }
//    }
//    @DeleteMapping("delete")
//    public String delAddress(@RequestParam("tenLoaiHinh") String tenloaihinh,
//                             @RequestParam("tenDiaDiem") String tenDiaDiem, @RequestParam("diaChi") String diachi,
//                             @RequestParam("trangThai") String trangthai, @RequestParam("hinhAnh") String hinhanh){
//        try{
//            address add1 = service.getOne(tenloaihinh, tenDiaDiem, diachi, trangthai, hinhanh);
//            service.delAddress(add1);
//            return "access";
//        }catch (Exception e){
//            return "fail";
//        }
//    }
//    @DeleteMapping("/delete-by-id")
//    public String delById(@RequestParam("id") int id){
//        try{
//            service.delById(id);
//            return "access";
//        }
//        catch (Exception e){
//            return "fail";
//        }
//    }
//    @PostMapping("/search")
//    public List<address> searchAddress(@RequestParam("search")String search){
//        try{
//            return service.searchAddress(search);
//        }
//        catch (Exception e){
//            return null;
//        }
//    }
//}
