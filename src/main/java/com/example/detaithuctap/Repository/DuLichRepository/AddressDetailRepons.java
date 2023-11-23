
package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.AddressDetail;
import com.example.detaithuctap.Repository.BaseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AddressDetailRepons implements BaseRepository<AddressDetail> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<AddressDetail> getAll() {
        List<AddressDetail> list = sessionFactory.getCurrentSession().createNativeQuery("seclect * from adress_detail",
                AddressDetail.class).list();
        return list;
    }

    @Override
    public void saveOrUpdate(AddressDetail addressDetail) {
        sessionFactory.getCurrentSession().saveOrUpdate(addressDetail);
    }

    @Override
    public void delete(int id) {
        AddressDetail addressDetail = getById(id);
        sessionFactory.getCurrentSession().delete(addressDetail);
    }

    @Override
    public AddressDetail getById(int id) {
        AddressDetail address_detail = sessionFactory.getCurrentSession().
                createNativeQuery("select * from adress_detail where id = :id", AddressDetail.class).setParameter("id", id).getSingleResult();
        return address_detail;
    }

    @Override
    public AddressDetail getByName(String name) {
        return null;
    }
    public AddressDetail findByIdAddress(int id_dd){
        AddressDetail addressDetail = (AddressDetail) sessionFactory.getCurrentSession().
                createNativeQuery("SELECT * FROM adress_detail ct WHERE ct.id_dia_diem_du_lich = :id_dd", AddressDetail.class).
                setParameter("id_dd", id_dd).getSingleResult();
        return addressDetail;
    }

}
