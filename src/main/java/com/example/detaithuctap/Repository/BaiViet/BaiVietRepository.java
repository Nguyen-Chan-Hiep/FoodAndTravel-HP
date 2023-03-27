package com.example.detaithuctap.Repository.BaiViet;

import com.example.detaithuctap.Entity.BaiViet.BaiViet;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaiVietRepository implements BaseRepository<BaiViet> {
    @Autowired
    private SessionFactory sessionFactory;
    @SuppressWarnings("unchecked")
	@Override
    public List<BaiViet> getAll () {
        return sessionFactory.getCurrentSession().createQuery("from BaiViet").list();
    }

    @Override
    public void saveOrUpdate (BaiViet baiViet) {
        sessionFactory.getCurrentSession ().saveOrUpdate (baiViet);
    }

    public void themBaiViet(BaiViet baiViet){
        sessionFactory.getCurrentSession().createNativeQuery("INSERT INTO bai_viet_cua_nguoi_dung " +
                "(id, ten_mon_an_hoac_dia_diem_du_lich, tendiadiem, diachi, hinhanh, motadiadiem, " +
                "loahinh, sdt, gia, giomocua, `iodongcua, idnguoidung, thoigianpost) VALUES " +
                "(:id, :ten, :diadiem, :diachi, :hinhanh, :motadiadiem, :loahinh, :sdt, :gia, :giomocua" +
                ", :giodongcua, , :idnguoidung, :thoigianpost)").setParameter("id", baiViet.getId())
                .setParameter("ten", baiViet.getName())
                .setParameter("diadiem", baiViet.getTendiadiem())
                .setParameter("diachi", baiViet.getDiachi())
                .setParameter("hinhanh", baiViet.getHinhanh())
                .setParameter("motadiadiem", baiViet.getMotadiadiem())
                .setParameter("loahinh", baiViet.getLoaihinh())
                .setParameter("sdt", baiViet.getSdt())
                .setParameter("gia", baiViet.getGia())
                .setParameter("giomocua", baiViet.getGiomocua())
                .setParameter("giodongcua", baiViet.getGiodongcua())
                .setParameter("idnguoidung", baiViet.getIdnguoidung())
                .setParameter("thoigianpost", baiViet.getThoigianpost());
    }

    @Override
    public void delete (int id) {
        sessionFactory.getCurrentSession ().createNativeQuery ("delete from bai_viet_cho_phe_duyet where id = :id", BaiViet.class)
                .setParameter ("id", id).executeUpdate ();
    }


    @Override
    public BaiViet getById (int id) {
        return (BaiViet) sessionFactory.getCurrentSession ().createQuery ("from BaiViet where id = :id")
                .setParameter ("id", id).getSingleResult ();
    }

    @Override
    public BaiViet getByName (String name) {
        return null;
    }
    

    public List<BaiViet> getList(int id){
	   List<BaiViet> list = sessionFactory.getCurrentSession().createNativeQuery("SELECT * FROM bai_viet_cua_nguoi_dung where idnguoidung = 4", BaiViet.class)
			   .getResultList();
       return list;
   }
}
