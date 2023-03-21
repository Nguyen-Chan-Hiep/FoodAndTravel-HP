package com.example.detaithuctap.Entity.MonAn;

import com.example.detaithuctap.Entity.User.NguoiDung;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "binh_luan_ve_mon_an")
public class NhanXetMonAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "noidung")
    private String noidung;
    @Column(name = "hinhAnhMonAnNguoiDungChup")
    private String hinhAnhMonAnNguoiDungChup;
    @Column(name = "star")
    private int star;
    @ManyToOne(targetEntity = monan_diadiemanuong.class)
    @JoinColumn(name = "monan_id")
    @JsonIgnore
    private monan_diadiemanuong monan_diadiemanuong;
    @ManyToOne(targetEntity = NguoiDung.class)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private NguoiDung user;
    @Column(name = "thoigianpost")
    private String thoigianpost;
    @Column(name = "thoigianUpdate")
    private String thoigianUpdate;

    public NhanXetMonAn (String noidung, String hinhAnhMonAnNguoiDungChup, int star, monan_diadiemanuong monan_diadiemanuong, NguoiDung user, String thoigianpost, String thoigianUpdate) {
        this.noidung = noidung;
        this.hinhAnhMonAnNguoiDungChup = hinhAnhMonAnNguoiDungChup;
        this.star = star;
        this.monan_diadiemanuong = monan_diadiemanuong;
        this.user = user;
        this.thoigianpost = thoigianpost;
        this.thoigianUpdate = thoigianUpdate;
    }

	public NhanXetMonAn() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public monan_diadiemanuong getMonan_diadiemanuong() {
		return monan_diadiemanuong;
	}

	public void setMonan_diadiemanuong(monan_diadiemanuong monan_diadiemanuong) {
		this.monan_diadiemanuong = monan_diadiemanuong;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getHinhAnhMonAnNguoiDungChup() {
		return hinhAnhMonAnNguoiDungChup;
	}

	public void setHinhAnhMonAnNguoiDungChup(String hinhAnhMonAnNguoiDungChup) {
		this.hinhAnhMonAnNguoiDungChup = hinhAnhMonAnNguoiDungChup;
	}

	public NguoiDung getUser() {
		return user;
	}

	public void setUser(NguoiDung user) {
		this.user = user;
	}

	public String getThoigianpost() {
		return thoigianpost;
	}

	public void setThoigianpost(String thoigianpost) {
		this.thoigianpost = thoigianpost;
	}

	public String getThoigianUpdate() {
		return thoigianUpdate;
	}

	public void setThoigianUpdate(String thoigianUpdate) {
		this.thoigianUpdate = thoigianUpdate;
	}
    
    
}
