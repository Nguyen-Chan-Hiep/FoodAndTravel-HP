package com.example.detaithuctap.Entity.DuLich;

import javax.persistence.*;

@Entity
@Table(name="address_travel")
public class address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "id_loai_hinh_du_lich")
    private int loaiHinh;
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

    public address(int id, int loaiHinh, String tenDiaDiem, String diaChi, String trangThai, String hinhAnh, int slLike) {
        this.id = id;
        this.loaiHinh = loaiHinh;
        this.tenDiaDiem = tenDiaDiem;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
        this.hinhAnh = hinhAnh;
        this.slLike = slLike;
    }

    public address(int loaiHinh, String tenDiaDiem, String diaChi, String trangThai, String hinhAnh, int slLike) {
        this.loaiHinh = loaiHinh;
        this.tenDiaDiem = tenDiaDiem;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
        this.hinhAnh = hinhAnh;
        this.slLike = slLike;
    }

    public address() {
    }

    public int getId() {
        return id;
    }

    public int getLoaiHinh() {
        return loaiHinh;
    }

    public String getTenDiaDiem() {
        return tenDiaDiem;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public int getSlLike() {
        return slLike;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLoaiHinh(int loaiHinh) {
        this.loaiHinh = loaiHinh;
    }

    public void setTenDiaDiem(String tenDiaDiem) {
        this.tenDiaDiem = tenDiaDiem;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public void setSlLike(int slLike) {
        this.slLike = slLike;
    }
}