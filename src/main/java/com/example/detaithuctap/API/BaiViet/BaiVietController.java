//package com.example.detaithuctap.API.BaiViet;
//
//import com.example.detaithuctap.Entity.BaiViet.BaiViet;
//import com.example.detaithuctap.Service.BaiViet.BaiVietService;
//import com.example.detaithuctap.Service.MonAn.DiaDiemAnUongService;
//import com.example.detaithuctap.Service.MonAn.MonAnService;
//import com.example.detaithuctap.Service.NguoiDung.NguoiDungService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/bai-viet")
//public class BaiVietController {
//
//    @Autowired
//    private BaiVietService baiVietService;
//    @Autowired
//    private MonAnService monAnService;
//    @Autowired
//    private DiaDiemAnUongService diaDiemAnUongService;
//    @Autowired
//    private NguoiDungService nguoiDungService;
//
//
//    @PostMapping (value = "/them-bai-viet")
//    public BaiViet saveBaiViet(@RequestBody BaiViet baiViet){
////        baiVietService.saveOrUpdate (baiViet);
//        return baiViet;
//
//    }
//
//    @PostMapping(value = "/phe-duyet-bai-viet/{id}")
//    public void pheduyet(@PathVariable("id")int idBaiViet){
//        BaiViet baiViet = baiVietService.getById (idBaiViet);
//        String s = String.valueOf (baiViet.getThoigianpost ());
////        if(baiViet.getLoaihinh ().equals ("Ẩm thực")){
////            MonAn monAn = new MonAn (baiViet.getName (), baiViet.getHinhanh (), new ConvertVietnamese().convert(baiViet.getName ()), 0);
////            monAnService.saveOrUpdate (monAn);
////            DiaDiemAnUong diaDiemAnUong = new DiaDiemAnUong (baiViet.getTendiadiem (), baiViet.getDiachi (), baiViet.getGiomocua (), baiViet.getGiodongcua ());
////            diaDiemAnUongService.saveOrUpdate (diaDiemAnUong);
////            monAnService.saveTg (monAn.getId (), diaDiemAnUong.getId (), baiViet.getGia (), baiViet.getMotadiadiem ());
////        }
////        else{
////            loaiHinh loaiHinh = loaiHinhService.findByName(baiViet.getLoahinh ());
////            address address = new address(loaiHinh, baiViet.getTendiadiem (), baiViet.getDiachi (),
////                    "Đang hoạt động", baiViet.getHinhanh ());
////            diaDiemService.saveorupdate(address);
////        }
//
////        baiVietService.delete (idBaiViet);
//    }
//
//}
