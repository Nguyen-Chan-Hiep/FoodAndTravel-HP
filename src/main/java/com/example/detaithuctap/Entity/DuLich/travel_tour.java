package com.example.detaithuctap.Entity.DuLich;

import javax.persistence.*;

@Entity
@Table(name="travel_tour")
public class travel_tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "dia_diem")
    private String dia_diem;
    @Column(name = "so_ngay")
    private int so_ngay;
    @Column(name = "gia")
    private double gia;
    @Column(name = "lich_trinh")
    private String lich_trinh;
    @Column(name = "image")
    private String image;
    @Column(name = "dat_tour")
    private String dat_tour;

    public travel_tour() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia_diem() {
        return dia_diem;
    }

    public void setDia_diem(String dia_diem) {
        this.dia_diem = dia_diem;
    }

    public int getSo_ngay() {
        return so_ngay;
    }

    public void setSo_ngay(int so_ngay) {
        this.so_ngay = so_ngay;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getLich_trinh() {
        return lich_trinh;
    }

    public void setLich_trinh(String lich_trinh) {
        this.lich_trinh = lich_trinh;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDat_tour() {
        return dat_tour;
    }

    public void setDat_tour(String dat_tour) {
        this.dat_tour = dat_tour;
    }

    public travel_tour(int id, String dia_diem, int so_ngay, double gia, String lich_trinh, String image, String dat_tour) {
        this.id = id;
        this.dia_diem = dia_diem;
        this.so_ngay = so_ngay;
        this.gia = gia;
        this.lich_trinh = lich_trinh;
        this.image = image;
        this.dat_tour = dat_tour;
    }
}
