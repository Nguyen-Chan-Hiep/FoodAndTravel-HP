package com.example.detaithuctap.Service.DuLichService.CommentServiceImpl;

import com.example.detaithuctap.Entity.DuLich.CommentAddress;
import com.example.detaithuctap.Repository.DuLichRepository.CommentReponsImpl;
import com.example.detaithuctap.Repository.NguoiDung.NguoiDungRepository;
import com.example.detaithuctap.Service.DuLichService.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CommentServiceImpl implements CommentService {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;
    @Autowired
    private CommentReponsImpl reponsitory;
    @Override
    public List<CommentAddress> loadByIdAddress(int idAddress) {
        List<CommentAddress> commentaAddressList = reponsitory.findByIdAddress(idAddress);

        return commentaAddressList;
    }

    @Override
    public void saveComment(CommentAddress commentaAddress) {
        reponsitory.saveOrUpdate(commentaAddress);
    }

    @Override
    public void updateComment(CommentAddress commentaAddress) {
        reponsitory.saveOrUpdate(commentaAddress);
    }

    @Override
    public void delComment(int id) {
        reponsitory.delete(id);
    }
}
