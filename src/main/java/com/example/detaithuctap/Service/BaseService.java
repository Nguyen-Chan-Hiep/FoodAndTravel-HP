package com.example.detaithuctap.Service;

import java.util.List;

public interface BaseService<T> {
    public List<T> getAll();
    public void saveOrUpdate(T t);
    public void delete(int t);
    public T getById(int id);
    public T getByName(String name);
}
