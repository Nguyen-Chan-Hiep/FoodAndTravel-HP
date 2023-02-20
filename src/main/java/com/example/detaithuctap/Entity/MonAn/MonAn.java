package com.example.detaithuctap.Entity.MonAn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mon_an")
public class MonAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "tenmonan")
    private String tenmonan;

    @Column(name = "motachung")
    private String motachung;

    @ManyToMany
    @JoinTable(name = "monan_diadiemanuong", joinColumns = @JoinColumn(name = "id_mon_an", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "id_dia_diem", referencedColumnName = "id"))
    private List<DiaDiemAnUong> diaDiemAnUongs;
}
