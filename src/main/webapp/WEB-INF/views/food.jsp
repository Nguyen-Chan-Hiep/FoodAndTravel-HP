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
    <link rel="stylesheet" href="/css/bootstrap.min.css" type="text/css">
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
                        <a href="index.html"><i class="fa fa-home"></i> Home</a>
                        <span>Ẩm thực</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb Section End -->

    <!-- Food Menu Section Begin -->
    <section class="food-menu spad">
        <div class="container">
            <div class="row">
                <%@ include file="danhmuc.jsp" %>
                <div class="col-lg-9 order-1 order-lg-2">
                    <div class="food-list">
                        <div class="row" id ="listMonAn"></div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Food Menu Section End -->

    <!-- Footer Section Begin -->
    <footer class="footer-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="footer-left">
                        <div class="footer-logo">
                            <a href="index.html">
                                <img src="" height="25" alt="">
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

    <script>
        fetch("/list-Mon-An")
        .then(function (res) {
            return res.json();
        })
        .then(function (ress) {

            var html = "";
            for (p of ress) {
                html += `<div class="col-lg-4 col-sm-6">
                    <a class="food-item" href="/food-detail/`+ p.id + `">
                        <div class="food-item__img">
                            <img src="img/`+ p.hinhanh + `" alt="" width=300px height = 250px style="border-radius: 10px">
                        </div>
                        <h4 class="food-item__name">
                            `+ p.tenmonan + `</h4>
                        <div class="food-item__tag">
                            <span class="fa fa-tag"></span>
                            <h5>`+ p.loai_hinh_am_thuc.ten_loai_hinh + `</h5>
                        </div>
                    </a>
                </div>`;
            }
            document.getElementById("listMonAn").innerHTML = html;
        })
        .catch(function (err) {
            alert("co loi!!!");
        });

        function loaihinh(x) {
            var s = "/list-mon-an-theo-loai-hinh/" + x.toString();
            document.getElementById(x.toString()).class = "active";
            $.ajax({
                url: s,
                type: "GET",
                success: function (ress) {
                    var html = "";
                    for (p of ress) {
                        html += `<div class="col-lg-4 col-sm-6">
                                <a class="food-item" href="/food-detail/`+ p.id + `">
                                    <div class="food-item__img">
                                        <img src="img/`+ p.hinhanh + `" alt="" width=300px height = 250px style="border-radius: 10px">
                                    </div>
                                    <h4 class="food-item__name">
                                        `+ p.tenmonan + `</h4>
                                    <div class="food-item__tag">
                                        <span class="fa fa-tag"></span>
                                        <h5>`+ p.loai_hinh_am_thuc.ten_loai_hinh + `</h5>
                                    </div>
                                </a>
                            </div>`;
                    }
                    document.getElementById("listMonAn").innerHTML = html;
                },
                error: function () {
                    alert("co loi");
                }
            });
        }
    </script>
</body>

</html>