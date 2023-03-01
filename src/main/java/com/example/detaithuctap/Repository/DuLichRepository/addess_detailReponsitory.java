package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.address_detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Time;
import java.util.Optional;

public interface addess_detailReponsitory extends JpaRepository<address_detail, Integer> {
    @Query(value = "SELECT * FROM chi_tiet_dia_diem_du_lich ct WHERE ct.id_dia_diem_du_lich = :id_dd", nativeQuery = true)
    address_detail findByIdAddress(int id_dd);
}
