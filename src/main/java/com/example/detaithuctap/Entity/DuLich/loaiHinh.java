<<<<<<< HEAD
//package com.example.detaithuctap.Entity.DuLich;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "loai_hinh_du_lich")
//public class loaiHinh {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//    @Column(name = "ten_loai_hinh")
//    private String tenLoaiHinh;
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "loaiHinh")
//    private List<address> listAddress;
//
//    public loaiHinh(String tenLoaiHinh) {
//        this.tenLoaiHinh = tenLoaiHinh;
//    }
//}
=======
package com.example.detaithuctap.Entity.DuLich;

import javax.persistence.*;

@Entity
@Table(name = "loai_hinh_du_lich")
public class loaiHinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "ten_loai_hinh")
    private String tenLoaiHinh;


    public loaiHinh(String tenLoaiHinh) {
        this.tenLoaiHinh = tenLoaiHinh;
    }

    public loaiHinh(int id, String tenLoaiHinh) {
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

    public loaiHinh() {
    }
}
>>>>>>> 1c26b31f3c35d39cbb25370907ac94a19ff8e425
