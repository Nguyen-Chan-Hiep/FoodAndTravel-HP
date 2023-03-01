package com.example.detaithuctap.Entity.User;

import com.example.detaithuctap.Entity.Comment.MonAn.NhanXetMonAn;
import com.example.detaithuctap.Entity.Yeu_Thich.MonAn.LikeMonAn;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "tendaidien")
    private String tendaidien;
    @Column(name = "anhdaidien")
    private String anhdaidien;
    @Column(name = "quyen")
    private String quyen;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<NhanXetMonAn> nhanXetMonAns;

    @OneToMany(mappedBy = "nguoiDung")
    @JsonIgnore
    private List<LikeMonAn> likeMonAns;
}
