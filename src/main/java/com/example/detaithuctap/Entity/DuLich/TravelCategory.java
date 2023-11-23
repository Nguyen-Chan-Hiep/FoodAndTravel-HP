
package com.example.detaithuctap.Entity.DuLich;

import javax.persistence.*;

@Entity
@Table(name = "loai_hinh_du_lich")
public class TravelCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "ten_loai_hinh")
    private String tenLoaiHinh;


    public TravelCategory(String tenLoaiHinh) {
        this.tenLoaiHinh = tenLoaiHinh;
    }

    public TravelCategory(int id, String tenLoaiHinh) {
        this.id = id;
        this.tenLoaiHinh = tenLoaiHinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLoaiHinh() {
        return tenLoaiHinh;
    }

    public void setTenLoaiHinh(String tenLoaiHinh) {
        this.tenLoaiHinh = tenLoaiHinh;
    }

    public TravelCategory() {
    }
}
