package com.example.detaithuctap.Repository.MonAn;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DiaDiemAnUongRepository implements BaseRepository<DiaDiemAnUong> {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<DiaDiemAnUong> getAll () {
        return sessionFactory.getCurrentSession ().createQuery ("from DiaDiemAnUong")
                .list ();
    }

    @Override
    public void saveOrUpdate (DiaDiemAnUong diaDiemAnUong) {
        sessionFactory.getCurrentSession ().saveOrUpdate (diaDiemAnUong);
    }

    public void delete (int id) {
        DiaDiemAnUong diaDiemAnUong = getById (id);
        sessionFactory.getCurrentSession ().delete (diaDiemAnUong);
    }

    @Override
    public DiaDiemAnUong getById (int id) {
        return (DiaDiemAnUong) sessionFactory.getCurrentSession ().createQuery ("from DiaDiemAnUong where id = :id")
                .setParameter ("id", id).getSingleResult ();
    }

    @Override
    public DiaDiemAnUong getByName (String name) {
        return null;
    }

}
