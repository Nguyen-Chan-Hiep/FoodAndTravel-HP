<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
                                    <a href="index.html"><i class="fa fa-home"></i> Home</a>
                                    <a href="food.html">Ẩm thực</a>
                                    <span>Chi tiết</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Breadcrumb Section End -->

                <!-- Food Menu Section Begin -->
                <section class="food-menu spad page-details">
                    <div class="container">
                        <div class="row">
                            <%@ include file="danhmuc.jsp" %>
                                <div class="col-lg-9 order-1 order-lg-2">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="food-detail-img">
                                                <img src="<c:url value='/img/${monan.hinhanh}'/>" alt="" height=270px>
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="food-details">
                                                <div class="fd-title">
                                                    <span>${monan.loai_hinh_am_thuc.ten_loai_hinh}</span>
                                                    <h3>${monan.tenmonan}</h3>

                                                </div>
                                                <c:if test="${like.status == 0 || like == null}">
                                                    <a class="heart-icon"
                                                        style="margin-left: 20px; border-color: black;"
                                                        id="heart"><i id="0"
                                                            onclick="changeHeart(${monan.id}, ${user.id}, this.id, ${monan.soluonglike})"
                                                            class="fa fa-heart-o text-danger"
                                                            style="font-size: 20px; border-color: black;"></i></a>
                                                </c:if>
                                                <c:if test="${like.status != 0 && like != null}">
                                                    <a class="heart-icon"
                                                        style="margin-left: 20px; border-color: black;"
                                                        id="heart"><i id="1"
                                                            onclick="changeHeart(${monan.id}, ${user.id},this.id,${monan.soluonglike})"
                                                            class="fa fa-heart text-danger"
                                                            style="font-size: 20px; border-color: black;"></i></a>
                                                </c:if>
                                                <span id="solike"> Yêu thích (${monan.soluonglike})</span>
                                                <div class="fd-price">
                                                    <span class="fa fa-money"></span>
                                                    <span class="fd-price__detail">30.000đ - 50.000đ</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="food-tab">
                                        <div class="row">
                                            <div class="col-lg-7">
                                                <h3>Giới thiệu</h3>
                                                <p>Là một quán bánh đa cua lâu đời, hằng năm thu hút
                                                    nhiều khách du lịch cũng như trong địa phương đến
                                                    thưởng thức.</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </div>
                    </div>
                    <div class="container" style="margin-left: 385px;">
                        <h3>Địa điểm kinh doanh ${monan.tenmonan} nổi bật</h3>
                        <c:forEach var="s" items="${listD}">
                            <div class="row" style="margin-bottom: 10px; margin-top: 20px;">
                                <div class="col-sm-6 col-md-2">
                                    <img alt="anh dep" src="<c:url value='/img/${s.hinhanh}'/>" width="150px" height="130px"
                                        style="border-radius: 10px;">
                                </div>
                                <div class="col-sm-9">
                                    <h3>${s.tendiadiem}</h3>
                                    <strong>Địa chỉ: </strong>${s.diachi}
                                    <div style="margin-top: 5px;">
                                        <p><strong class="text-danger">Giờ mở cửa: </strong>15:00 pm - 23:00 pm</p>
                                        <a href="/chi-tiet-dia-diem/"+${s.id}+"">Chi tiết địa điểm</a>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
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
                                    <p>Nhận thông tin cập nhật qua email về các món ăn và du lịch nổi bật nhất của chúng
                                        tôi.</p>
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
                                        Copyright
                                        <script>document.write(new Date().getFullYear());</script> All rights reserved
                                        <i class="fa fa-heart-o" aria-hidden="true"></i> by DatDo
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </footer>
                <!-- Footer Section End -->

                <!-- Js Plugins -->
                <script src="/js/jquery-3.3.1.min.js"></script>
                <script src="//js/bootstrap.min.js"></script>
                <script src="/js/jquery-ui.min.js"></script>
                <script src="/js/jquery.countdown.min.js"></script>
                <script src="/js/jquery.nice-select.min.js"></script>
                <script src="/js/jquery.zoom.min.js"></script>
                <script src="/js/jquery.dd.min.js"></script>
                <script src="/js/jquery.slicknav.js"></script>
                <script src="/js/owl.carousel.min.js"></script>
                <script src="/js/main.js"></script>
                <script>
                    function changeHeart(idmonan, idnguoidung, stt, solike) {
                        var x = solike;
                        if (stt == 1) {
                            stt = 0;
                            x = x - 1;
                           document.getElementById("heart").innerHTML = `<i id=`+stt+`
                                                           onclick="changeHeart(${monan.id}, ${user.id}, `+stt+`,`+x+`)"
                                                           class="fa fa-heart-o text-danger"
                                                           style="font-size: 20px; border-color: black;"></i>`;
                                                       document.getElementById("solike").innerHTML = ' Yêu thích ('+x+')';
                        }
                        else {
                            stt = 1;
                            x = x + 1;
                            document.getElementById("heart").innerHTML = `<i id=`+stt+`
                                                            onclick="changeHeart(${monan.id}, ${user.id}, `+stt+`,`+x+`)"
                                                            class="fa fa-heart text-danger"
                                                            style="font-size: 20px; border-color: black;"></i>`;
                                                        document.getElementById("solike").innerHTML = ' Yêu thích ('+x+')';
                        }
                        $.ajax({
                            url: "http://localhost:8081/them-like-mon-an/"+idmonan+"/"+idnguoidung,
                            type: "POST",
                            error: function(){
                                alert("co loi!!");
                            }
                        });
                    }
                </script>
        </body>
        <style type='text/css'>
                a:hover{
                    color: red;
                    text-decoration: none;
                }
                </style>
        </html>