package com.example.detaithuctap.Repository;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BaseRepository<T> {

    public List<T> getAll();
    public void saveOrUpdate(T t);
    public void delete(int id);
    public T getById(int id);
    public T getByName(String name);
}
