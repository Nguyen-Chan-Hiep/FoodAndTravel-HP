//package com.example.detaithuctap.Repository.DuLichRepository;
//
//import com.example.detaithuctap.Entity.DuLich.loaiHinh;
//import com.example.detaithuctap.Repository.BaseRepository;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository
//public class LoaiHinhReponImpl implements BaseRepository<loaiHinh> {
//    @Autowired
//    private SessionFactory sessionFactory;
//    @Override
//    public List<loaiHinh> getAll() {
//        List<loaiHinh> list = sessionFactory.getCurrentSession().createNativeQuery("select * form loai_hinh_du_lich", loaiHinh.class).list();
//        return list;
//    }
//
//    @Override
//    public void saveOrUpdate(loaiHinh loaiHinh) {
//        sessionFactory.getCurrentSession().saveOrUpdate(loaiHinh);
//    }
//
//    @Override
//    public void delete(int id) {
//        loaiHinh hinh = getById(id);
//        sessionFactory.getCurrentSession().delete(hinh);
//    }
//
//    public void delObject(loaiHinh loaiHinh){
//        sessionFactory.getCurrentSession().delete(loaiHinh);
//    }
//    @Override
//    public loaiHinh getById(int id) {
//        loaiHinh loaiHinh = (com.example.detaithuctap.Entity.DuLich.loaiHinh) sessionFactory.getCurrentSession().createNativeQuery("select * from loai_hinh_du_lich where id = :id", loaiHinh.class).setParameter("id", id).getSingleResult();
//
//        return loaiHinh;
//    }
//
//    public loaiHinh findByTenLoaiHinh(String name){
//        loaiHinh hinh = (loaiHinh) sessionFactory.getCurrentSession().createNativeQuery("select * from loai_hinh_du_lich where ten_loai_hinh = :name", loaiHinh.class).setParameter("name", name).getSingleResult();
//        return hinh;
//    }
//    @Override
//    public loaiHinh getByName(String name) {
//        return null;
//    }
//}
