package com.example.detaithuctap.Service.BaiViet;

import com.example.detaithuctap.Entity.BaiViet.BaiViet;
import com.example.detaithuctap.Repository.BaiViet.BaiVietRepository;
import com.example.detaithuctap.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BaiVietService implements BaseService<BaiViet> {

    @Autowired
    private BaiVietRepository baiVietRepository;
    @Override
    public List<BaiViet> getAll () {
        return baiVietRepository.getAll();
    }

    @Override
    public void saveOrUpdate (BaiViet baiViet) {
        baiVietRepository.saveOrUpdate (baiViet);
    }

    @Override
    public void delete (int t) {
        baiVietRepository.delete (t);
    }


    @Override
    public BaiViet getById (int id) {
        return baiVietRepository.getById (id);
    }

    @Override
    public BaiViet getByName (String name) {
        return null;
    }
    
    public List<BaiViet> getList(int id){
    	return baiVietRepository.getList(id);
    }
}
