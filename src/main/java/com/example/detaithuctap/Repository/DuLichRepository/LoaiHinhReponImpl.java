
package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.TravelCategory;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class LoaiHinhReponImpl implements BaseRepository<TravelCategory> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<TravelCategory> getAll() {
        List<TravelCategory> list = sessionFactory.getCurrentSession().createNativeQuery("select * from loai_hinh_du_lich", TravelCategory.class).list();
        return list;
    }

    @Override
    public void saveOrUpdate(TravelCategory loaiHinh) {
        sessionFactory.getCurrentSession().saveOrUpdate(loaiHinh);
    }

    @Override
    public void delete(int id) {
        TravelCategory hinh = getById(id);
        sessionFactory.getCurrentSession().delete(hinh);
    }

    public void delObject(TravelCategory loaiHinh){
        sessionFactory.getCurrentSession().delete(loaiHinh);
    }
    @Override
    public TravelCategory getById(int id) {
        TravelCategory loaiHinh = (TravelCategory) sessionFactory.getCurrentSession().createNativeQuery("select * from loai_hinh_du_lich where id = :id", TravelCategory.class).setParameter("id", id).getSingleResult();

        return loaiHinh;
    }

    public TravelCategory findByTenLoaiHinh(String name){
        TravelCategory hinh = (TravelCategory) sessionFactory.getCurrentSession().createNativeQuery("select * from loai_hinh_du_lich where ten_loai_hinh = :name", TravelCategory.class).setParameter("name", name).getSingleResult();
        return hinh;
    }
    @Override
    public TravelCategory getByName(String name) {
        return null;
    }
}
