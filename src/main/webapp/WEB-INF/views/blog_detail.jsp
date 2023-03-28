<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Template">
    <meta name="keywords" content="unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>FoodTour</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style.css" type="text/css">
</head>

<body>
    <%@ include file="header.jsp" %>

    <!-- Breadcrumb Section Begin -->
    <div class="breacrumb-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-text">
                        <a href="/home"><i class="fa fa-home"></i> Home</a>
                        <a href="/news">Tin tức</a>
                        <span>Chi tiết</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb Section End -->

    <!-- Blog Details Section Begin -->
    <div class="blog-details">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="blog-details-inner">
                        <div class="blog-detail-title">
                            <h2>${tintuc.tieuDe}</h2>
                            <p>${tintuc.loaiHinh} <span>- ${tintuc.timnepost}</span></p>
                        </div>
                        <div class="blog-large-pic">
                            <img src="img/${tintuc.image}" alt="">
                        </div>
                        <div class="blog-detail-desc">
                            <p>${tintuc.noiDung}</p>
                        </div>
                        <div class="blog-more">
                            <div class="row">
                            <c:forEach var="listimg" items="${listImg}">
                                <div class="col-sm-4">
                                    <img src="img/${listimg}" alt="">
                                </div>
                            </c:forEach>
                            </div>
                        </div>
                        <div class="tag-share">
                            <div class="details-tag">
                                <ul>
                                    <li><i class="fa fa-tags"></i></li>
                                    <li>${tintuc.loaiHinh}</li>
                                </ul>
                            </div>
                            <div class="blog-share">
                                <span>Chia sẻ:</span>
                                <div class="social-links">
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                    <a href="#"><i class="fa fa-google-plus"></i></a>
                                    <a href="#"><i class="fa fa-instagram"></i></a>
                                    <a href="#"><i class="fa fa-youtube-play"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
            <div class="container">
                <div class="customer-review-option">
                    <h4>${slCmt} Lượt đánh giá</h4>
                    <div class="comment-option">
                    <c:forEach var="comment" items="${listComment}">
                        <div class="co-item">
                            <div class="avatar-pic">
                                <img src="img/user/default-user.png" alt="">
                            </div>
                            <div class="avatar-text">
                                <h5>${comment.userName} <span>${comment.timePost}</span></h5>
                                <div class="at-reply">${comment.content}</div>
                            </div>
                        </div>
                    </c:forEach>
                    </div>
                    <div class="leave-comment">
                        <h4>Bình luận</h4>
                        <form action="/news-comment" class="comment-form" method="post">
                            <div class="row">
                                <div class="col-lg-12">
                                    <textarea name = "idNews" value="${tintuc.id}" hidden>${tintuc.id}</textarea>
                                    <textarea name = "content" placeholder="Nhập bình luận của bạn"></textarea>
                                    <button type="submit" class="site-btn">Gửi bình luận</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
    <!-- Blog Details Section End -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="fa fa-long-arrow-up"></i></a>

    <%@ include file="footer.jsp"%>

    <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.countdown.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery.zoom.min.js"></script>
    <script src="js/jquery.dd.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>
</body>

</html>