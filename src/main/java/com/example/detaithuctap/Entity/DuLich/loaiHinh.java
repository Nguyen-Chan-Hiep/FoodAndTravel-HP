package com.example.detaithuctap.Entity.DuLich;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "loai_hinh_du_lich")
public class loaiHinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "tenLoaiHinh")
    private String tenLoaiHinh;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idLoaiHinh")
    private List<dia_diem> listDiaDiem;
}
