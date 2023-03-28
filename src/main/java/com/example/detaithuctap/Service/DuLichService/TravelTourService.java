package com.example.detaithuctap.Service.DuLichService;

import com.example.detaithuctap.Entity.DuLich.travel_tour;

import java.util.List;

public interface TravelTourService {
    List<travel_tour> getAll();
    List<travel_tour> searchAll(String search, String date, int ngay);
}
