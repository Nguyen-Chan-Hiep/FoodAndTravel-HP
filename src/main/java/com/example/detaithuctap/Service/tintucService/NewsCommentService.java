package com.example.detaithuctap.Service.tintucService;

import com.example.detaithuctap.Entity.tintuc.NewsComment;

import java.util.List;

public interface NewsCommentService {
    List<NewsComment> getAllByNewsId(int newsId);
    void saveComment(NewsComment newsComment);
}
