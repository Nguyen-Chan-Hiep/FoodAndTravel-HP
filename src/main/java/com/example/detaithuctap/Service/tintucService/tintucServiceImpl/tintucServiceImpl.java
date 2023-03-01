package com.example.detaithuctap.Service.tintucService.tintucServiceImpl;

import com.example.detaithuctap.Entity.tintuc.news;
import com.example.detaithuctap.Repository.tintucReponsitory.tintucReponsitory;
import com.example.detaithuctap.Service.tintucService.tintucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class tintucServiceImpl implements tintucService {
    @Autowired
    private tintucReponsitory reponsitory;
    @Override
    public void saveorupdate(news news) {
        reponsitory.save(news);
    }

    @Override
    public List<news> getAll() {
        return reponsitory.getAllOrderByTime();
    }

    @Override
    public void delNews(int id) {
        reponsitory.deleteById(id);
    }
}
