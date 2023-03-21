//package com.example.detaithuctap.Repository.DuLichRepository;
//
//import com.example.detaithuctap.Entity.DuLich.commentaAddress;
//import com.example.detaithuctap.Repository.BaseRepository;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository
//public class CommentReponsImpl implements BaseRepository<commentaAddress> {
//    @Autowired
//    private SessionFactory sessionFactory;
//    @Override
//    public List<commentaAddress> getAll() {
//        List<commentaAddress> list = sessionFactory.getCurrentSession().createNativeQuery("select * from commentdiadiemdulich", commentaAddress.class).list();
//        return list;
//    }
//
//    @Override
//    public void saveOrUpdate(commentaAddress commentaAddress) {
//        sessionFactory.getCurrentSession().saveOrUpdate(commentaAddress);
//    }
//
//    @Override
//    public void delete(int id) {
//        commentaAddress cmtaddress = getById(id);
//        sessionFactory.getCurrentSession().delete(cmtaddress);
//    }
//
//    @Override
//    public commentaAddress getById(int id) {
//        commentaAddress cmtAddress = sessionFactory.getCurrentSession().
//                createNativeQuery("select * from commentdiadiemdulich where id = :id", commentaAddress.class).setParameter("id", id).getSingleResult();
//        return cmtAddress;
//    }
//
//    public List<commentaAddress> findByIdAddress(int idAddress){
//        List<commentaAddress> list = sessionFactory.getCurrentSession().
//                createNativeQuery("select * from commentdiadiemdulich where id_address = :idAddress", commentaAddress.class).setParameter("idAddress", idAddress).list();
//        return list;
//    }
//
//    @Override
//    public commentaAddress getByName(String name) {
//        return null;
//    }
//}
