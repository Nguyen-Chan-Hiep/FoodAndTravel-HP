package com.example.detaithuctap.Entity.MonAn;

import com.example.detaithuctap.Entity.Comment.MonAn.NhanXetMonAn;
import com.example.detaithuctap.Entity.Yeu_Thich.MonAn.LikeMonAn;
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

    @Column(name = "soluonglike")
    private int soluonglike;

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
