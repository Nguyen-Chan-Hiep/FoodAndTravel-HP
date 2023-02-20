package com.example.detaithuctap.Entity.DuLich;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dia_diem_du_lich")
public class dia_diem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_loai_hinh_du_lich")
    @JsonIgnore
    private loaiHinh idLoaiHinh;
    @Column(name = "ten_dia_diem")
    private String tenDiaDiem;
    @Column(name = "diachi")
    private String diaChi;
    @Column(name = "trangthai")
    private String trangThai;
    @Column(name = "hinhanh")
    private String hinhAnh;

}
