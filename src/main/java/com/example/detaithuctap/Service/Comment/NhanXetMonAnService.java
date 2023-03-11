package com.example.detaithuctap.Service.Comment;

import com.example.detaithuctap.Entity.MonAn.NhanXetMonAn;
import com.example.detaithuctap.Entity.MonAn.MonAn;
import com.example.detaithuctap.Entity.User.NguoiDung;
import com.example.detaithuctap.Repository.Comment.NhanXetMonAnRepository;
import com.example.detaithuctap.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NhanXetMonAnService implements BaseService<NhanXetMonAn> {

    @Autowired
    private NhanXetMonAnRepository nhanXetMonAnRepository;
    @Override
    public List<NhanXetMonAn> getAll () {
        return null;
    }

    @Override
    public void saveOrUpdate (NhanXetMonAn nhanxetMonAn) {
        nhanXetMonAnRepository.saveOrUpdate (nhanxetMonAn);
    }

    @Override
    public void delete (int t) {

    }

    @Override
    public NhanXetMonAn getById (int id) {
        return nhanXetMonAnRepository.getById (id);
    }

    @Override
    public NhanXetMonAn getByName (String name) {
        return null;
    }

    public List<NhanXetMonAn> getListCommentByIdMonAn(int id){
        return nhanXetMonAnRepository.getListCommentByIdMonAn (id);
    }

    public List<NhanXetMonAn> getByIdUser(int id){
        return nhanXetMonAnRepository.getByIdUser (id);
    }

    public List<NhanXetMonAn> getCommentByIdMonAnAndIdUser(MonAn monAn, NguoiDung nguoiDung){
        return nhanXetMonAnRepository.getCommentByIdMonAnAndIdUser (monAn, nguoiDung);
    }
}
