package com.example.detaithuctap.Repository.Comment;

import com.example.detaithuctap.Entity.MonAn.NhanXetMonAn;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Service.BaseService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NhanXetMonAnRepository implements BaseService<NhanXetMonAn> {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<NhanXetMonAn> getAll () {
        return null;
    }

    @Override
    public void saveOrUpdate (NhanXetMonAn nhanxetMonAn) {
        sessionFactory.getCurrentSession ().saveOrUpdate (nhanxetMonAn);
    }

    @Override
    public void delete (int t) {

    }

    @Override
    public NhanXetMonAn getById (int id) {
        try{
            return (NhanXetMonAn) sessionFactory.getCurrentSession ().createQuery ("from NhanXetMonAn where id = :id")
                    .setParameter ("id", id).getSingleResult ();
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public NhanXetMonAn getByName (String name) {
        return null;
    }

    public List<NhanXetMonAn> getListCommentByIdMonAn(int id){
        return (List<NhanXetMonAn>) sessionFactory.getCurrentSession ().createQuery ("from NhanXetMonAn").list ();
    }

    public List<NhanXetMonAn> getByIdUser(int id){
        return (List<NhanXetMonAn>) sessionFactory.getCurrentSession ().createQuery ("from NhanXetMonAn where user_id = :id")
                .setParameter ("id", id).getSingleResult ();
    }

    public List<NhanXetMonAn> getCommentByIdMonAnAndIdUser(MonAn monAn, NguoiDung nguoiDung){
        try{
            return (List<NhanXetMonAn>) sessionFactory.getCurrentSession ().createQuery ("from NhanXetMonAn where " +
                            "monAn = :monan_id and user = :user_id")
                    .setParameter ("monan_id", monAn).setParameter ("user_id", nguoiDung).list ();
        }catch (Exception e){
            return null;
        }

    }
}
