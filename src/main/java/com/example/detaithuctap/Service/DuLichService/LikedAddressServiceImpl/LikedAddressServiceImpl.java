package com.example.detaithuctap.Service.DuLichService.LikedAddressServiceImpl;

import com.example.detaithuctap.Entity.DuLich.LikedAddress;
import com.example.detaithuctap.Repository.DuLichRepository.LikedReponsImpl;
import com.example.detaithuctap.Service.DuLichService.LikedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LikedAddressServiceImpl implements LikedService {
    @Autowired
    private LikedReponsImpl reponsitory;
    @Override
    public String likeClick(int idUser, int idAddress) {
        try{
            LikedAddress likedAddress = reponsitory.checkExist(idUser, idAddress);
            reponsitory.delObject(likedAddress);
            return "unlike";
        }
        catch (Exception e){
            LikedAddress likedAddress = new LikedAddress(idUser, idAddress);
            reponsitory.saveOrUpdate(likedAddress);
            return "like";
        }
    }

}
