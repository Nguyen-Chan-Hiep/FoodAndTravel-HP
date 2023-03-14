package com.example.detaithuctap.Entity.DuLich;

import javax.persistence.*;

@Entity
@Table(name="hotel")
public class hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "hotel_name")
    private String hotel_name;
    @Column(name = "dia_chi")
    private String dia_chi;
    @Column(name = "image")
    private String image;
    @Column(name = "mo_ta")
    private String mo_ta;
    @Column(name = "gia")
    private String gia;
    @Column(name = "dat_cho")
    private String dat_cho;

    public hotel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDat_cho() {
        return dat_cho;
    }

    public void setDat_cho(String dat_cho) {
        this.dat_cho = dat_cho;
    }

    public hotel(int id, String hotel_name, String dia_chi, String image, String mo_ta, String gia, String dat_cho) {
        this.id = id;
        this.hotel_name = hotel_name;
        this.dia_chi = dia_chi;
        this.image = image;
        this.mo_ta = mo_ta;
        this.gia = gia;
        this.dat_cho = dat_cho;
    }
}
