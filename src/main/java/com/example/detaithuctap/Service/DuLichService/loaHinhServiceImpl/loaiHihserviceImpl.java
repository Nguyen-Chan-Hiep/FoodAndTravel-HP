//package com.example.detaithuctap.Service.DuLichService.loaHinhServiceImpl;
//
//import com.example.detaithuctap.Entity.DuLich.loaiHinh;
//import com.example.detaithuctap.Repository.DuLichRepository.LoaiHinhReponImpl;
//import com.example.detaithuctap.Service.DuLichService.loaiHinhService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//@Service
//@Transactional
//public class loaiHihserviceImpl implements loaiHinhService {
//    @Autowired
//    private LoaiHinhReponImpl reponsitory;
//    @Override
//    public List<loaiHinh> finfAll() {
//        return reponsitory.getAll();
//    }
//    @Override
//    public loaiHinh findByName(String tenLoaiHinh) {
//        return reponsitory.findByTenLoaiHinh(tenLoaiHinh);
//    }
//    @Override
//    public void newLoaiHinh(loaiHinh loaihinh) {
//        reponsitory.saveOrUpdate(loaihinh);
//    }
//}
