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
@Table(name = "mon_an")
public class MonAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "tenmonan")
    private String tenmonan;

    public MonAn (String tenmonan, String hinhanh, String mota) {
        this.tenmonan = tenmonan;
        this.hinhanh = hinhanh;
        this.mota = mota;
    }

    @Column(name = "hinhanh")
    private String hinhanh;

    @Column(name = "mota")
    private String mota;
    
    @Column(name = "gioithieu")
    private String gioithieu;
    

	public MonAn(String tenmonan, String hinhanh, String mota, String gioithieu,
			Loai_hinh_am_thuc loai_hinh_am_thuc) {
		super();
		this.tenmonan = tenmonan;
		this.hinhanh = hinhanh;
		this.mota = mota;
		this.gioithieu = gioithieu;

	}


	public MonAn() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public String getGioithieu() {
		return gioithieu;
	}


	public void setGioithieu(String gioithieu) {
		this.gioithieu = gioithieu;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenmonan() {
		return tenmonan;
	}

	public void setTenmonan(String tenmonan) {
		this.tenmonan = tenmonan;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}


	public Loai_hinh_am_thuc getLoai_hinh_am_thuc() {
		return loai_hinh_am_thuc;
	}

	public void setLoai_hinh_am_thuc(Loai_hinh_am_thuc loai_hinh_am_thuc) {
		this.loai_hinh_am_thuc = loai_hinh_am_thuc;
	}

	public List<DiaDiemAnUong> getDiaDiemAnUongs() {
		return diaDiemAnUongs;
	}

	public void setDiaDiemAnUongs(List<DiaDiemAnUong> diaDiemAnUongs) {
		this.diaDiemAnUongs = diaDiemAnUongs;
	}


	@ManyToMany(mappedBy = "monAns", targetEntity = DiaDiemAnUong.class, fetch = FetchType.EAGER)
    private List<DiaDiemAnUong> diaDiemAnUongs;


    @ManyToOne(targetEntity = Loai_hinh_am_thuc.class)
    @JoinColumn(name = "loaihinh_id")
    private Loai_hinh_am_thuc loai_hinh_am_thuc;
}
