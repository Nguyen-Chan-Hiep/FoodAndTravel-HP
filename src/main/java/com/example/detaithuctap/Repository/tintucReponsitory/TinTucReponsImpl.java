package com.example.detaithuctap.Repository.tintucReponsitory;

import com.example.detaithuctap.Entity.tintuc.news;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TinTucReponsImpl implements BaseRepository<news> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<news> getAll() {
        List<news> list = sessionFactory.getCurrentSession().createNativeQuery("select * from tin_tuc order by thoigianpost", news.class).list();
        return list;
    }

    @Override
    public void saveOrUpdate(news news) {
        sessionFactory.getCurrentSession().saveOrUpdate(news);
    }

    @Override
    public void delete(int id) {
        news new1 = getById(id);
        sessionFactory.getCurrentSession().delete(new1);
    }

    @Override
    public news getById(int id) {
        news news = sessionFactory.getCurrentSession().createNativeQuery("select * from tin_tuc where id = :id", news.class).setParameter("id", id).getSingleResult();
        return news;
    }

    @Override
    public news getByName(String name) {
        return null;
    }
}
