package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface diaDIemReponsitory extends JpaRepository<address, Integer> {
    @Query(value = "select dd.id, dd.id_loai_hinh_du_lich, dd.ten_dia_diem, dd.diachi, dd.trangthai, dd.hinhanh " +
            "from dia_diem_du_lich dd join loai_hinh_du_lich lh on dd.id_loai_hinh_du_lich = lh.id " +
            "where lh.ten_loai_hinh = :name", nativeQuery = true)
    List<address> getListAddress(String name);
    @Query(value = "select dd.id, dd.id_loai_hinh_du_lich, dd.ten_dia_diem, dd.diachi, dd.trangthai, dd.hinhanh " +
            "from dia_diem_du_lich dd join loai_hinh_du_lich lh on dd.id_loai_hinh_du_lich = lh.id " +
            "where lh.ten_loai_hinh = :tenloaihinh and dd.ten_dia_diem = :tenDiaDiem and dd.diachi =:diachi "+
            "and dd.trangthai = :trangthai and dd.hinhanh = :hinhanh ", nativeQuery = true)
    address getOne(String tenloaihinh, String tenDiaDiem, String diachi, String trangthai, String hinhanh);
    @Query(value = "select * from dia_diem_du_lich where ten_dia_diem like :search", nativeQuery = true)
    List<address> search(@Param("search")String search);
}

