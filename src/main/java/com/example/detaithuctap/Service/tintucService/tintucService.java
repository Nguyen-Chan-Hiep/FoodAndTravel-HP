package com.example.detaithuctap.Service.tintucService;

import com.example.detaithuctap.Entity.tintuc.news;

import java.util.List;

public interface tintucService {

    public void saveorupdate(news news);
    public List<news> getAll();
    public void delNews(int id);
    public news getById(int id);
}
