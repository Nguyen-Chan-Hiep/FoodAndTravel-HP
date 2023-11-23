package com.example.detaithuctap.Service.DuLichService.AddressDetailServiceImpl;

import com.example.detaithuctap.Entity.DuLich.AddressDetail;
import com.example.detaithuctap.Repository.DuLichRepository.AddressDetailRepons;
import com.example.detaithuctap.Service.DuLichService.Address_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AddressDetailServiceImpl implements Address_detailService {
    @Autowired
    private AddressDetailRepons reponsitory;
    @Override
    public AddressDetail findByIdAddress(int id_address) {
        return reponsitory.findByIdAddress(id_address);
    }

    @Override
    public void saveAddress(AddressDetail addressDetail) {
        reponsitory.saveOrUpdate(addressDetail);
    }

}
