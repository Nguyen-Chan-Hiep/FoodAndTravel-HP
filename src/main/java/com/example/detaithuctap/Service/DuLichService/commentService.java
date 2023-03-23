package com.example.detaithuctap.Service.DuLichService;

import com.example.detaithuctap.Entity.DuLich.commentaAddress;

import java.util.List;

public interface commentService {
    public List<commentaAddress> loadByIdAddress(int inAddress);
    public void saveComment(commentaAddress commentaAddress);
    public void updateComment(commentaAddress commentaAddress);
    public void delComment(int id);
}
