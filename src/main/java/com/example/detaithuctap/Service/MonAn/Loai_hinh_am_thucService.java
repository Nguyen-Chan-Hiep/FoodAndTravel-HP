package com.example.detaithuctap.Service.MonAn;

import com.example.detaithuctap.Entity.MonAn.Loai_hinh_am_thuc;
import com.example.detaithuctap.Repository.MonAn.Loai_hinh_am_thucRepository;
import com.example.detaithuctap.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class Loai_hinh_am_thucService implements BaseService<Loai_hinh_am_thuc> {

    @Autowired
    private Loai_hinh_am_thucRepository loai_hinh_am_thucRepository;
    
    @Override
    public List<Loai_hinh_am_thuc> getAll () {
        return loai_hinh_am_thucRepository.getAll ();
    }

    @Override
    public void saveOrUpdate (Loai_hinh_am_thuc loai_hinh_am_thuc) {

    }

    @Override
    public void delete (int t) {

    }

    @Override
    public Loai_hinh_am_thuc getById (int id) {
        return loai_hinh_am_thucRepository.getById (id);
    }

    @Override
    public Loai_hinh_am_thuc getByName (String name) {
        return null;
    }
}
