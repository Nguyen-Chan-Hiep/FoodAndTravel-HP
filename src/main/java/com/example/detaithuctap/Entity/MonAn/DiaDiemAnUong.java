package com.example.detaithuctap.Entity.MonAn;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
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
    private Time giomocua;

    @Column(name = "giodongcua")
    private Time giodongcua;

    @Column(name = "motadiadiem")
    private String motadiadiem;

    @ManyToMany(mappedBy = "diaDiemAnUongs")
    @JsonIgnore
    private Set<MonAn> monAns;

}
