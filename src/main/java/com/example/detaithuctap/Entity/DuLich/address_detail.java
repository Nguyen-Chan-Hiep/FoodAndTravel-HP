package com.example.detaithuctap.Entity.DuLich;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chi_tiet_dia_diem_du_lich")
public class address_detail{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "mota")
    private String mota;
    @Column(name = "chi_tiet_hinh_anh")
    private String chi_tiet_hinh_anh;
    @Column(name = "giomocua")
    private String giomocua;
    @Column(name = "giodongcua")
    private String giodongcua;
    @Column(name = "id_dia_diem_du_lich")
    private int address;
    @Column(name = "gia")
    private double gia;

    public address_detail(String mota, String chi_tiet_hinh_anh, String giomocua, String giodongcua, int address, double gia) {
        this.mota = mota;
        this.chi_tiet_hinh_anh = chi_tiet_hinh_anh;
        this.giomocua = giomocua;
        this.giodongcua = giodongcua;
        this.address = address;
        this.gia = gia;
    }
}
