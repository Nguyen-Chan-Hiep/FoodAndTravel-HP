package com.example.detaithuctap.Repository.MonAn;

import com.example.detaithuctap.Entity.MonAn.Loai_hinh_am_thuc;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Loai_hinh_am_thucRepository implements BaseRepository<Loai_hinh_am_thuc> {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Loai_hinh_am_thuc> getAll () {
        return (List<Loai_hinh_am_thuc>) sessionFactory.getCurrentSession ().createQuery ("from Loai_hinh_am_thuc")
                .list ();
    }

    @Override
    public void saveOrUpdate (Loai_hinh_am_thuc loai_hinh_am_thuc) {

    }

    @Override
    public void delete (int id) {

    }

    @Override
    public Loai_hinh_am_thuc getById (int id) {
        return (Loai_hinh_am_thuc) sessionFactory.getCurrentSession ().createQuery ("from Loai_hinh_am_thuc where id = :id")
                .setParameter ("id", id).getSingleResult ();
    }

    @Override
    public Loai_hinh_am_thuc getByName (String name) {
        return null;
    }
}
