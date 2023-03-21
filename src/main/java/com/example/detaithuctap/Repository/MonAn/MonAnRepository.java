package com.example.detaithuctap.Repository.MonAn;

import com.example.detaithuctap.Entity.MonAn.Loai_hinh_am_thuc;
import com.example.detaithuctap.Entity.MonAn.monan_diadiemanuong;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.Id;

@Repository
public class MonAnRepository implements BaseRepository<MonAn> {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<MonAn> getAll () {
        return sessionFactory.getCurrentSession ().createNativeQuery ("select * from mon_an", MonAn.class)
                .list ();
    }

    public void saveOrUpdate(MonAn t){
        sessionFactory.getCurrentSession ().saveOrUpdate (t);
    }

    public void delete(int t){
        sessionFactory.getCurrentSession ().delete (t);
    }

    @Override
    public MonAn getById (int id) {
        return (MonAn) sessionFactory.getCurrentSession ().createQuery ("from MonAn where id = :id")
                .setParameter ("id", id).getSingleResult ();
    }

    @Override
    public MonAn getByName (String name) {
        return (MonAn) sessionFactory.getCurrentSession ().createNativeQuery ("select * from mon_an where " +
                "mota like'%"+name+"%'", MonAn.class).getSingleResult ();
    }


    public void saveTg(int id_mon_an,int id_dia_diem, Double dongia,String chitietmonan){
        monan_diadiemanuong monan_diadiemanuong = new monan_diadiemanuong (id_mon_an, id_dia_diem, dongia, chitietmonan, 0);
        sessionFactory.getCurrentSession ().saveOrUpdate (monan_diadiemanuong);
    }

    public List<MonAn> getListMonAnByIdLoaiHinh(Loai_hinh_am_thuc id_loai_hinh){
        try{
            return (List<MonAn>) sessionFactory.getCurrentSession ().createNativeQuery ("select * from mon_an where loaihinh_id = :loai_hinh_am_thuc", MonAn.class)
                    .setParameter ("loai_hinh_am_thuc", id_loai_hinh).list ();
        }catch (Exception e){
            return null;
        }

    }
    
    public monan_diadiemanuong getMonan_diadiemanuong(int idmonan, int iddiadiem) {
    	try {
			return (monan_diadiemanuong) sessionFactory.getCurrentSession().createQuery("from monan_diadiemanuong where id_mon_an=:id_mon_an and id_dia_diem=:id_dia_diem")
					.setParameter("id_mon_an", idmonan).setParameter("id_dia_diem", iddiadiem).getSingleResult();
		} catch (Exception e) {
			return null;
		}
    }
    
    public monan_diadiemanuong getMonan_diadiemanuong(int id) {
    	try {
			return (monan_diadiemanuong) sessionFactory.getCurrentSession().createQuery("from monan_diadiemanuong where id=:id_mon_an")
					.setParameter("id_mon_an", id).getSingleResult();
		} catch (Exception e) {
			return null;
		}
    }
    
    public void save(monan_diadiemanuong monan_diadiemanuong) {
    	sessionFactory.getCurrentSession().saveOrUpdate(monan_diadiemanuong);
    }

}
