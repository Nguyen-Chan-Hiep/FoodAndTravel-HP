package com.example.detaithuctap.Entity.MonAn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "monan_diadiemanuong")
public class monan_diadiemanuong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "id_mon_an")
    private int id_mon_an;
    @Column(name = "id_dia_diem")
    private int id_dia_diem;
    @Column(name = "dongia")
    private Double dongia;
    @Column(name = "chitietmonan")
    private String chitietmonan;
    @Column(name = "soluonglike")
    private int soluonglike;
    
    @OneToMany(mappedBy = "monan_diadiemanuong")
    private List<NhanXetMonAn> nhanXetMonAns;

    public monan_diadiemanuong (int id_mon_an, int id_dia_diem, Double dongia, String chitietmonan, int soluonglike) {
        this.id_mon_an = id_mon_an;
        this.id_dia_diem = id_dia_diem;
        this.dongia = dongia;
        this.chitietmonan = chitietmonan;
        this.soluonglike = soluonglike;
    }

	public monan_diadiemanuong() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_mon_an() {
		return id_mon_an;
	}

	public void setId_mon_an(int id_mon_an) {
		this.id_mon_an = id_mon_an;
	}

	public int getId_dia_diem() {
		return id_dia_diem;
	}

	public void setId_dia_diem(int id_dia_diem) {
		this.id_dia_diem = id_dia_diem;
	}

	public Double getDongia() {
		return dongia;
	}

	public void setDongia(Double dongia) {
		this.dongia = dongia;
	}

	public String getChitietmonan() {
		return chitietmonan;
	}

	public void setChitietmonan(String chitietmonan) {
		this.chitietmonan = chitietmonan;
	}

	public int getSoluonglike() {
		return soluonglike;
	}

	public void setSoluonglike(int soluonglike) {
		this.soluonglike = soluonglike;
	}
    
}
