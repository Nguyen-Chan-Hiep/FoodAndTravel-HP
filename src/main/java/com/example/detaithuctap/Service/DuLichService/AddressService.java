package com.example.detaithuctap.Service.DuLichService;

import com.example.detaithuctap.Entity.DuLich.Address;

import java.util.List;

public interface AddressService {
    public List<Address> getAll();
    public Address getById(int id);
    public List<Address> getByLHName(String name);
    public void saveorupdate(Address dd);
    public void delAddress(Address address1);
    public Address getOne(String tenloaihinh, String tenDiaDiem, String diachi, String trangthai, String hinhanh);
    public void delById(int id);
    public List<Address> searchAddress(String search);
    public List<Address> findByLHId(int lhId);
}