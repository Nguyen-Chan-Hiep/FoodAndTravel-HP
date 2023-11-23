
package com.example.detaithuctap.Entity.DuLich;

import com.example.detaithuctap.Entity.User.NguoiDung;

import javax.persistence.*;

@Entity
@Table(name = "commentdiadiemdulich")
public class CommentAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "noidung")
    private String noidung;
    @Column(name = "thoigianpost")
    private String timePost;
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "user_name")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "id_address")
    private int idAddress;


    public CommentAddress(String noidung, String timePost, int idUser, int idAddress, String userName) {
        this.noidung = noidung;
        this.timePost = timePost;
        this.idUser = idUser;
        this.idAddress = idAddress;
        this.userName = userName;
    }

    public CommentAddress() {
    }

    public CommentAddress(int id, String noidung, String timePost, int idUser, int idAddress, String userName) {
        this.id = id;
        this.noidung = noidung;
        this.timePost = timePost;
        this.idUser = idUser;
        this.idAddress = idAddress;
        this.userName = userName;
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

    public String getTimePost() {
        return timePost;
    }

    public void setTimePost(String timePost) {
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
