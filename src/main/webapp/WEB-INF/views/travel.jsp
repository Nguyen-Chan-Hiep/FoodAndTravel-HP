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
	<!-- Start coding here -->
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
                                <li class="active"><a href="/travel">Du lịch</a></li>
                            </ul>
                        </div>
                    </div>
                    <nav class="nav-menu mobile-menu">
                        <ul>
                            <li><a href="/home">Trang chủ</a></li>
                            <li><a href="/food">Ẩm thực</a></li>
                            <li class="active"><a href="/travel">Du lịch</a></li>
                            <li><a href="/news">Tin tức</a></li>
                            <li><a href="/contact">Liên hệ</a></li>
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
                        <a href="/home"><i class="fa fa-home"></i> Home</a>
                        <span>Du lịch</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb Section End -->

    <!-- home section start -->
    <section class="travel-home" id="travel-home">
        <div class="content">
            <span>Khám phá du lịch</span>
            <h3>Hải Phòng</h3>
            <p>Cùng chúng tôi tìm hiểu địa điểm du lịch Hải Phòng nổi tiếng!!!</p>
        </div>
    </section>
    <!-- home section end -->

    
    <!-- services start -->
    <section class="travel-services" id="travel-services">
        <div class="heading">
            <span>Danh mục</span>
            <h1>Tiện ích</h1>
        </div>
        <div class="box-container">
            <a href="/travel-tour">
                <div class="box">
                    <i class="fas fa-globe"></i>
                    <h3>Tour</h3>
                    <p>Trải nghiệm tour du lịch với mức giá hợp lý</p>
                </div>
            </a>
            <a href="/travel-destination">
                <div class="box">
                    <i class="fas fa-hiking"></i>
                    <h3>Khám phá</h3>
                    <p>Trải nghiệm những địa điểm du lịch nổi tiếng</p>
                </div>
            </a>    
            <a href="/travel-hotel">
                <div class="box">
                    <i class="fas fa-hotel"></i>
                    <h3>Khách sạn</h3>
                    <p>Tận hưởng khách sạn với dịch vụ tốt nhất</p>
                </div> 
            </a>       
        </div>
    </section>
    <!-- services end -->

    <!-- destination start -->
    <section class="travel-destination" id="travel-destination">
        <div class="heading">
            <span>Địa điểm du lịch nổi bật</span>
            <h1>Tiếp tục tìm kiếm</h1>
        </div>
        <div class="box-container">
        <c:forEach var="add" items="${listAdd}">
            <div class="box">
                <div class="image">
                    <img src="addressimg/${add.hinhAnh}" alt="">
                </div>
                <div class="content">
                    <p>${add.tenDiaDiem}</p>
                    <a href="/travel-destination-detail?id=${add.id}">đọc thêm <i class="fas fa-angle-right"></i></a>
                </div>
            </div>
        </c:forEach>
        </div>
    </section>
    <!-- destination end -->

    <!-- review section start -->
    <section class="travel-review">
        <div class="box-container">
            <div class="box">
                <p>Mình thấy Cát Bà rất đẹp. Thật là chuyến đi thú vị!</p>
                <div class="user">
                    <img src="img/pic-1.png" alt="">
                    <div class="info">
                        <h3>Đạt</h3>
                    </div>
                </div>
            </div>
            <div class="box">
                <p>Hòn Dấu là địa điểm nghỉ mát lý tưởng!</p>
                <div class="user">
                    <img src="img/pic-2.png" alt="">
                    <div class="info">
                        <h3>Thúy</h3>
                    </div>
                </div>
            </div>
            <div class="box">
                <p>Hải Phòng rất đẹp.</p>
                <div class="user">
                    <img src="img/pic-3.png" alt="">
                    <div class="info">
                        <h3>Hiệp</h3>
                    </div>
                </div>
            </div>
            <div class="box">
                <p>Tôi yêu Hải Phòng!</p>
                <div class="user">
                    <img src="img/pic-4.png" alt="">
                    <div class="info">
                        <h3>Yến</h3>
                    </div>
                </div>
            </div>
        </div>
        <div class="content">
            <span>Đánh giá</span>
            <h3>Nhận xét tích cực từ du khách</h3>
            <p>Cảm ơn các bạn đã có những nhận xét tích cực về du lịch Hải Phòng</p>
        </div>
    </section>

    <!-- review section start -->

    <!-- blog section start -->
    <section class="blogs" id="blogs">
        <div class="heading">
            <span>Bài đăng</span>
            <h1>Trải nghiệm của du khách</h1>
        </div>
        <div class="box-container">
            <div class="box">
                <a href="#">
                    <div class="image">
                        <img src="img/blog-1.jpg" alt="">
                    </div>
                    <div class="content">
                        <a href="#" class="link">Hoàng hôn trên Cát Bà</a>
                        <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Adipisci laudantium delectus, maxime odio ullam sit.</p>
                        <div class="icon">
                            <span><i class="fas fa-clock"></i>15-01-2023</span>
                            <span><i class="fas fa-user"></i>tiến đạt</span>
                        </div>
                    </div>
                </a>
            </div>
            <div class="box">
                <a href="#">
                    <div class="image">
                        <img src="img/blog-2.jpg" alt="">
                    </div>
                    <div class="content">
                        <a href="#" class="link">Hang Động Cát Bà</a>
                        <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Adipisci laudantium delectus, maxime odio ullam sit.</p>
                        <div class="icon">
                            <span><i class="fas fa-clock"></i>15-02-2023</span>
                            <span><i class="fas fa-user"></i>hải yến</span>
                        </div>
                    </div>
                </a>
            </div>
            <div class="box">
                <a href="#">
                    <div class="image">
                        <img src="img/blog-3.jpg" alt="">
                    </div>
                    <div class="content">
                        <a href="#" class="link">Hòn Dấu đẹp tuyệt vời!</a>
                        <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Adipisci laudantium delectus, maxime odio ullam sit.</p>
                        <div class="icon">
                            <span><i class="fas fa-clock"></i>15-03-2023</span>
                            <span><i class="fas fa-user"></i>tùng phạm</span>
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </section>
    <!-- blog section end -->

	<%@ include file="footer.jsp"%>
	<a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="fa fa-long-arrow-up"></i></a>

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