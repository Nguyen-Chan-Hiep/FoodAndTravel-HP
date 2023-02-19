package com.example.detaithuctap.Repository;

import com.example.detaithuctap.Entity.MonAn.DiaDiemAnUong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DiaDiemAnUongRepository extends JpaRepository<DiaDiemAnUong, Long> {

    @Modifying
    @Query(value = "update dia_diem_an_uong set idd = :id where diachi = :diachi", nativeQuery = true)
    public void update(@Param ("id")int id, @Param ("diachi")String diachi);
}
