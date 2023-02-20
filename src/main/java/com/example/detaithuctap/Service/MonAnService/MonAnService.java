package com.example.detaithuctap.Service.MonAnService;

import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Repository.MonAnRepository.MonAnRepository;
import com.example.detaithuctap.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MonAnService implements BaseService<MonAn> {

    @Autowired
    private MonAnRepository monAnRepository;

    @Override
    public List<MonAn> getAll () {
        return monAnRepository.getAll ();
    }

    @Override
    public void saveOrUpdate (MonAn monAn) {
        monAnRepository.saveOrUpdate (monAn);
    }

    @Override
    public void delete (int t) {
        monAnRepository.delete (t);
    }

    @Override
    public MonAn getById (int id) {
        return monAnRepository.getById (id);
    }
}
