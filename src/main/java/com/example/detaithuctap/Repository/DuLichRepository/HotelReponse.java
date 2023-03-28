package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.hotel;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HotelReponse implements BaseRepository<hotel> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<hotel> getAll() {
        List<hotel> list = sessionFactory.getCurrentSession().createNativeQuery("select * from hotel", hotel.class).list();
        return list;
    }

    public List<hotel> searchAll(String search){
        List<hotel> list = sessionFactory.getCurrentSession().createNativeQuery("select * from" +
                        " hotel where dia_chi like :search or hotel_name like :search1", hotel.class)
                .setParameter("search", search).setParameter("search1", search).list();
        return list;
    }

    @Override
    public void saveOrUpdate(hotel hotel) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public hotel getById(int id) {
        return null;
    }

    @Override
    public hotel getByName(String name) {
        return null;
    }
}
