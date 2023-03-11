package com.example.detaithuctap.Entity.DuLich;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public liked_address(int idUser, int idAddress) {
        this.idUser = idUser;
        this.idAddress = idAddress;
    }
}