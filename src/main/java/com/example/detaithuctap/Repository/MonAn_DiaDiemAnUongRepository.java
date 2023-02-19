package com.example.detaithuctap.Repository;


import com.example.detaithuctap.Entity.MonAn.MonAn_DiaDiemAnUong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface MonAn_DiaDiemAnUongRepository extends JpaRepository<MonAn_DiaDiemAnUong, Long> {

    @Modifying
    @Query(value = "update tg_monan_diadiemanuong set id_mon_an = :idMonAn, id_dia_diem = :idDiaDiem, " +
            "donvitinh = :donvitinh, motachitietmonan = :motachitietmonan where id = :id", nativeQuery = true)
    public void updateMonan_diadiemanuongById(@Param ("idMonAn") int idMonAn, @Param ("idDiaDiem") int idDiaDiem
    , @Param ("donvitinh") String donvitinh, @Param ("motachitietmonan") String motachitietmonan, @Param ("id")int id);
}
