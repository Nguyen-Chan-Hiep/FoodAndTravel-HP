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

    public List<news> getAll(String search) {
        try{
            List<news> list = sessionFactory.getCurrentSession().createNativeQuery("select * from tin_tuc tt " +
                            "where (tt.tieu_de_tin_tuc like :search1 or tt.loai_hinh like :search2) order by thoigianpost", news.class)
                    .setParameter("search1", search).setParameter("search2", search)
                    .list();
            return list;
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public List<news> getAll() {
        List<news> list = sessionFactory.getCurrentSession().createNativeQuery("select * from tin_tuc " +
                        "order by thoigianpost", news.class).list();
        return list;    }

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
