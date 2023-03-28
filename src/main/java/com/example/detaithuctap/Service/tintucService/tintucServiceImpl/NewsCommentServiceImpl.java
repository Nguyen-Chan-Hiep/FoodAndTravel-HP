package com.example.detaithuctap.Service.tintucService.tintucServiceImpl;

import com.example.detaithuctap.Entity.tintuc.NewsComment;
import com.example.detaithuctap.Repository.tintucReponsitory.NewsCommentRepo;
import com.example.detaithuctap.Service.tintucService.NewsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class NewsCommentServiceImpl implements NewsCommentService {
    @Autowired
    private NewsCommentRepo newsCommentRepo;
    @Override
    public List<NewsComment> getAllByNewsId(int newsId) {
        return newsCommentRepo.getAllByNewsId(newsId);
    }

    @Override
    public void saveComment(NewsComment newsComment) {
        newsCommentRepo.saveComment(newsComment);
    }
}
