package com.example.detaithuctap.Entity.tintuc;

import javax.persistence.*;

@Entity
@Table(name = "news_comment")
public class NewsComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "content")
    private String content;
    @Column(name = "time_post")
    private String timePost;
    @Column(name = "user_id")
    private int idUser;
    @Column(name = "news_id")
    private int idNews;
    @Column(name = "user_name")
    private String userName;

    public NewsComment() {
    }

    public NewsComment(int id, String content, String timePost, int idUser, int idNews, String userName) {
        this.id = id;
        this.content = content;
        this.timePost = timePost;
        this.idUser = idUser;
        this.idNews = idNews;
        this.userName = userName;
    }

    public NewsComment(String content, String timePost, int idUser, int idNews, String userName) {
        this.content = content;
        this.timePost = timePost;
        this.idUser = idUser;
        this.idNews = idNews;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimePost() {
        return timePost;
    }

    public void setTimePost(String timePost) {
        this.timePost = timePost;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdNews() {
        return idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
