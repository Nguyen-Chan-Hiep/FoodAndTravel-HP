package com.example.detaithuctap.Service;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


public interface BaseService<T> {
    public List<T> getAll();
    public void save(T t);

    @Modifying
    @Query(value="update :tb_name where id = :id set  ", nativeQuery = true)
    public void update(int id);
    public void dalete(int id);
    public T getById(int id);
}
