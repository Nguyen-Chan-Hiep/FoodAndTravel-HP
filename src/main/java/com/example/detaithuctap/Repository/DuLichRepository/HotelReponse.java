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
        List<hotel> list = sessionFactory.getCurrentSession().createNativeQuery("seclect * from hotel", hotel.class).list();
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
