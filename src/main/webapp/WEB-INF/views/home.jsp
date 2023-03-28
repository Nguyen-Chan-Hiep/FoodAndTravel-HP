<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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

    <link rel="stylesheet" href="<c:url value=""/>/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="/css/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="/css/style.css" type="text/css">
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
                                <li class="active"><a href="/food">Ẩm thực</a></li>
                                <li><a href="/travel">Du lịch</a></li>
                            </ul>
                        </div>
                    </div>
                    <nav class="nav-menu mobile-menu">
                        <ul>
                            <li class="active"><a href="/home">Trang chủ</a></li>
                            <li><a href="/food">Ẩm thực</a></li>
                            <li><a href="/travel">Du lịch</a></li>
                            <li><a href="/news">Tin tức</a></li>
                            <li><a href="/contact">Liên hệ</a></li>
                        </ul>
                    </nav>
                    <div id="mobile-menu-wrap"></div>
                </div>
            </div>
        </header>
        <!-- Header Section end -->
    <!-- Hero Section Begin -->
        <div class="hero-section">
            <div class="container">
                <div class="row">
                    <div class="hero-items owl-carousel">
                        <div class="single-hero-items">
                            <img src="img/doson.jpg" alt="">
                            <div class="overlay">
                                <h3 id="title">Đồ Sơn</h3>
                            </div>
                        </div>
                        <div class="single-hero-items">
                            <img src="img/banhdacuaHP.jpg" alt="">
                            <div class="overlay">
                                <h3 id="title">Bánh Đa Cua</h3>
                            </div>
                        </div>
                        <div class="single-hero-items">
                            <img src="img/buncacay.jpg" alt="">
                            <div class="overlay">
                                <h3 id="title">Bún Cá Cay</h3>
                            </div>
                        </div>
                        <div class="single-hero-items">
                            <img src="img/daocatba.jpg" alt="">
                            <div class="overlay">
                                <h3 id="title">Đảo Cát Bà</h3>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Hero Section End -->


