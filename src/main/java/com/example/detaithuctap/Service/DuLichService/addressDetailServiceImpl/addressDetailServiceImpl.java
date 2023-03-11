package com.example.detaithuctap.Service.DuLichService.addressDetailServiceImpl;

import com.example.detaithuctap.Entity.DuLich.address_detail;
import com.example.detaithuctap.Repository.DuLichRepository.AddressDetailRepons;
import com.example.detaithuctap.Service.DuLichService.address_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class addressDetailServiceImpl implements address_detailService {
    @Autowired
    private AddressDetailRepons reponsitory;
    @Override
    public address_detail findByIdAddress(int id_address) {
        return reponsitory.findByIdAddress(id_address);
    }

    @Override
    public void saveAddress(address_detail addressDetail) {
        reponsitory.saveOrUpdate(addressDetail);
    }

}
