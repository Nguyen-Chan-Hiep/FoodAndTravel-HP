package com.example.detaithuctap.Repository.MonAnRepository;

import com.example.detaithuctap.Entity.MonAn.MonAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonAnRepository extends JpaRepository<MonAn, Long> {
}
