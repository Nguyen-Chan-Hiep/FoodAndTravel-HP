package com.example.detaithuctap.Entity.MonAn;

import com.example.detaithuctap.Entity.User.NguoiDung;

import javax.persistence.*;

@Entity
@Table(name = "like_am_thuc")
public class LikeMonAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(targetEntity = MonAn.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_mon_an", referencedColumnName = "id")
    private MonAn monAn;

    @ManyToOne(targetEntity = NguoiDung.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_nguoidung", referencedColumnName = "id")
    private NguoiDung nguoiDung;

    @Column(name = "status")
    private int status;

	public LikeMonAn(MonAn monAn, NguoiDung nguoiDung, int status) {
		super();
		this.monAn = monAn;
		this.nguoiDung = nguoiDung;
		this.status = status;
	}

	public LikeMonAn() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MonAn getMonAn() {
		return monAn;
	}

	public void setMonAn(MonAn monAn) {
		this.monAn = monAn;
	}

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

    
}
