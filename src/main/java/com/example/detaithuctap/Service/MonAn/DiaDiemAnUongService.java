package com.example.detaithuctap.Service.MonAn;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import com.example.detaithuctap.Repository.MonAn.DiaDiemAnUongRepository;
import com.example.detaithuctap.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DiaDiemAnUongService implements BaseService<DiaDiemAnUong> {

    @Autowired
    private DiaDiemAnUongRepository diaDiemAnUongRepository;
    @Override
    public List<DiaDiemAnUong> getAll () {
        return diaDiemAnUongRepository.getAll ();
    }

    @Override
    public void saveOrUpdate (DiaDiemAnUong diaDiemAnUong) {
        diaDiemAnUongRepository.saveOrUpdate (diaDiemAnUong);
    }

    @Override
    public void delete (int t) {
        diaDiemAnUongRepository.delete (t);
    }

    @Override
    public DiaDiemAnUong getById (int id) {
        return diaDiemAnUongRepository.getById (id);
    }

    @Override
    public DiaDiemAnUong getByName (String name) {
        return null;
    }
}
