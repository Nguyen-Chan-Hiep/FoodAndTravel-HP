package com.example.detaithuctap.Service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


public interface BaseService<T> {
    public List<T> getAll();
    public void saveOrUpdate(T t);
    public void delete(int t);
    public T getById(int id);
}
