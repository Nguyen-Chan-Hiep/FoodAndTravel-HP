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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "id_mon_an")
    private Long idMonAn;

    @Column(name = "id_dia_diem")
    private Long idDiaDiem;

    @Column(name = "dongia")
    private Double dongia;

    @Column(name = "donvitinh")
    private String donvitinh;

    @Column(name = "motachitietmonan")
    private String motachitietmonan;
}
