package com.example.detaithuctap.Entity.MonAn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "monan_diadiemanuong")
public class monan_diadiemanuong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "id_mon_an")
    private int id_mon_an;
    @Column(name = "id_dia_diem")
    private int id_dia_diem;
    @Column(name = "dongia")
    private Double dongia;
    @Column(name = "chitietmonan")
    private String chitietmonan;

    public monan_diadiemanuong (int id_mon_an, int id_dia_diem, Double dongia, String chitietmonan) {
        this.id_mon_an = id_mon_an;
        this.id_dia_diem = id_dia_diem;
        this.dongia = dongia;
        this.chitietmonan = chitietmonan;
    }
}
