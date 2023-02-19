package com.example.detaithuctap.Entity.MonAn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tg_monan_diadiemanuong")
public class MonAn_DiaDiemAnUong {

    @EmbeddedId
    private MonAn_DiaDiemAnUongKey id;

    @ManyToOne
    @MapsId("monanId")
    @Column(name = "id_mon_an")
    private int idMonAn;

    @ManyToOne
    @MapsId("diadiemId")
    @Column(name = "id_dia_diem")
    private int idDiaDiem;

    @Column(name = "dongia")
    private Double dongia;

    @Column(name = "donvitinh")
    private String donvitinh;

    @Column(name = "motachitietmonan")
    private String motachitietmonan;
}
