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

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

     <!-- font awesome cdn link  -->
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

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
                                <a href="index.html">
                                    <img src="img/logo.png" height="50" alt="">
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-7 col-md-7">
                        <form action="/search-all">
                            <div class="advanced-search">
                                <!-- <button type="button" class="category-btn">Danh mục</button> -->
                                <select name="catagory" class="category-btn">
                                    <option value="1">Du lịch</option>
                                    <option value="2">Ẩm thực</option>
                                  </select>
                                <div class="input-group">
                                    <input name="search" type="text" placeholder="Bạn cần tìm kiếm?">
                                    <button type="submit"><i class="ti-search"></i></button>
                                </div>
                            </div>
                        </form>
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
                                <li><a href="/food">Ẩm thực</a></li>
                                <li><a href="/travel">Du lịch</a></li>
                            </ul>
                        </div>
                    </div>
                    <nav class="nav-menu mobile-menu">
                        <ul>
                            <li><a href="/home">Trang chủ</a></li>
                            <li><a href="/food">Ẩm thực</a></li>
                            <li><a href="/travel">Du lịch</a></li>
                            <li><a href="/news">Tin tức</a></li>
                            <li class="active"><a href="/contact">Liên hệ</a></li>
                        </ul>
                    </nav>
                    <div id="mobile-menu-wrap"></div>
                </div>
            </div>
        </header>
        <!-- Header Section end -->

	<!-- Breadcrumb Section Begin -->
	<div class="breacrumb-section">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="breadcrumb-text">
                            <a href="#"><i class="fa fa-home"></i> Home</a>
                            <span>Liên hệ</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Breadcrumb Section End -->

        <!-- Map Section Begin -->
        <div class="map spad">
            <div class="container">
                <div class="map-inner">
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d59658.012144547516!2d106.66372692388887!3d20.84681350448997!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x314a7af39e3f1ad3%3A0xa5ffc85ff87a07e8!2zSOG6o2kgUGjDsm5nLCBWaeG7h3QgTmFt!5e0!3m2!1svi!2s!4v1677167086681!5m2!1svi!2s"
                    height="610" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade">
                    </iframe>
                    <div class="icon">
                        <i class="fa fa-map-marker"></i>
                    </div>
                </div>
            </div>
        </div>
        <!-- Map Section End -->

        <!-- Contact Section Begin -->
        <section class="contact-section spad">
            <section class="container">
                <div class="row">
                    <div class="col-lg-5">
                        <div class="contact-title">
                            <h4>Liên hệ với chúng tôi</h4>
                            <p>Chúng tôi sẽ giải đáp thắc mắc bất cứ khi nào bạn cần.</p>
                        </div>
                        <div class="contact-widget">
                            <div class="cw-item">
                                <div class="ci-icon">
                                    <i class="ti-location-pin"></i>
                                </div>
                                <div class="ci-text">
                                    <span>Địa chỉ:</span>
                                    <p>Hải Phòng</p>
                                </div>
                            </div>
                            <div class="cw-item">
                                <div class="ci-icon">
                                    <i class="ti-mobile"></i>
                                </div>
                                <div class="ci-text">
                                    <span>Số điện thoại:</span>
                                    <p>+84 99.99.99.999</p>
                                </div>
                            </div>
                            <div class="cw-item">
                                <div class="ci-icon">
                                    <i class="ti-email"></i>
                                </div>
                                <div class="ci-text">
                                    <span>Email:</span>
                                    <p>datvbhp123@gmail.com</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 offset-lg-1">
                        <div class="contact-form">
                            <div class="leave-comment">
                                <h4>Phản hồi</h4>
                                <p>Nhân viên của chúng tôi sẽ gọi lại cho bạn sớm nhất có thể.</p>
                                <form action="#" class="comment-form">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <input type="text" placeholder="Tên của bạn">
                                        </div>
                                        <div class="col-lg-6">
                                            <input type="text" placeholder="Địa chỉ Email">
                                        </div>
                                        <div class="col-lg-12">
                                            <textarea placeholder="Phản hồi của bạn"></textarea>
                                            <button type="submit" class="site-btn">Gửi</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </section>
    <!-- blog section end -->

	<%@ include file="footer.jsp"%>
</body>
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

</html>