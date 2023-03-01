package com.example.detaithuctap.Entity.BaiViet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bai_viet_cho_phe_duyet")
public class BaiViet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "ten_mon_an_hoac_dia_diem_du_lich")
    private String name;
    @Column(name = "tendiadiem")
    private String tendiadiem;
    @Column(name = "diachi")
    private String diachi;
    @Column(name = "hinhanh")
    private String hinhanh;
    @Column(name = "motadiadiem")
    private String motadiadiem;
    @Column(name = "loaihinh")
    private String loaihinh;
    @Column(name = "sdt")
    private String sdt;
    @Column(name = "gia")
    private Double gia;
    @Column(name = "giomocua")
    private String giomocua;
    @Column(name = "giodongcua")
    private String giodongcua;
    @Column(name = "idnguoidung")
    private int idnguoidung;
    @Column(name = "thoigianpost")
    private String thoigianpost;


}
