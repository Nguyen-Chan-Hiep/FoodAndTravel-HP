package com.example.detaithuctap.Service.MonAn;

import com.example.detaithuctap.Entity.MonAn.Loai_hinh_am_thuc;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.MonAn.monan_diadiemanuong;
import com.example.detaithuctap.Repository.MonAn.MonAnRepository;
import com.example.detaithuctap.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MonAnService implements BaseService<MonAn> {

    @Autowired
    private MonAnRepository monAnRepository;

    @Override
    public List<MonAn> getAll () {
        return monAnRepository.getAll ();
    }

    @Override
    public void saveOrUpdate (MonAn monAn) {
        monAnRepository.saveOrUpdate (monAn);
    }

    @Override
    public void delete (int t) {
        monAnRepository.delete (t);
    }

    @Override
    public MonAn getById (int id) {
        return monAnRepository.getById (id);
    }

    @Override
    public MonAn getByName(String name) {
        return monAnRepository.getByName (name);
    }

    public void saveTg(int id_mon_an, int id_dia_diem, Double dongia,String chitietmonan){
        monAnRepository.saveTg (id_mon_an, id_dia_diem, dongia, chitietmonan);
    }

    public List<MonAn> getListMonAnByIdLoaiHinh(Loai_hinh_am_thuc id_loai_hinh){
        return monAnRepository.getListMonAnByIdLoaiHinh (id_loai_hinh);
    }
    
    public monan_diadiemanuong getMonan_diadiemanuong(int idmonan, int iddiadiem) {
    	return monAnRepository.getMonan_diadiemanuong(idmonan, iddiadiem);
    }
    
    public monan_diadiemanuong getMonan_diadiemanuong(int id) {
    	return monAnRepository.getMonan_diadiemanuong(id);
    }
    
    public void save(monan_diadiemanuong monan_diadiemanuong) {
    	monAnRepository.save(monan_diadiemanuong);
    }

    public List<MonAn> search(String search){
        return monAnRepository.search(search);
    }
}
