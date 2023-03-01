package com.example.detaithuctap.Repository.tintucReponsitory;

import com.example.detaithuctap.Entity.tintuc.news;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface tintucReponsitory extends JpaRepository<news, Integer> {
    @Query(value = "select * from tin_tuc order by thoigianpost", nativeQuery = true)
    List<news> getAllOrderByTime();
}
