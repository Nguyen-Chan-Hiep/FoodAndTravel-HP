package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.liked_address;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class LikedReponsImpl implements BaseRepository<liked_address> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<liked_address> getAll() {
        List<liked_address> list = sessionFactory.getCurrentSession().createNativeQuery("select * from liked_diadiem", liked_address.class).list();
        return list;
    }

    @Override
    public void saveOrUpdate(liked_address likedAddress) {
        sessionFactory.getCurrentSession().saveOrUpdate(likedAddress);
    }

    @Override
    public void delete(int id) {
        liked_address address = getById(id);
        sessionFactory.getCurrentSession().delete(address);
    }

    @Override
    public liked_address getById(int id) {
        liked_address likedAddress = (liked_address) sessionFactory.getCurrentSession().createNativeQuery("select * from liked_diadiem where id = :id", liked_address.class).setParameter("id", id).getSingleResult();

        return likedAddress;
    }

    public void delObject(liked_address likedAddress){
        sessionFactory.getCurrentSession().delete(likedAddress);
    }
    public liked_address checkExist(int idUser, int idAddress){
        liked_address likedAddress = sessionFactory.getCurrentSession().createNativeQuery("select * from liked_diadiem where id_user = :idUser and id_dia_diem = :idAddress", liked_address.class).setParameter("idUser", idUser).setParameter("idAddress", idAddress).getSingleResult();
        return likedAddress;
    }
    @Override
    public liked_address getByName(String name) {
        return null;
    }
}
