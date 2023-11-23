package com.example.detaithuctap.Entity.DuLich;

import java.util.List;

public class DetailModel {
    private int id;
    private String mota;
    private List<String> chi_tiet_hinh_anh;
    private String giomocua;
    private String giodongcua;
    private int address;
    private String dichVu;
    private String gia;

    public DetailModel(int id, String mota, List<String> chi_tiet_hinh_anh, String giomocua, String giodongcua, int address, String dichVu, String gia) {
        this.id = id;
        this.mota = mota;
        this.chi_tiet_hinh_anh = chi_tiet_hinh_anh;
        this.giomocua = giomocua;
        this.giodongcua = giodongcua;
        this.address = address;
        this.dichVu = dichVu;
        this.gia = gia;
    }

    public DetailModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public List<String> getChi_tiet_hinh_anh() {
        return chi_tiet_hinh_anh;
    }

    public void setChi_tiet_hinh_anh(List<String> chi_tiet_hinh_anh) {
        this.chi_tiet_hinh_anh = chi_tiet_hinh_anh;
    }

    public String getGiomocua() {
        return giomocua;
    }

    public void setGiomocua(String giomocua) {
        this.giomocua = giomocua;
    }

    public String getGiodongcua() {
        return giodongcua;
    }

    public void setGiodongcua(String giodongcua) {
        this.giodongcua = giodongcua;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
