package com.example.detaithuctap.Repository.tintucReponsitory;

import com.example.detaithuctap.Entity.tintuc.NewsComment;

import java.util.List;

public interface NewsCommentRepo {
    List<NewsComment> getAllByNewsId(int newsId);
    void saveComment(NewsComment newsComment);
}
