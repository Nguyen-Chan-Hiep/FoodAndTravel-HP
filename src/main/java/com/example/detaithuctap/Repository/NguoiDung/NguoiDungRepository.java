package com.example.detaithuctap.Repository.NguoiDung;

import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NguoiDungRepository implements BaseRepository<NguoiDung> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<NguoiDung> getAll () {
        return (List<NguoiDung>) sessionFactory.getCurrentSession ().createQuery ("from user").list ();
    }

    @Override
    public void saveOrUpdate (NguoiDung user) {
        sessionFactory.getCurrentSession ().saveOrUpdate (user);
    }

    @Override
    public void delete (int id) {
        sessionFactory.getCurrentSession ().delete (id);
    }

    @Override
    public NguoiDung getById (int id) {
        try{
            return (NguoiDung) sessionFactory.getCurrentSession ().createQuery ("from NguoiDung where id = :id")
                    .setParameter ("id", id).getSingleResult ();
        }catch (Exception e){
            return null;
        }

    }

    @Override
    public NguoiDung getByName (String name) {
        return (NguoiDung) sessionFactory.getCurrentSession ().createQuery ("from NguoiDung where username" +
                        " = :username").setParameter ("username", name)
                .getSingleResult ();
    }

    public NguoiDung getByName (String name, String pass) {
        return (NguoiDung) sessionFactory.getCurrentSession ().createQuery ("from NguoiDung where username" +
                " = :username and password = :password").setParameter ("username", name)
                .setParameter ("password", pass).getSingleResult ();
    }

    public List<String> getRole(String name){
        return (List<String>) sessionFactory.getCurrentSession ().createNativeQuery ("select quyen from user where username = :username")
                .setParameter ("username", name).list ();
    }

}
