<<<<<<< HEAD
//
//package com.example.detaithuctap.Repository.DuLichRepository;
//
//import com.example.detaithuctap.Entity.DuLich.address_detail;
//import com.example.detaithuctap.Repository.BaseRepository;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository
//public class AddressDetailRepons implements BaseRepository<address_detail> {
//    @Autowired
//    private SessionFactory sessionFactory;
//    @Override
//    public List<address_detail> getAll() {
//        List<address_detail> list = sessionFactory.getCurrentSession().createNativeQuery("seclect * from adress_detail", address_detail.class).list();
//        return list;
//    }
//
//    @Override
//    public void saveOrUpdate(address_detail addressDetail) {
//        sessionFactory.getCurrentSession().saveOrUpdate(addressDetail);
//    }
//
//    @Override
//    public void delete(int id) {
//        address_detail addressDetail = getById(id);
//        sessionFactory.getCurrentSession().delete(addressDetail);
//    }
//
//    @Override
//    public address_detail getById(int id) {
//        address_detail address_detail = sessionFactory.getCurrentSession().
//                createNativeQuery("select * from adress_detail where id = :id", address_detail.class).setParameter("id", id).getSingleResult();
//        return address_detail;
//    }
//
//    @Override
//    public address_detail getByName(String name) {
//        return null;
//    }
//    public address_detail findByIdAddress(int id_dd){
//        address_detail addressDetail = (address_detail) sessionFactory.getCurrentSession().
//                createNativeQuery("SELECT * FROM adress_detail ct WHERE ct.id_dia_diem_du_lich = :id_dd", address_detail.class).
//                setParameter("id_dd", id_dd).getSingleResult();
//        return addressDetail;
//    }
//}
=======

package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.address_detail;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AddressDetailRepons implements BaseRepository<address_detail> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<address_detail> getAll() {
        List<address_detail> list = sessionFactory.getCurrentSession().createNativeQuery("seclect * from adress_detail",
                address_detail.class).list();
        return list;
    }

    @Override
    public void saveOrUpdate(address_detail addressDetail) {
        sessionFactory.getCurrentSession().saveOrUpdate(addressDetail);
    }

    @Override
    public void delete(int id) {
        address_detail addressDetail = getById(id);
        sessionFactory.getCurrentSession().delete(addressDetail);
    }

    @Override
    public address_detail getById(int id) {
        address_detail address_detail = sessionFactory.getCurrentSession().
                createNativeQuery("select * from adress_detail where id = :id", address_detail.class).setParameter("id", id).getSingleResult();
        return address_detail;
    }

    @Override
    public address_detail getByName(String name) {
        return null;
    }
    public address_detail findByIdAddress(int id_dd){
        address_detail addressDetail = (address_detail) sessionFactory.getCurrentSession().
                createNativeQuery("SELECT * FROM adress_detail ct WHERE ct.id_dia_diem_du_lich = :id_dd", address_detail.class).
                setParameter("id_dd", id_dd).getSingleResult();
        return addressDetail;
    }
}
>>>>>>> ea30e2cfb04152c2a3b90584e338d6d916f329ce
