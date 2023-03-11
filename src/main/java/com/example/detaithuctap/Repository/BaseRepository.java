package com.example.detaithuctap.Repository;



import java.util.List;


public interface BaseRepository<T> {

    public List<T> getAll();
    public void saveOrUpdate(T t);
    public void delete(int id);
    public T getById(int id);
    public T getByName(String name);
}
