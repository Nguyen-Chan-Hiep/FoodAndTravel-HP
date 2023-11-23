package com.example.detaithuctap.Service.DuLichService.HotelServiceImpl;

import com.example.detaithuctap.Entity.DuLich.Hotel;
import com.example.detaithuctap.Repository.DuLichRepository.HotelReponse;
import com.example.detaithuctap.Service.DuLichService.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelReponse hotelReponse;
    @Override
    public List<Hotel> getAll() {
        return hotelReponse.getAll();
    }

    @Override
    public List<Hotel> searchAll(String search) {
        search = "%" + search + "%";
        List<Hotel> list = hotelReponse.searchAll(search);
        return list;
    }
}
