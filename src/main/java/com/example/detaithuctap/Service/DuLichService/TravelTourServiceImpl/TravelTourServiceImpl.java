package com.example.detaithuctap.Service.DuLichService.TravelTourServiceImpl;

import com.example.detaithuctap.Entity.DuLich.TravelTour;
import com.example.detaithuctap.Repository.DuLichRepository.TravelTourReponse;
import com.example.detaithuctap.Service.DuLichService.TravelTourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TravelTourServiceImpl implements TravelTourService {
    @Autowired
    private TravelTourReponse travelTourReponse;
    @Override
    public List<TravelTour> getAll() {
        return travelTourReponse.getAll();
    }

    @Override
    public List<TravelTour> searchAll(String search, String date, int ngay) {
        List<TravelTour> list = travelTourReponse.searchAll(search, date, ngay);
        return list;
    }
}
