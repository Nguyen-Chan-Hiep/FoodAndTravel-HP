package com.example.detaithuctap.Service.DuLichService;

import com.example.detaithuctap.Entity.DuLich.AddressDetail;

public interface Address_detailService {
    public AddressDetail findByIdAddress(int id_address);
    public void saveAddress(AddressDetail addressDetail);
}