<!-- About Section Begin -->
    <section class="about">
        <h2 class="heading-about">KHÁM PHÁ HẢI PHÒNG</h2>
        <p class="para-about">Cùng chúng tôi tìm hiểu nét đặc sắc về ẩm thực và du lịch của Hải Phòng ngay thôi nào.</p>
        <div class="container about-us-content">
            <div class="row">
                <div class="col-lg-3 col-md-12">
                    <div class="img-about">
                        <img src="img/haiphong1.jpg" class="img-fluid image-content" alt="">
                    </div>
                </div>
                <div class="col-lg-6 col-md-12">
                    <div class="content-about">
                        <h4 class="heading-content">Giới thiệu</h4>
                        <p class="para-content-about">Hải Phòng là một trong những trung tâm du lịch lớn nhất cả nước với những di tích lịch sử, danh lam thắng cảnh, các lễ hội lớn và những khu du lịch nghỉ mát, giải trí nổi tiếng đạt tiêu chuẩn quốc tế.  Hàng năm, Hải Phòng là một trong những địa diểm thu hút hàng ngàn lượt khách du lịch đến tham quan và nghỉ dưỡng ở những khu du lịch nổi tiếng như Cát Bà, Đồ Sơn, Bạch Đằng Giang...</p>
                        <p class="para-content-about">Ngoài những địa điểm du lịch nổi tiếng, Hải Phòng còn được biết đến là nơi có nền ẩm thực đa dạng, phong phú. Ẩm thực Hải Phòng được nhiều người sành ăn đánh giá là một trong số ít những phong cách chế biến - thưởng thức ẩm thực địa phương đặc sắc, đa dạng, phong phú và tinh tế bậc nhất của Việt Nam. Có thể kể đến một số món ăn nổi bật như: nem cua bể, bánh đa cua, bánh mì cay, pa tê gan, bún cá cay...</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-12">
                    <div class="img-about">
                        <img src="img/haiphong2.jpg" class="img-fluid image-content" alt="">
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- About Section End -->
    <!-- <div class="content-introduce">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title">
                            <h2>Giới thiệu</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="detail-introduce">
                            <p>Hải Phòng là một trong những trung tâm du lịch lớn nhất cả nước với những di tích lịch sử, danh lam thắng cảnh, các lễ hội lớn và những khu du lịch nghỉ mát, giải trí nổi tiếng đạt tiêu chuẩn quốc tế.  Hàng năm, Hải Phòng là một trong những địa diểm thu hút hàng ngàn lượt khách du lịch đến tham quan và nghỉ dưỡng ở những khu du lịch nổi tiếng như Cát Bà, Đồ Sơn, Bạch Đằng Giang...</p>
                            <p>Ngoài những địa điểm du lịch nổi tiếng, Hải Phòng còn được biết đến là nơi có nền ẩm thực đa dạng, phong phú. Ẩm thực Hải Phòng được nhiều người sành ăn đánh giá là một trong số ít những phong cách chế biến - thưởng thức ẩm thực địa phương đặc sắc, đa dạng, phong phú và tinh tế bậc nhất của Việt Nam. Có thể kể đến một số món ăn nổi bật như: nem cua bể, bánh đa cua, bánh mì cay, pa tê gan, bún cá cay...</p>
                            <p>Trong chuyến hành trình này, hãy cùng chúng tôi khám phá những món ăn ngon và địa điểm du lịch độc đáo tại Hải Phòng nhé!!!</p>
                        </div>
                    </div>
                </div>
            </div>

    <!-- Latest Blog Section Begin -->
    <section class="latest-blog spad">
        <div class="container">
            <div class="latest-blog__popular">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title">
                            <h2>Tin tức nổi bật</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                <c:forEach var="noi" items="${tintuc}">
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/${noi.image}" alt="" height=340px>
                            <div class="latest-text">
                                <div class="tag-list">
                                    <div class="tag-item">
                                        <i class="fa fa-calendar-o"></i>
                                        ${noi.timnepost}
                                    </div>
                                </div>
                                <a href="/blog-detail?bid=${noi.id}">
                                    <h4>${noi.tieuDe}</h4>
                                </a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
                </div>
            </div>
            <div class="latest-blog__popular">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title">
                            <h2>Món ăn độc đáo</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/chao-cay.jpg" alt="" height=230px>
                            <div class="latest-text">
                                <div class="tag-list">
                                    <div class="tag-item">
                                        <i class="fa fa-calendar-o"></i>
                                        22/02/2023
                                    </div>
                                    <div class="tag-item">
                                        <i class="fa fa-comment-o"></i>
                                        5
                                    </div>
                                </div>
                                <a href="food-detail?id=17">
                                    <h4>Cháo khoái</h4>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/ca-moi-kho.jpg" alt="" height=230px>
                            <div class="latest-text">
                                <div class="tag-list">
                                    <div class="tag-item">
                                        <i class="fa fa-calendar-o"></i>
                                        22/02/2023
                                    </div>
                                    <div class="tag-item">
                                        <i class="fa fa-comment-o"></i>
                                        5
                                    </div>
                                </div>
                                <a href="food-detail?id=3">
                                    <h4>Cá mòi kho Kiến Thụy</h4>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/dua-dam.jpg" alt="" height=230px>
                            <div class="latest-text">
                                <div class="tag-list">
                                    <div class="tag-item">
                                        <i class="fa fa-calendar-o"></i>
                                        22/02/2023
                                    </div>
                                    <div class="tag-item">
                                        <i class="fa fa-comment-o"></i>
                                        5
                                    </div>
                                </div>
                                <a href="food-detail?id=9">
                                    <h4>Dừa dầm</h4>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="latest-blog__popular">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title">
                            <h2>Địa điểm du lịch nổi tiếng</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/daocatba.jpg" alt="">
                            <div class="latest-text">
                                <div class="tag-list">
                                    <div class="tag-item">
                                        <i class="fa fa-calendar-o"></i>
                                        01/02/2023
                                    </div>
                                    <div class="tag-item">
                                        <i class="fa fa-comment-o"></i>
                                        3
                                    </div>
                                </div>
                                <a href="/travel-destination-detail?id=28">
                                    <h4>Chuỗi Bãi Biển Cát Cò</h4>
                                </a>
                                <p>Chuỗi bãi biển Cát Cò nằm ở Cát Bà - một địa điểm du lịch nổi tiếng của Hải Phòng</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/daohondau.jpg" alt="">
                            <div class="latest-text">
                                <div class="tag-list">
                                    <div class="tag-item">
                                        <i class="fa fa-calendar-o"></i>
                                        22/02/2023
                                    </div>
                                    <div class="tag-item">
                                        <i class="fa fa-comment-o"></i>
                                        5
                                    </div>
                                </div>
                                <a href="/travel-destination-detail?id=32">
                                    <h4>Đảo Hòn Dấu</h4>
                                </a>
                                <p>Đảo Hòn Dấu là một quần đảo nằm ngoài biển.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/doson.jpg" alt="">
                            <div class="latest-text">
                                <div class="tag-list">
                                    <div class="tag-item">
                                        <i class="fa fa-calendar-o"></i>
                                        22/02/2023
                                    </div>
                                    <div class="tag-item">
                                        <i class="fa fa-comment-o"></i>
                                        5
                                    </div>
                                </div>
                                <a href="/travel-destination-detail?id=26">
                                    <h4>Đồ Sơn</h4>
                                </a>
                                <p>Đồ Sơn là một địa điểm du lịch thú vị.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Latest Blog Section End -->

    <!-- Footer Section Begin -->
    <%@ include file="footer.jsp"%>
    <!-- Footer Section End -->

    <!-- Js Plugins -->
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/jquery-ui.min.js"></script>
    <script src="/js/jquery.countdown.min.js"></script>
    <script src="/js/jquery.nice-select.min.js"></script>
    <script src="/js/jquery.zoom.min.js"></script>
    <script src="/js/jquery.dd.min.js"></script>
    <script src="/js/jquery.slicknav.js"></script>
    <script src="/js/owl.carousel.min.js"></script>
    <script src="/js/main.js"></script>
</body>

</html>