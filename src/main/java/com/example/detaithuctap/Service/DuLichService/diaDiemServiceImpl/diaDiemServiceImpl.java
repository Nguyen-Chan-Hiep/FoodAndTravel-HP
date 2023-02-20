package com.example.detaithuctap.Service.DuLichService.diaDiemServiceImpl;

import com.example.detaithuctap.Entity.DuLich.dia_diem;
import com.example.detaithuctap.Repository.DuLichRepository.diaDIemReponsitory;
import com.example.detaithuctap.Service.DuLichService.diaDiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class diaDiemServiceImpl implements diaDiemService {
    @Autowired
    private diaDIemReponsitory respon;

    @Override
    public List<dia_diem> getAll() {
        try{
            return respon.findAll();
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public dia_diem getById(int id) {
        return respon.findById(id).get();
    }
}
