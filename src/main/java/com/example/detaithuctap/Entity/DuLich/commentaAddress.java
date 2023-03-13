package com.example.detaithuctap.Entity.DuLich;

import javax.persistence.*;
import java.util.Date;

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

    public commentaAddress() {
    }

    public commentaAddress(int id, String noidung, Date timePost, int idUser, int idAddress) {
        this.id = id;
        this.noidung = noidung;
        this.timePost = timePost;
        this.idUser = idUser;
        this.idAddress = idAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public Date getTimePost() {
        return timePost;
    }

    public void setTimePost(Date timePost) {
        this.timePost = timePost;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }
}
