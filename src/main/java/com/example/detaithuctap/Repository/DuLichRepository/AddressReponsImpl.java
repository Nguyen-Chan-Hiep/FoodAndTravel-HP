package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.address;
import com.example.detaithuctap.Repository.BaseRepository;
import org.apache.tomcat.jni.Buffer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AddressReponsImpl implements BaseRepository<address> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<address> getAll() {
        List<address> list = sessionFactory.getCurrentSession().createQuery("from address").list();
        return list;
    }

    @Override
    public void saveOrUpdate(address address) {
        sessionFactory.getCurrentSession().saveOrUpdate(address);
    }

    @Override
    public void delete(int id) {
        address address = getById(id);
        sessionFactory.getCurrentSession().delete(address);
    }

    public void delObject(address address){
        sessionFactory.getCurrentSession().delete(address);
    }
    @Override
    public address getById(int id) {
        address address = sessionFactory.getCurrentSession().createNativeQuery("select * from dia_diem_du_lich where id = :id", com.example.detaithuctap.Entity.DuLich.address.class).setParameter("id", id).getSingleResult();

        return address;
    }

    public List<address> getListAddress(String name){
        List<address> addresses = sessionFactory.getCurrentSession().createNativeQuery("select dd.id, dd.id_loai_hinh_du_lich, dd.ten_dia_diem, dd.diachi, dd.trangthai, dd.hinhanh, dd.sl_like " +
                "from dia_diem_du_lich dd join loai_hinh_du_lich lh on dd.id_loai_hinh_du_lich = lh.id " +
                "where lh.ten_loai_hinh = :name", address.class).setParameter("name", name).list();
        return addresses;
    }

    public address getOne(String tenloaihinh, String tenDiaDiem, String diachi, String trangthai, String hinhanh){
        address address = sessionFactory.getCurrentSession().createNativeQuery("select dd.id, dd.id_loai_hinh_du_lich, dd.ten_dia_diem, dd.diachi, dd.trangthai, dd.hinhanh, dd,sl_like " +
                "from dia_diem_du_lich dd join loai_hinh_du_lich lh on dd.id_loai_hinh_du_lich = lh.id " +
                        "where lh.ten_loai_hinh = :tenloaihinh and dd.ten_dia_diem = :tenDiaDiem and dd.diachi =:diachi "+
                        "and dd.trangthai = :trangthai and dd.hinhanh = :hinhanh", com.example.detaithuctap.Entity.DuLich.address.class).setParameter("tenloaihinh", tenloaihinh).
                setParameter("tenDiaDiem", tenDiaDiem).setParameter("diachi", diachi).setParameter("trangthai", trangthai).
                setParameter("hinhanh", hinhanh).getSingleResult();
        return address;
    }

    public List<address> search(@Param("search")String search){
        List<address> listAdd = sessionFactory.getCurrentSession().createNativeQuery("select * from dia_diem_du_lich where ten_dia_diem like :search", address.class).
                setParameter("search", search).list();
        return listAdd;
    }
    @Override
    public address getByName(String name) {
        return null;
    }
}
