package com.example.detaithuctap.Entity.tintuc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tin_tuc")
public class news {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "tieu_de_tin_tuc")
    public String tieuDe;
    @Column(name = "noi_dung_tin_tuc")
    private String noidung;
    @Column(name = "thoigianpost")
    private Date timnepost;
    @Column(name = "id_user")
    private int idUser;

    public news(String tieuDe, String noidung, Date timnepost, int idUser) {
        this.tieuDe = tieuDe;
        this.noidung = noidung;
        this.timnepost = timnepost;
        this.idUser = idUser;
    }
}
