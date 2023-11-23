package com.example.detaithuctap.Service.DuLichService;

import com.example.detaithuctap.Entity.DuLich.TravelTour;

import java.util.List;

public interface TravelTourService {
    List<TravelTour> getAll();
    List<TravelTour> searchAll(String search, String date, int ngay);
}
