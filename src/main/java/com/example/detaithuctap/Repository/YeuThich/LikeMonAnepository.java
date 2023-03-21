package com.example.detaithuctap.Repository.YeuThich;

import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Entity.MonAn.LikeMonAn;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LikeMonAnepository implements BaseRepository<LikeMonAn> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<LikeMonAn> getAll () {
        return null;
    }

    @Override
    public void saveOrUpdate (LikeMonAn likeMonAn) {
        sessionFactory.getCurrentSession ().saveOrUpdate (likeMonAn);
    }

    @Override
    public void delete (int id) {

    }

    @Override
    public LikeMonAn getById (int id) {
        return null;
    }

    @Override
    public LikeMonAn getByName (String name) {
        return null;
    }

    public LikeMonAn getLikeByIdMonAnAndIdUser(MonAn idmonan, NguoiDung iduser){
        try{
            return (LikeMonAn) sessionFactory.getCurrentSession ().createQuery ("from LikeMonAn where monAn = :monAn and nguoiDung" +
                    " = :nguoiDung").setParameter ("monAn", idmonan).setParameter ("nguoiDung", iduser).getSingleResult ();
        }catch (Exception e){
            return null;
        }

    }

}