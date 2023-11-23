
package com.example.detaithuctap.Service.tintucService;

import com.example.detaithuctap.Entity.tintuc.News;

import java.util.List;

public interface tintucService {

    public void saveorupdate(News news);
    public List<News> getAll(String search);
    public List<News> getAll();
    public void delNews(int id);
    public News getById(int id);
}
