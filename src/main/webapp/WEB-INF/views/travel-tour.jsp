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
    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap" rel="stylesheet">

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
	<%@include file="header.jsp"%>

	<!-- Breadcrumb Section Begin -->
        <div class="breacrumb-section">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="breadcrumb-text">
                            <a href="/home"><i class="fa fa-home"></i> Home</a>
                            <a href="/travel">Du lịch</a>
                            <span>Tour du lịch</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Breadcrumb Section End -->

        <!-- Find Section Begin -->

        <section class="find-form" id="find-form">
            <form action="/find-tour">
                <div class="inputBox">
                    <span>Bạn dự định đi đâu ?</span>
                    <input type="text" name="search" placeholder="Địa điểm">
                </div>
                <div class="inputBox">
                    <span>Ngày khởi hành ?</span>
                    <input type="date" name="date">
                </div>
                <div class="inputBox">
                    <span>Bao nhiêu ngày ?</span>
                    <input name="ngay" type="number" placeholder="0">
                </div>

                <input type="submit" value="Tìm kiếm" class="find-btn">
            </form>
        </section>

        <!-- Find Section End -->

        <!-- Package Start -->
        <div class="container-xxl py-5">
            <div class="container">
                <div class="text-center travel-tour">
                    <h6 class="travel-title bg-white text-center px-3">Tour</h6>
                    <h1 class="mb-5">Một số gói Tour du lịch</h1>
                </div>
                <div class="row g-4 justify-content-center">
                <c:forEach var="tour" items="${tours}">
                    <div class="col-lg-4 col-md-6">
                        <div class="package-item">
                            <div class="overflow-hidden">
                                <img class="img-fluid" src="detailimg/${tour.image}" alt="">
                            </div>
                            <div class="d-flex border-bottom package-heading">
                                <small class="flex-fill text-center border-end py-2"><i class="fa fa-map-marker me-2"></i>${tour.dia_diem}</small>
                                <small class="flex-fill text-center border-end py-2"><i class="fa fa-calendar-alt me-2"></i>${tour.so_ngay} ngày</small>
                                <small class="flex-fill text-center py-2"><i class="fa fa-user me-2"></i>1 người</small>
                            </div>
                            <div class="text-center p-4 travel-price">
                                <h3 class="mb-0">${tour.gia}</h3>
                                <div class="mb-3">
                                    <small class="fa fa-star"></small>
                                    <small class="fa fa-star"></small>
                                    <small class="fa fa-star"></small>
                                    <small class="fa fa-star"></small>
                                    <small class="fa fa-star"></small>
                                </div>
                                <p>${tour.lich_trinh}</p>
                                <div class="d-flex justify-content-center mb-2 travel-button">
                                    <a target="_blank" rel="noopener noreferrer" href="${tour.dat_tour}" class="find-btn">Đặt ngay</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
                </div>

            </div>
        </div>
        <!-- Package End -->


        <!-- Booking Start -->
        <section class="container booking" id="booking">
            <h1 class="heading-title">Đặt chuyến đi của bạn!</h1>
            <form action="" class="book-form">
                <div class="flex">
                    <div class="inputBox">
                        <span>Tên: </span>
                        <input type="text" placeholder="Nhập tên của bạn" required>
                    </div>
                    <div class="inputBox">
                        <span>Email: </span>
                        <input type="email" placeholder="Nhập email của bạn" required>
                    </div>
                    <div class="inputBox">
                        <span>Số điện thoại: </span>
                        <input type="text" placeholder="Nhập số điện thoại của bạn" required>
                    </div>
                    <div class="inputBox">
                        <span>Địa chỉ: </span>
                        <input type="text" placeholder="Nhập địa chỉ của bạn" required>
                    </div>
                    <div class="inputBox">
                        <span>Địa điểm: </span>
                        <input type="text" placeholder="Nhập địa điểm bạn muốn đến" required>
                    </div>
                    <div class="inputBox">
                        <span>Số thành viên: </span>
                        <input type="text" placeholder="Số thành viên tham gia" required>
                    </div>
                    <div class="inputBox">
                        <span>Ngày khởi hành: </span>
                        <input type="date" required>
                    </div>
                    <div class="inputBox">
                        <span>Ngày kết thúc: </span>
                        <input type="date" required>
                    </div>
                </div>
                <input type="submit" value="Đặt chuyến đi" class="primary-btn">
            </form>
        </section>
        <!-- Booking Start -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="fa fa-long-arrow-up"></i></a>

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