package com.example.detaithuctap.Entity.Comment.MonAn;

import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.User.NguoiDung;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "binh_luan_ve_mon_an")
public class NhanXetMonAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "noidung")
    private String noidung;
    @Column(name = "hinhAnhMonAnNguoiDungChup")
    private String hinhAnhMonAnNguoiDungChup;
    @ManyToOne(targetEntity = MonAn.class)
    @JoinColumn(name = "monan_id")
    @JsonIgnore
    private MonAn monAn;
    @ManyToOne(targetEntity = NguoiDung.class)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private NguoiDung user;
    @Column(name = "thoigianpost")
    private String thoigianpost;
    @Column(name = "thoigianUpdate")
    private String thoigianUpdate;

    public NhanXetMonAn (String noidung, String hinhAnhMonAnNguoiDungChup, MonAn monAn, NguoiDung user, String thoigianpost, String thoigianUpdate) {
        this.id = 0;
        this.noidung = noidung;
        this.hinhAnhMonAnNguoiDungChup = hinhAnhMonAnNguoiDungChup;
        this.monAn = monAn;
        this.user = user;
        this.thoigianpost = thoigianpost;
        this.thoigianUpdate = thoigianUpdate;
    }
}
