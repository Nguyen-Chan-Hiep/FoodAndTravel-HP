package com.example.detaithuctap.Service.DuLichService.diaDiemServiceImpl;

import com.example.detaithuctap.Entity.DuLich.address;
import com.example.detaithuctap.Repository.DuLichRepository.diaDIemReponsitory;
import com.example.detaithuctap.Service.DuLichService.diaDiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.text.normalizer.UTF16;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class diaDiemServiceImpl implements diaDiemService {
    @Autowired
    private diaDIemReponsitory respon;

    @Override
    public List<address> getAll() {
        try{
            return respon.findAll();
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public address getById(int id) {
        try{
            return respon.findById(id).get();
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
        respon.save(dd);
    }

    @Override
    public void delAddress(address address1) {
        respon.delete(address1);
    }

    @Override
    public address getOne(String tenloaihinh, String tenDiaDiem, String diachi, String trangthai, String hinhanh) {
        return respon.getOne(tenloaihinh, tenDiaDiem, diachi, trangthai, hinhanh);
    }

    @Override
    public void delById(int id) {
        respon.deleteById(id);
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
