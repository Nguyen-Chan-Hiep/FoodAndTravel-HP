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
    <!-- Header Section end -->

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
        <form action="#">
            <div class="inputBox">
                <span>Bạn dự định đi đâu ?</span>
                <input type="text" placeholder="Địa điểm">
            </div>
            <div class="inputBox">
                <span>Ngày khởi hành ?</span>
                <input type="date">
            </div>
            <div class="inputBox">
                <span>Bao nhiêu thành viên ?</span>
                <input type="number" placeholder="0">
            </div>

            <input type="submit" value="Tìm kiếm" class="find-btn">
        </form>
    </section>

    <!-- Find Section End -->

     <!-- Hotel Section Start -->
     <div class="container-xxl py-5 hotel">
        <div class="container">
            <div class="text-center travel-tour">
                <h6 class="travel-title bg-white text-center px-3">Khách sạn</h6>
                <h1 class="mb-5">Một số khách sạn</h1>
            </div>
            <div class="box-container">
            <c:forEach var="hotel" items="${hotels}">
                <div class="box">
                    <img src="detailimg/${hotel.image}" alt="">
                    <div class="travel-hotel">
                        <h2>${hotel.hotel_name}</h2>
                        <h3><i class="fa fa-map-marker"></i> ${hotel.dia_chi}</h3>
                        <div class="stars">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                        </div>
                        <p>${hotel.mo_ta}</p>
                        <div class="price"> ${hotel.gia} <span> / người</span></div>
                        <a target="_blank" rel="noopener noreferrer" href="${hotel.dat_cho}" class="find-btn">Đặt ngay</a>
                    </div>
                </div>
            </c:forEach>
            </div>
            <div class="loading-more">
                <a href="#" class="primary-btn ">Xem thêm</a>
            </div>
        </div>
    </div>
    <!-- Hotel Section End -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="fa fa-long-arrow-up"></i></a>

    <!-- Footer Section Begin -->
    <%@include file="footer.jsp"%>
    <!-- Footer Section End -->

    <!-- Js Plugins -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
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