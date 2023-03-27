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
    <!-- Header Section begin -->
        <header class="header-section">
            <div class="header-top">
                <div class="container">
                    <div class="ht-left">
                        <div class="mail-service">
                            <i class="fa fa-envelope"></i>
                            datdo@gmail.com
                        </div>
                        <div class="phone-service">
                            <i class="fa fa-phone"></i>
                            +84 37.39.99.999
                        </div>
                    </div>

                    <div class="ht-right">
                        <c:if test="${user == null }">
                            <a href="/login" class="login-panel"><i class="fa fa-user"></i>Đăng nhập</a>
                        </c:if>
                        <c:if test="${user != null }">
                            <a href="/j_spring_security_logout" class="login-panel"> Đăng xuất</a><a href="userDetail"><strong class="login-panel">Hello, ${user.getUsername()}</strong></a>
                        </c:if>
                        <div class="top-social">
                            <a href="https://www.facebook.com/"><i class="ti-facebook"></i></a>
                            <a href="#"><i class="ti-twitter-alt"></i></a>
                            <a href="#"><i class="ti-linkedin"></i></a>
                            <a href="#"><i class="ti-pinterest"></i></a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container">
                <div class="inner-header">
                    <div class="row">
                        <div class="col-lg-3 col-md-3">
                            <div class="logo">
                                <a href="/home">
                                    <img src="img/logo.png" height="50" alt="">
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-7 col-md-7">
                            <div class="advanced-search">
                                <button type="button" class="category-btn">Danh mục</button>
                                <div class="input-group">
                                    <input name="search" type="text" placeholder="Bạn cần tìm kiếm?">
                                    <button type="button"><i class="ti-search"></i></button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="nav-item">
                <div class="container">
                    <div class="nav-depart">
                        <div class="depart-btn">
                            <i class="ti-menu"></i>
                            <span>Danh mục</span>
                            <ul class="depart-hover">
                                <li class="active"><a href="/food">Ẩm thực</a></li>
                                <li><a href="/travel">Du lịch</a></li>
                            </ul>
                        </div>
                    </div>
                    <nav class="nav-menu mobile-menu">
                        <ul>
                            <li><a href="/home">Trang chủ</a></li>
                            <li><a href="/food">Ẩm thực</a></li>
                            <li><a href="/travel">Du lịch</a></li>
                            <li class="active"><a href="/news">Tin tức</a></li>
                            <li><a href="/contact">Liên hệ</a></li>
                        </ul>
                    </nav>
                    <div id="mobile-menu-wrap"></div>
                </div>
            </div>
        </header>
        <!-- Header Section end -->
    <!-- Header Section end -->

    <!-- Breadcrumb Section Begin -->
    <div class="breacrumb-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-text">
                        <a href="/home"><i class="fa fa-home"></i> Home</a>
                        <span>Tin tức</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb Section End -->

    <!-- Blog Section Begin -->
    <section class="blog-section spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 col-sm-8 order-2 order-lg-1">
                    <div class="blog-sidebar">
                        <div class="search-form">
                            <h4>Search</h4>
                            <form action="/searchnews">
                                <input name="search" type="text" placeholder="Tìm kiếm..." value="">
                                <button type="submit"><i class="fa fa-search"></i></button>
                            </form>
                        </div>
                        <div class="recent-post">
                            <h4>Bài viết gần đây</h4>
                            <div class="recent-blog">
                            <c:forEach var="noi" items="${noibat}">
                                <a href="/blog-detail?bid=${noi.id}" class="rb-item">
                                    <div class="rb-pic">
                                        <img weight="300px" height="200px" src="img/${noi.image}" alt="">
                                    </div>
                                    <div class="rb-text">
                                        <h6>${noi.tieuDe}</h6>
                                        <p>${noi.loaiHinh} <span>- ${news.noi}</span></p>
                                    </div>
                                </a>
                            </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-9 order-1 order-lg-2">
                    <div class="row">
                    <c:forEach var="news" items="${listNews}">
                        <div class="col-lg-6 col-sm-6">
                            <div class="blog-item">
                                <div class="bi-pic">
                                    <img src="img/${news.image}" alt="">
                                </div>
                                <div class="bi-text">
                                    <a href="/blog-detail?bid=${news.id}">
                                        <h4>${news.tieuDe}</h4>
                                    </a>
                                    <p>${news.loaiHinh} <span>- ${news.timnepost}</span></p>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Blog Section End -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="fa fa-long-arrow-up"></i></a>

    <!-- Footer Section Begin -->
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