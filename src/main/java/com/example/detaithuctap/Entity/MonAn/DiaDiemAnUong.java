package com.example.detaithuctap.Entity.MonAn;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "dia_diem_an_uong")
public class DiaDiemAnUong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dia_diem")
    private int id;

    @Column(name = "tendiadiem")
    private String tendiadiem;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "hinhanh")
    private String hinhanh;

    @Column(name = "giomocua")
    private String giomocua;

    @Column(name = "giodongcua")
    private String giodongcua;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "monan_diadiemanuong", joinColumns = @JoinColumn(name = "id_dia_diem", referencedColumnName = "id_dia_diem"),
            inverseJoinColumns = @JoinColumn(name = "id_mon_an", referencedColumnName = "id"))
    @JsonIgnore
    private List<MonAn> monAns;

    public DiaDiemAnUong (String tendiadiem, String diachi, String giomocua, String giodongcua) {
        this.tendiadiem = tendiadiem;
        this.diachi = diachi;
        this.giomocua = giomocua;
        this.giodongcua = giodongcua;
    }
    

	public DiaDiemAnUong() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTendiadiem() {
		return tendiadiem;
	}

	public void setTendiadiem(String tendiadiem) {
		this.tendiadiem = tendiadiem;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getGiomocua() {
		return giomocua;
	}

	public void setGiomocua(String giomocua) {
		this.giomocua = giomocua;
	}

	public String getGiodongcua() {
		return giodongcua;
	}

	public void setGiodongcua(String giodongcua) {
		this.giodongcua = giodongcua;
	}

	public List<MonAn> getMonAns() {
		return monAns;
	}

	public void setMonAns(List<MonAn> monAns) {
		this.monAns = monAns;
	}
    
    
}
