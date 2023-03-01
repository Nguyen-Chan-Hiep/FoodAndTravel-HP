package com.example.detaithuctap.Repository.DuLichRepository;

import com.example.detaithuctap.Entity.DuLich.liked_address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface likedAddressReponsitory extends JpaRepository<liked_address, Integer> {
    @Query(value = "select * from liked_diadiem where id_user = :idUser and id_dia_diem = :idAddress", nativeQuery = true)
    liked_address checkExist(int idUser, int idAddress);
}
