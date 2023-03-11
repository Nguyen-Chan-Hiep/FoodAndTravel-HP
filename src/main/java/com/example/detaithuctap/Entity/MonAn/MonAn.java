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
@Table(name = "mon_an")
public class MonAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "tenmonan")
    private String tenmonan;

    public MonAn (String tenmonan, String hinhanh, String mota, int soluonglike) {
        this.tenmonan = tenmonan;
        this.hinhanh = hinhanh;
        this.mota = mota;
        this.soluonglike = soluonglike;
    }

    @Column(name = "hinhanh")
    private String hinhanh;

    @Column(name = "mota")
    private String mota;
    
    @Column(name = "gioithieu")
    private String gioithieu;

    @Column(name = "soluonglike")
    private int soluonglike;
    

	public MonAn(String tenmonan, String hinhanh, String mota, String gioithieu, int soluonglike,
			Loai_hinh_am_thuc loai_hinh_am_thuc) {
		super();
		this.tenmonan = tenmonan;
		this.hinhanh = hinhanh;
		this.mota = mota;
		this.gioithieu = gioithieu;
		this.soluonglike = soluonglike;
		this.loai_hinh_am_thuc = loai_hinh_am_thuc;
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

	public int getSoluonglike() {
		return soluonglike;
	}

	public void setSoluonglike(int soluonglike) {
		this.soluonglike = soluonglike;
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

	public List<NhanXetMonAn> getNhanxetMonAns() {
		return nhanxetMonAns;
	}

	public void setNhanxetMonAns(List<NhanXetMonAn> nhanxetMonAns) {
		this.nhanxetMonAns = nhanxetMonAns;
	}

	public List<LikeMonAn> getLikeMonAns() {
		return likeMonAns;
	}

	public void setLikeMonAns(List<LikeMonAn> likeMonAns) {
		this.likeMonAns = likeMonAns;
	}

	@ManyToMany(mappedBy = "monAns", targetEntity = DiaDiemAnUong.class, fetch = FetchType.EAGER)
    private List<DiaDiemAnUong> diaDiemAnUongs;

    @OneToMany(mappedBy = "monAn")
    @JsonIgnore
    private List<NhanXetMonAn> nhanxetMonAns;

    @OneToMany(mappedBy = "monAn")
    @JsonIgnore
    private List<LikeMonAn> likeMonAns;

    @ManyToOne(targetEntity = Loai_hinh_am_thuc.class)
    @JoinColumn(name = "loaihinh_id")
    private Loai_hinh_am_thuc loai_hinh_am_thuc;
}
