
package com.example.detaithuctap.Entity.tintuc;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tin_tuc")
public class news {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "tieu_de_tin_tuc")
    private String tieuDe;
    @Column(name = "image")
    private String image;
    @Column(name = "loai_hinh")
    private String loaiHinh;
    @Column(name = "thoigianpost")
    private String timnepost;
    @Column(name = "noi_dung_tin_tuc")
    private String noiDung;
    @Column(name = "chi_tiet_hinh_anh")
    private String hinhAnhChiTiet;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public news() {
    }

    public news(int id, String tieuDe, String image, String loaiHinh, String timnepost, String noiDung, String hinhAnhChiTiet) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.image = image;
        this.loaiHinh = loaiHinh;
        this.timnepost = timnepost;
        this.noiDung = noiDung;
        this.hinhAnhChiTiet = hinhAnhChiTiet;
    }

    public news(String tieuDe, String image, String loaiHinh, String noiDung, String hinhAnhChiTiet) {
        this.tieuDe = tieuDe;
        this.image = image;
        this.loaiHinh = loaiHinh;
        this.noiDung = noiDung;
        this.hinhAnhChiTiet = hinhAnhChiTiet;
    }

    public news(String tieuDe, String image, String loaiHinh, String timnepost, String noiDung, String hinhAnhChiTiet) {
        this.tieuDe = tieuDe;
        this.image = image;
        this.loaiHinh = loaiHinh;
        this.timnepost = timnepost;
        this.noiDung = noiDung;
        this.hinhAnhChiTiet = hinhAnhChiTiet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getLoaiHinh() {
        return loaiHinh;
    }

    public void setLoaiHinh(String loaiHinh) {
        this.loaiHinh = loaiHinh;
    }

    public String getTimnepost() {
        return timnepost;
    }

    public void setTimnepost(String timnepost) {
        this.timnepost = timnepost;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getHinhAnhChiTiet() {
        return hinhAnhChiTiet;
    }

    public void setHinhAnhChiTiet(String hinhAnhChiTiet) {
        this.hinhAnhChiTiet = hinhAnhChiTiet;
    }
}