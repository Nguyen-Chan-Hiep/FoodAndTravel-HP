package com.example.detaithuctap.Entity.MonAn;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dia_diem_an_uong")
public class DiaDiemAnUong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "tendiadiem")
    private String tendiadiem;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "giomocua")
    private String giomocua;

    @Column(name = "giodongcua")
    private String giodongcua;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "monan_diadiemanuong", joinColumns = @JoinColumn(name = "id_dia_diem", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_mon_an", referencedColumnName = "id"))
    @JsonIgnore
    private List<MonAn> monAns;

    public DiaDiemAnUong (String tendiadiem, String diachi, String giomocua, String giodongcua) {
        this.tendiadiem = tendiadiem;
        this.diachi = diachi;
        this.giomocua = giomocua;
        this.giodongcua = giodongcua;
    }
}
