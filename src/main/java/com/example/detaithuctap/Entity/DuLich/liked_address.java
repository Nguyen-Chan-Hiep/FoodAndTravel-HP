package com.example.detaithuctap.Entity.DuLich;

import javax.persistence.*;

@Entity
@Table(name = "liked_diadiem")
public class liked_address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "id_dia_diem")
    private int idAddress;

    public liked_address() {
    }

    public liked_address(int id, int idUser, int idAddress) {
        this.id = id;
        this.idUser = idUser;
        this.idAddress = idAddress;
    }

    public liked_address(int idUser, int idAddress) {
        this.idUser = idUser;
        this.idAddress = idAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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