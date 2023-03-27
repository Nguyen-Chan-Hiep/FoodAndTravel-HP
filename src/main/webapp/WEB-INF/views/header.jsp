<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Start coding here -->
    <c:set var="pagina" value="${requestScope['javax.servlet.forward.request_uri']}" />
    <div id="preloder">
        <div class="loader"></div>
    </div>

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
                        <li class="${pagina.endsWith('/home') ? 'active' : ''}"><a href="/home">Trang chủ</a></li>
                        <li class="${pagina.endsWith('/food') ? 'active' : ''}"><a href="/food">Ẩm thực</a></li>
                        <li class="${pagina.endsWith('/travel') ? 'active' : ''}"><a href="/travel">Du lịch</a></li>
                        <li class="${pagina.endsWith('/news') ? 'active' : ''}"><a href="/news">Tin tức</a></li>
                        <li class="${pagina.endsWith('/contact') ? 'active' : ''}"><a href="/contact">Liên hệ</a></li>
                    </ul>
                </nav>
                <div id="mobile-menu-wrap"></div>
            </div>
        </div>
    </header>
    <!-- Header Section end -->
</body>
</html>