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

    <%@ include file="header.jsp" %>
    <!-- Hero Section Begin -->
    <section class="hero-section">
        <div class="hero-items owl-carousel">
            <div class="single-hero-items set-bg" data-setbg="img/daohondau.jpg">
            </div>
            <div class="single-hero-items set-bg" data-setbg="img/daocatba.jpg">
            </div>
            <div class="single-hero-items set-bg" data-setbg="img/daohondau.jpg">
            </div>
        </div>
    </section>
    <!-- Hero Section End -->

    <div class="content-introduce">
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
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/banh-da-cua.jpg" alt="" height=340px>
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
                                <a href="">
                                    <h4>Bánh đa cua Hải Phòng</h4>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/nem-cua-be.jpg" alt="" width=300px height=340px>
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
                                <a href="">
                                    <h4>Nem Cua Bể</h4>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-blog">
                            <img src="img/nem-chua.jpg" alt="">
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
                                <a href="">
                                    <h4>Nem chua Hai Phòng</h4>
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
                                <a href="">
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
                                <a href="">
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
                                <a href="">
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
                                <a href="">
                                    <h4>Đảo Cát Bà</h4>
                                </a>
                                <p>Đảo cát bà là một địa điểm du lịch nổi tiếng của Hải Phòng</p>
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
                                <a href="">
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
                                <a href="">
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
    <footer class="footer-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="footer-left">
                        <div class="footer-logo">
                            <a href="index.html">
                                <img src="" height="50" alt="">
                            </a>
                        </div>
                        <ul>
                            <li>Hai Phong</li>
                            <li>Phone: +84 37.39.99.999</li>
                            <li>Email: datdo@gmail.com</li>
                        </ul>
                        <div class="footer-social">
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-pinterest"></i></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2 offset-lg-1">
                    <div class="footer-widget">
                        <h5>Thông tin</h5>
                        <ul>
                            <li><a href="">Về chúng tôi</a></li>
                            <li><a href="">Ẩm thực</a></li>
                            <li><a href="">Du lịch</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-2">
                    <div class="footer-widget">
                        <h5>Thông tin</h5>
                        <ul>
                            <li><a href="">Tài khoản</a></li>
                            <li><a href="">Tin tức</a></li>
                            <li><a href="">Liên hệ</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="newslatter-item">
                        <h5>Tham gia cùng chúng tôi</h5>
                        <p>Nhận thông tin cập nhật qua email về các món ăn và du lịch nổi bật nhất của chúng tôi.</p>
                        <form action="#" class="subscribe-form">
                            <input type="text" placeholder="Nhập mail">
                            <button type="button">Đăng ký</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="copyright-reserved">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="copyright-text">
                            Copyright <script>document.write(new Date().getFullYear());</script> All rights reserved <i class="fa fa-heart-o" aria-hidden="true"></i> by DatDo
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
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