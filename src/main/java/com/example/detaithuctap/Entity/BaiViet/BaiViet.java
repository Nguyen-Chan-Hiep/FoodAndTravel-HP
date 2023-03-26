package com.example.detaithuctap.Entity.BaiViet;

import javax.persistence.*;

@Entity
@Table(name = "bai_viet_cho_phe_duyet")
public class BaiViet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "ten_mon_an_hoac_dia_diem_du_lich")
    private String name;
    @Column(name = "tendiadiem")
    private String tendiadiem;
    @Column(name = "diachi")
    private String diachi;
    @Column(name = "hinhanh")
    private String hinhanh;
    @Column(name = "motadiadiem")
    private String motadiadiem;
    @Column(name = "loahinh")
    private String loaihinh;
    @Column(name = "sdt")
    private String sdt;
    @Column(name = "gia")
    private Double gia;
    @Column(name = "giomocua")
    private String giomocua;
    @Column(name = "giodongcua")
    private String giodongcua;
    @Column(name = "idnguoidung")
    private int idnguoidung;
    @Column(name = "thoigianpost")
    private String thoigianpost;
	public BaiViet(String name, String tendiadiem, String diachi, String hinhanh, String motadiadiem, String loaihinh,
			String sdt, Double gia, String giomocua, String giodongcua, int idnguoidung, String thoigianpost) {
		super();
		this.name = name;
		this.tendiadiem = tendiadiem;
		this.diachi = diachi;
		this.hinhanh = hinhanh;
		this.motadiadiem = motadiadiem;
		this.loaihinh = loaihinh;
		this.sdt = sdt;
		this.gia = gia;
		this.giomocua = giomocua;
		this.giodongcua = giodongcua;
		this.idnguoidung = idnguoidung;
		this.thoigianpost = thoigianpost;
	}
	public BaiViet() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMotadiadiem() {
		return motadiadiem;
	}
	public void setMotadiadiem(String motadiadiem) {
		this.motadiadiem = motadiadiem;
	}
	public String getLoaihinh() {
		return loaihinh;
	}
	public void setLoaihinh(String loaihinh) {
		this.loaihinh = loaihinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public Double getGia() {
		return gia;
	}
	public void setGia(Double gia) {
		this.gia = gia;
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
	public int getIdnguoidung() {
		return idnguoidung;
	}
	public void setIdnguoidung(int idnguoidung) {
		this.idnguoidung = idnguoidung;
	}
	public String getThoigianpost() {
		return thoigianpost;
	}
	public void setThoigianpost(String thoigianpost) {
		this.thoigianpost = thoigianpost;
	}


}
