package com.example.detaithuctap.Entity.Yeu_Thich.MonAn;

import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.User.NguoiDung;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "like_am_thuc")
public class LikeMonAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(targetEntity = MonAn.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_mon_an", referencedColumnName = "id")
    private MonAn monAn;

    @ManyToOne(targetEntity = NguoiDung.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_nguoidung", referencedColumnName = "id")
    private NguoiDung nguoiDung;

    @Column(name = "status")
    private int status;


}
