package com.example.detaithuctap.Entity.MonAn;

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
@Table(name="loai_hinh_mon_an")
public class Loai_hinh_am_thuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "ten_loai_hinh")
    private String ten_loai_hinh;

    @OneToMany(mappedBy = "loai_hinh_am_thuc", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<MonAn> monAns;
}
