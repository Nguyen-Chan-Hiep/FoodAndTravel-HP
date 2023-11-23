package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.LikedAddress;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class LikedReponsImpl implements BaseRepository<LikedAddress> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<LikedAddress> getAll() {
        List<LikedAddress> list = sessionFactory.getCurrentSession().createNativeQuery("select * from liked_diadiem", LikedAddress.class).list();
        return list;
    }

    @Override
    public void saveOrUpdate(LikedAddress likedAddress) {
        sessionFactory.getCurrentSession().saveOrUpdate(likedAddress);
    }

    @Override
    public void delete(int id) {
        LikedAddress address = getById(id);
        sessionFactory.getCurrentSession().delete(address);
    }

    @Override
    public LikedAddress getById(int id) {
        LikedAddress likedAddress = (LikedAddress) sessionFactory.getCurrentSession().createNativeQuery("select * from liked_diadiem where id = :id", LikedAddress.class).setParameter("id", id).getSingleResult();

        return likedAddress;
    }

    public void delObject(LikedAddress likedAddress){
        sessionFactory.getCurrentSession().delete(likedAddress);
    }
    public LikedAddress checkExist(int idUser, int idAddress){
        LikedAddress likedAddress = sessionFactory.getCurrentSession().createNativeQuery("select * from liked_diadiem where id_user = :idUser and id_dia_diem = :idAddress", LikedAddress.class).setParameter("idUser", idUser).setParameter("idAddress", idAddress).getSingleResult();
        return likedAddress;
    }
    @Override
    public LikedAddress getByName(String name) {
        return null;
    }
}
