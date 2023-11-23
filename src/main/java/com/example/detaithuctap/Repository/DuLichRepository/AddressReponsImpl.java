
package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.Address;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AddressReponsImpl implements BaseRepository<Address> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Address> getAll() {
        List<Address> list = sessionFactory.getCurrentSession().createNativeQuery("select * from address_travel", Address.class).list();
        return list;
    }

    @Override
    public void saveOrUpdate(Address address) {
        sessionFactory.getCurrentSession().saveOrUpdate(address);
    }

    @Override
    public void delete(int id) {
        Address address = getById(id);
        sessionFactory.getCurrentSession().delete(address);
    }

    public void delObject(Address address){
        sessionFactory.getCurrentSession().delete(address);
    }
    @Override
    public Address getById(int id) {
        Address address = sessionFactory.getCurrentSession().createNativeQuery("select * from address_travel where id = :id", Address.class).setParameter("id", id).getSingleResult();

        return address;
    }

    public List<Address> getListAddress(String name){
        List<Address> addresses = sessionFactory.getCurrentSession().createNativeQuery("select dd.id, dd.id_loai_hinh_du_lich, dd.ten_dia_diem, dd.diachi, dd.trangthai, dd.hinhanh, dd.sl_like " +
                "from address_travel dd join loai_hinh_du_lich lh on dd.id_loai_hinh_du_lich = lh.id " +
                "where lh.ten_loai_hinh = :name", Address.class).setParameter("name", name).list();
        return addresses;
    }

    public Address getOne(String tenloaihinh, String tenDiaDiem, String diachi, String trangthai, String hinhanh){
        Address address = sessionFactory.getCurrentSession().createNativeQuery("select dd.id, dd.id_loai_hinh_du_lich, dd.ten_dia_diem, dd.diachi, dd.trangthai, dd.hinhanh, dd,sl_like " +
                "from address_travel dd join loai_hinh_du_lich lh on dd.id_loai_hinh_du_lich = lh.id " +
                        "where lh.ten_loai_hinh = :tenloaihinh and dd.ten_dia_diem = :tenDiaDiem and dd.diachi =:diachi "+
                        "and dd.trangthai = :trangthai and dd.hinhanh = :hinhanh", Address.class).setParameter("tenloaihinh", tenloaihinh).
                setParameter("tenDiaDiem", tenDiaDiem).setParameter("diachi", diachi).setParameter("trangthai", trangthai).
                setParameter("hinhanh", hinhanh).getSingleResult();
        return address;
    }

    public List<Address> search(@Param("search")String search){
        try{
            List<Address> listAdd = sessionFactory.getCurrentSession().createNativeQuery("select * from address_travel where ten_dia_diem like :search", Address.class).
                    setParameter("search", search).list();
            return listAdd;
        } catch (Exception e){
            return null;
        }

    }
    @Override
    public Address getByName(String name) {
        return null;
    }

    public List<Address> getByLHId(int id_lh){
        List<Address> list = sessionFactory.getCurrentSession().createNativeQuery("select * from address_travel where id_loai_hinh_du_lich = :id_lh", Address.class).setParameter("id_lh", id_lh).list();
        return list;
    }
}
