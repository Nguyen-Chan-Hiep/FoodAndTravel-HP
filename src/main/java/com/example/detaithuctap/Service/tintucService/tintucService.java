<<<<<<< HEAD
//package com.example.detaithuctap.Service.tintucService;
//
//import com.example.detaithuctap.Entity.tintuc.news;
//
//import java.util.List;
//
//public interface tintucService {
//
//    public void saveorupdate(news news);
//    public List<news> getAll();
//    public void delNews(int id);
//}
=======
package com.example.detaithuctap.Service.tintucService;

import com.example.detaithuctap.Entity.tintuc.news;

import java.util.List;

public interface tintucService {

    public void saveorupdate(news news);
    public List<news> getAll(String search);
    public List<news> getAll();
    public void delNews(int id);
    public news getById(int id);
}
>>>>>>> ea30e2cfb04152c2a3b90584e338d6d916f329ce
