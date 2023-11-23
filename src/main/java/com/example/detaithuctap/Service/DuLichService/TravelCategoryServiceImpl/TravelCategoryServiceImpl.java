package com.example.detaithuctap.Service.DuLichService.TravelCategoryServiceImpl;

import com.example.detaithuctap.Entity.DuLich.TravelCategory;
import com.example.detaithuctap.Repository.DuLichRepository.LoaiHinhReponImpl;
import com.example.detaithuctap.Service.DuLichService.TravelCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class TravelCategoryServiceImpl implements TravelCategoryService {
    @Autowired
    private LoaiHinhReponImpl reponsitory;
    @Override
    public List<TravelCategory> finfAll() {
        return reponsitory.getAll();
    }
    @Override
    public TravelCategory findByName(String tenLoaiHinh) {
        return reponsitory.findByTenLoaiHinh(tenLoaiHinh);
    }
    @Override
    public void newLoaiHinh(TravelCategory loaihinh) {
        reponsitory.saveOrUpdate(loaihinh);
    }
}
