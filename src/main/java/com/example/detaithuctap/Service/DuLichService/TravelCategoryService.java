package com.example.detaithuctap.Service.DuLichService;

import com.example.detaithuctap.Entity.DuLich.TravelCategory;

import java.util.List;

public interface TravelCategoryService {
    public List<TravelCategory> finfAll();
    public TravelCategory findByName(String tenLoaiHinh);
    public void newLoaiHinh(TravelCategory loaiHinh);
}