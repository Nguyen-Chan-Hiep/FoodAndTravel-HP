
package com.example.detaithuctap.Service.DuLichService.AddressServiceImpl;

import com.example.detaithuctap.Entity.DuLich.Address;
import com.example.detaithuctap.Repository.DuLichRepository.AddressReponsImpl;
import com.example.detaithuctap.Service.DuLichService.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressReponsImpl respon;

    @Override
    public List<Address> getAll() {
        return respon.getAll();
    }

    @Override
    public Address getById(int id) {
        try{
            return respon.getById(id);
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public List<Address> getByLHName(String name) {
        return respon.getListAddress(name);
    }

    @Override
    public void saveorupdate(Address dd) {
        respon.saveOrUpdate(dd);
    }

    @Override
    public void delAddress(Address address1) {
        respon.delObject(address1);
    }

    @Override
    public Address getOne(String tenloaihinh, String tenDiaDiem, String diachi, String trangthai, String hinhanh) {
        return respon.getOne(tenloaihinh, tenDiaDiem, diachi, trangthai, hinhanh);
    }

    @Override
    public void delById(int id) {
        respon.delete(id);
    }

    @Override
    public List<Address> searchAddress(String search) {
        search = search.substring(0, search.length()-1);
        search = "%" + search +"%";
        System.out.print(search);
        List<Address> list = respon.search(search);
        return list;
    }

    @Override
    public List<Address> findByLHId(int lhId) {
        return respon.getByLHId(lhId);
    }
}
