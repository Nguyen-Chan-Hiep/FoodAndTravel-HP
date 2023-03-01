package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.address;
import com.example.detaithuctap.Entity.DuLich.loaiHinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface loaiHinhReponsitory extends JpaRepository<loaiHinh, Integer> {
    loaiHinh findByTenLoaiHinh(String tenLoaiHinh);
}
