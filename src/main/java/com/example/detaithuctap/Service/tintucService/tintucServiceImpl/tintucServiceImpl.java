package com.example.detaithuctap.Service.tintucService.tintucServiceImpl;

import com.example.detaithuctap.Entity.tintuc.news;
import com.example.detaithuctap.Repository.tintucReponsitory.TinTucReponsImpl;
import com.example.detaithuctap.Service.tintucService.tintucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class tintucServiceImpl implements tintucService {
    @Autowired
    private TinTucReponsImpl reponsitory;
    @Override
    public void saveorupdate(news news) {
        reponsitory.saveOrUpdate(news);
    }

    @Override
    public List<news> getAll(String search) {
        return reponsitory.getAll(search);
    }

    @Override
    public List<news> getAll() {
        return reponsitory.getAll();    }

    @Override
    public void delNews(int id) {
        reponsitory.delete(id);
    }

    @Override
    public news getById(int id) {
        return reponsitory.getById(id);
    }
}
