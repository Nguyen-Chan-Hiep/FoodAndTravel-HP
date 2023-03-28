package com.example.detaithuctap.Repository.tintucReponsitory;

import com.example.detaithuctap.Entity.tintuc.NewsComment;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsCommentRepoImpl implements NewsCommentRepo{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<NewsComment> getAllByNewsId(int newsId) {
        List<NewsComment> list = sessionFactory.getCurrentSession().createNativeQuery("SELECT * FROM news_comment " +
                        "where news_id = :news_id", NewsComment.class).setParameter("news_id", newsId).list();
        return list;
    }

    @Override
    public void saveComment(NewsComment newsComment) {
        sessionFactory.getCurrentSession().saveOrUpdate(newsComment);
    }
}
