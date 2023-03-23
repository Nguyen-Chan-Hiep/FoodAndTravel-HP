//package com.example.detaithuctap.Entity.DuLich;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "adress_detail")
//public class address_detail{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//    @Column(name = "mota")
//    private String mota;
//    @Column(name = "chi_tiet_hinh_anh")
//    private String chi_tiet_hinh_anh;
//    @Column(name = "giomocua")
//    private String giomocua;
//    @Column(name = "giodongcua")
//    private String giodongcua;
//    @Column(name = "id_dia_diem_du_lich")
//    private int address;
//    @Column(name = "dich_vu")
//    private String dichVu;
//    @Column(name = "gia")
//    private String gia;
//
//    public address_detail(String mota, String chi_tiet_hinh_anh, String giomocua, String giodongcua, int address, String gia) {
//        this.mota = mota;
//        this.chi_tiet_hinh_anh = chi_tiet_hinh_anh;
//        this.giomocua = giomocua;
//        this.giodongcua = giodongcua;
//        this.address = address;
//        this.gia = gia;
//    }
//
//    public address_detail(int id, String mota, String chi_tiet_hinh_anh, String giomocua, String giodongcua, int address, String dichVu, String gia) {
//        this.id = id;
//        this.mota = mota;
//        this.chi_tiet_hinh_anh = chi_tiet_hinh_anh;
//        this.giomocua = giomocua;
//        this.giodongcua = giodongcua;
//        this.address = address;
//        this.dichVu = dichVu;
//        this.gia = gia;
//    }
//
//    public address_detail() {
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setMota(String mota) {
//        this.mota = mota;
//    }
//
//    public void setChi_tiet_hinh_anh(String chi_tiet_hinh_anh) {
//        this.chi_tiet_hinh_anh = chi_tiet_hinh_anh;
//    }
//
//    public void setGiomocua(String giomocua) {
//        this.giomocua = giomocua;
//    }
//
//    public void setGiodongcua(String giodongcua) {
//        this.giodongcua = giodongcua;
//    }
//
//    public void setAddress(int address) {
//        this.address = address;
//    }
//
//    public void setDichVu(String dichVu) {
//        this.dichVu = dichVu;
//    }
//
//    public void setGia(String gia) {
//        this.gia = gia;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getMota() {
//        return mota;
//    }
//
//    public String getChi_tiet_hinh_anh() {
//        return chi_tiet_hinh_anh;
//    }
//
//    public String getGiomocua() {
//        return giomocua;
//    }
//
//    public String getGiodongcua() {
//        return giodongcua;
//    }
//
//    public int getAddress() {
//        return address;
//    }
//
//    public String getDichVu() {
//        return dichVu;
//    }
//
//    public String getGia() {
//        return gia;
//    }
//}
