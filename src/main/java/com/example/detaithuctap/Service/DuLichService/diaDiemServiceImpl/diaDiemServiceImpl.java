package com.example.detaithuctap.Service.DuLichService.diaDiemServiceImpl;

import com.example.detaithuctap.Entity.DuLich.address;
import com.example.detaithuctap.Repository.DuLichRepository.AddressReponsImpl;
import com.example.detaithuctap.Service.DuLichService.diaDiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class diaDiemServiceImpl implements diaDiemService {
    @Autowired
    private AddressReponsImpl respon;

    @Override
    public List<address> getAll() {
        try{
            return respon.getAll();
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public address getById(int id) {
        try{
            return respon.getById(id);
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public List<address> getByLHName(String name) {
        return respon.getListAddress(name);
    }

    @Override
    public void saveorupdate(address dd) {
        respon.saveOrUpdate(dd);
    }

    @Override
    public void delAddress(address address1) {
        respon.delObject(address1);
    }

    @Override
    public address getOne(String tenloaihinh, String tenDiaDiem, String diachi, String trangthai, String hinhanh) {
        return respon.getOne(tenloaihinh, tenDiaDiem, diachi, trangthai, hinhanh);
    }

    @Override
    public void delById(int id) {
        respon.delete(id);
    }

    @Override
    public List<address> searchAddress(String search) {
        search = search.substring(0, search.length()-1);
        search = "%" + search +"%";
        System.out.print(search);
        List<address> list = respon.search(search);
        return list;
    }
}
