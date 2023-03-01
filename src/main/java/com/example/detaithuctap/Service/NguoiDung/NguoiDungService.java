package com.example.detaithuctap.Service.NguoiDung;

import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Repository.NguoiDung.NguoiDungRepository;
import com.example.detaithuctap.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NguoiDungService implements BaseService<NguoiDung> {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @Override
    public List<NguoiDung> getAll () {
        return nguoiDungRepository.getAll ();
    }

    @Override
    public void saveOrUpdate (NguoiDung nguoiDung) {
        nguoiDungRepository.saveOrUpdate (nguoiDung);
    }

    @Override
    public void delete (int t) {
        nguoiDungRepository.delete (t);
    }

    @Override
    public NguoiDung getById (int id) {
        try{
            return nguoiDungRepository.getById (id);
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public NguoiDung getByName (String name) {
        return nguoiDungRepository.getByName (name);
    }

    public NguoiDung getByName (String name, String pass) {
        return nguoiDungRepository.getByName (name, pass);
    }

    public List<String> getRole(String name){
        return nguoiDungRepository.getRole (name);
    }
}
