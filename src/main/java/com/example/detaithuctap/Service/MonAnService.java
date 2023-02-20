package com.example.detaithuctap.Service;

import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Repository.MonAnRepository.MonAnRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MonAnService implements BaseService<MonAn> {

    @Autowired
    private MonAnRepository monAnRepository;
    @Override
    public List<MonAn> getAll () {
        return monAnRepository.findAll ();
    }

    @Override
    public void save (MonAn monAn) {
        monAnRepository.save (monAn);
    }

    @Override
    public void update (int id) {

    }

    @Override
    public void dalete (int id) {

    }

    @Override
    public MonAn getById (int id) {
        return null;
    }
}
