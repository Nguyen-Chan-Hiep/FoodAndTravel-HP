package com.example.detaithuctap.Service.DuLichService;

import com.example.detaithuctap.Entity.DuLich.dia_diem;

import java.util.List;

public interface diaDiemService {
    public List<dia_diem> getAll();
    public dia_diem getById(int id);

}
