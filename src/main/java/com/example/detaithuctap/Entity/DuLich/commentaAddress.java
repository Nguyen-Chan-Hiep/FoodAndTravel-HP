package com.example.detaithuctap.Entity.DuLich;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commentdiadiemdulich")
public class commentaAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "noidung")
    private String noidung;
    @Column(name = "thoigianpost")
    private Date timePost;
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "id_address")
    private int idAddress;

    public commentaAddress(String noidung, Date timePost, int idUser, int idAddress) {
        this.noidung = noidung;
        this.timePost = timePost;
        this.idUser = idUser;
        this.idAddress = idAddress;
    }
}
