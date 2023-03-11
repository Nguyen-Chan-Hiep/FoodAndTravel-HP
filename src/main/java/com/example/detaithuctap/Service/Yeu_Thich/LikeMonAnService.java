package com.example.detaithuctap.Service.Yeu_Thich;

import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Entity.MonAn.LikeMonAn;
import com.example.detaithuctap.Repository.Yeu_Thich.LikeMonAnepository;
import com.example.detaithuctap.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LikeMonAnService implements BaseService<LikeMonAn> {

    @Autowired
    private LikeMonAnepository likeMonAnepository;

    @Override
    public List<LikeMonAn> getAll () {
        return null;
    }

    @Override
    public void saveOrUpdate (LikeMonAn likeMonAn) {
        likeMonAnepository.saveOrUpdate (likeMonAn);
    }

    @Override
    public void delete (int t) {

    }

    @Override
    public LikeMonAn getById (int id) {
        return null;
    }

    @Override
    public LikeMonAn getByName (String name) {
        return null;
    }
    public LikeMonAn getLikeByIdMonAnAndIdUser(MonAn monAn, NguoiDung nguoiDung){
        try{
            return likeMonAnepository.getLikeByIdMonAnAndIdUser (monAn, nguoiDung);
        }catch (Exception e){
            return null;
        }

    }
}
