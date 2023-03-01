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
    @Override
    public List<BaiViet> getAll () {
        return null;
    }

    @Override
    public void saveOrUpdate (BaiViet baiViet) {
        sessionFactory.getCurrentSession ().saveOrUpdate (baiViet);
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
}
