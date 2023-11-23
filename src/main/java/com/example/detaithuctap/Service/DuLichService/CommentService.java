package com.example.detaithuctap.Service.DuLichService;

import com.example.detaithuctap.Entity.DuLich.CommentAddress;

import java.util.List;

public interface CommentService {
    public List<CommentAddress> loadByIdAddress(int inAddress);
    public void saveComment(CommentAddress commentaAddress);
    public void updateComment(CommentAddress commentaAddress);
    public void delComment(int id);
}
