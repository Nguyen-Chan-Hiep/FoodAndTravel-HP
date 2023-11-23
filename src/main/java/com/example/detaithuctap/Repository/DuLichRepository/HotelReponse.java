package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.Hotel;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HotelReponse implements BaseRepository<Hotel> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Hotel> getAll() {
        List<Hotel> list = sessionFactory.getCurrentSession().createNativeQuery("select * from hotel", Hotel.class).list();
        return list;
    }

    public List<Hotel> searchAll(String search){
        List<Hotel> list = sessionFactory.getCurrentSession().createNativeQuery("select * from" +
                        " hotel where dia_chi like :search or hotel_name like :search1", Hotel.class)
                .setParameter("search", search).setParameter("search1", search).list();
        return list;
    }

    @Override
    public void saveOrUpdate(Hotel hotel) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Hotel getById(int id) {
        return null;
    }

    @Override
    public Hotel getByName(String name) {
        return null;
    }
}
