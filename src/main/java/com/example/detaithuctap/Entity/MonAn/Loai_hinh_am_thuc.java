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
@Table(name="loai_hinh_mon_an")
public class Loai_hinh_am_thuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "ten_loai_hinh")
    private String ten_loai_hinh;
    
    

    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTen_loai_hinh() {
		return ten_loai_hinh;
	}



	public void setTen_loai_hinh(String ten_loai_hinh) {
		this.ten_loai_hinh = ten_loai_hinh;
	}



	public List<MonAn> getMonAns() {
		return monAns;
	}



	public void setMonAns(List<MonAn> monAns) {
		this.monAns = monAns;
	}



	public Loai_hinh_am_thuc() {
		super();
	}



	public Loai_hinh_am_thuc(String ten_loai_hinh, List<MonAn> monAns) {
		super();
		this.ten_loai_hinh = ten_loai_hinh;
		this.monAns = monAns;
	}



	@OneToMany(mappedBy = "loai_hinh_am_thuc", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<MonAn> monAns;
}
