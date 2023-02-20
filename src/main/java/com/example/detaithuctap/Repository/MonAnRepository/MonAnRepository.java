package com.example.detaithuctap.Repository.MonAnRepository;

import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MonAnRepository implements BaseRepository<MonAn> {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<MonAn> getAll () {
        return sessionFactory.getCurrentSession ().createQuery ("from MonAn")
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
        return null;
    }


}
