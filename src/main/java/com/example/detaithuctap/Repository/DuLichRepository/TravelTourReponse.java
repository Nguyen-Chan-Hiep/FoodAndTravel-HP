package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.TravelTour;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TravelTourReponse implements BaseRepository<TravelTour> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<TravelTour> getAll() {
        List<TravelTour> list = sessionFactory.getCurrentSession().createNativeQuery("select * from travel_tour",
                TravelTour.class).list();
        return list;
    }

    public List<TravelTour> searchAll(String search, String date, int ngay){
        List<TravelTour> list = sessionFactory.getCurrentSession().createNativeQuery("select * from" +
                " travel_tour where dia_diem like :search", TravelTour.class)
                .setParameter("search", search).list();
        return list;
    }

    @Override
    public void saveOrUpdate(TravelTour travel_tour) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public TravelTour getById(int id) {
        return null;
    }

    @Override
    public TravelTour getByName(String name) {
        return null;
    }
}
