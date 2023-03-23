//package com.example.detaithuctap.Repository.DuLichRepository;
//
//import com.example.detaithuctap.Entity.DuLich.travel_tour;
//import com.example.detaithuctap.Repository.BaseRepository;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository
//public class TravelTourReponse implements BaseRepository<travel_tour> {
//    @Autowired
//    private SessionFactory sessionFactory;
//    @Override
//    public List<travel_tour> getAll() {
//        List<travel_tour> list = sessionFactory.getCurrentSession().createNativeQuery("select * from travel_tour", travel_tour.class).list();
//        return list;
//    }
//
//    @Override
//    public void saveOrUpdate(travel_tour travel_tour) {
//
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//
//    @Override
//    public travel_tour getById(int id) {
//        return null;
//    }
//
//    @Override
//    public travel_tour getByName(String name) {
//        return null;
//    }
//}
