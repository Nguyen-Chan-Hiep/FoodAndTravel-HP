package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.CommentAddress;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CommentReponsImpl implements BaseRepository<CommentAddress> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<CommentAddress> getAll() {
        List<CommentAddress> list = sessionFactory.getCurrentSession().createNativeQuery("select * from commentdiadiemdulich", CommentAddress.class).list();
        return list;
    }

    @Override
    public void saveOrUpdate(CommentAddress commentaAddress) {
        sessionFactory.getCurrentSession().saveOrUpdate(commentaAddress);
    }

    @Override
    public void delete(int id) {
        CommentAddress cmtaddress = getById(id);
        sessionFactory.getCurrentSession().delete(cmtaddress);
    }

    @Override
    public CommentAddress getById(int id) {
        CommentAddress cmtAddress = sessionFactory.getCurrentSession().
                createNativeQuery("select * from commentdiadiemdulich where id = :id", CommentAddress.class).setParameter("id", id).getSingleResult();
        return cmtAddress;
    }

    public List<CommentAddress> findByIdAddress(int idAddress){
        List<CommentAddress> list = sessionFactory.getCurrentSession().
                createNativeQuery("select * from commentdiadiemdulich where id_address = :idAddress", CommentAddress.class).setParameter("idAddress", idAddress).list();
        return list;
    }

    @Override
    public CommentAddress getByName(String name) {
        return null;
    }
}
