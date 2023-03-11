package com.example.detaithuctap.Entity.DuLich;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dia_diem_du_lich")
public class address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_loai_hinh_du_lich")
    @JsonIgnore
    private loaiHinh loaiHinh;
    @Column(name = "ten_dia_diem")
    private String tenDiaDiem;
    @Column(name = "diachi")
    private String diaChi;
    @Column(name = "trangthai")
    private String trangThai;
    @Column(name = "hinhanh")
    private String hinhAnh;
    @Column(name = "sl_like")
    public int slLike;

    public address(com.example.detaithuctap.Entity.DuLich.loaiHinh loaiHinh, String tenDiaDiem, String diaChi, String trangThai, String hinhAnh, int slLike) {
        this.loaiHinh = loaiHinh;
        this.tenDiaDiem = tenDiaDiem;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
        this.hinhAnh = hinhAnh;
        this.slLike = slLike;
    }

    public address(com.example.detaithuctap.Entity.DuLich.loaiHinh loaiHinh, String tenDiaDiem, String diaChi, String trangThai, String hinhAnh) {
        this.loaiHinh = loaiHinh;
        this.tenDiaDiem = tenDiaDiem;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
        this.hinhAnh = hinhAnh;
    }
}