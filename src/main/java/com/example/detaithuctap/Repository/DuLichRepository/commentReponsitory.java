package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.commentaAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface commentReponsitory extends JpaRepository<commentaAddress,  Integer> {
    List<commentaAddress> findByIdAddress(int idAddress);
}
