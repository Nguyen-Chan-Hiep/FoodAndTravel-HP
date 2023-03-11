package com.example.detaithuctap.Service.DuLichService.likedAddressServiceImpl;

import com.example.detaithuctap.Entity.DuLich.liked_address;
import com.example.detaithuctap.Repository.DuLichRepository.LikedReponsImpl;
import com.example.detaithuctap.Service.DuLichService.likedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class likedAddressServiceImpl implements likedService {
    @Autowired
    private LikedReponsImpl reponsitory;
    @Override
    public String likeClick(int idUser, int idAddress) {
        try{
            liked_address likedAddress = reponsitory.checkExist(idUser, idAddress);
            reponsitory.delObject(likedAddress);
            return "unlike";
        }
        catch (Exception e){
            liked_address likedAddress = new liked_address(idUser, idAddress);
            reponsitory.saveOrUpdate(likedAddress);
            return "like";
        }
    }

}
