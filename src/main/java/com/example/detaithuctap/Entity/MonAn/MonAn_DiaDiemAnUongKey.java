package com.example.detaithuctap.Entity.MonAn;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MonAn_DiaDiemAnUongKey implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column (name = "id_mon_an")
    private int monanId;

    @Column(name = "id_dia_diem")
    private int diadiemId;
}
