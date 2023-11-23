package com.example.detaithuctap.Service.DuLichService;

import com.example.detaithuctap.Entity.DuLich.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> getAll();

    List<Hotel> searchAll(String search);
}
