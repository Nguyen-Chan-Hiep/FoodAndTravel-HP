
package com.example.detaithuctap.Repository.tintucReponsitory;

import com.example.detaithuctap.Entity.tintuc.News;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TinTucReponsImpl implements BaseRepository<News> {
    @Autowired
    private SessionFactory sessionFactory;

    public List<News> getAll(String search) {
        try{
            List<News> list = sessionFactory.getCurrentSession().createNativeQuery("select * from tin_tuc tt " +
                            "where (tt.tieu_de_tin_tuc like :search1 or tt.loai_hinh like :search2) order by thoigianpost", News.class)
                    .setParameter("search1", search).setParameter("search2", search)
                    .list();
            return list;
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public List<News> getAll() {
        try {
            List<News> list = sessionFactory.getCurrentSession().createNativeQuery("select * from tin_tuc " +
                    "order by thoigianpost", News.class).list();
            return list;
        } catch (Exception e){
            return null;
        }
    }

    @Override
    public void saveOrUpdate(News news) {
        sessionFactory.getCurrentSession().saveOrUpdate(news);
    }

    @Override
    public void delete(int id) {
        News new1 = getById(id);
        sessionFactory.getCurrentSession().delete(new1);
    }

    @Override
    public News getById(int id) {
        News news = sessionFactory.getCurrentSession().createNativeQuery("select * from tin_tuc where id = :id", News.class).setParameter("id", id).getSingleResult();
        return news;
    }

    @Override
    public News getByName(String name) {
        return null;
    }
}
