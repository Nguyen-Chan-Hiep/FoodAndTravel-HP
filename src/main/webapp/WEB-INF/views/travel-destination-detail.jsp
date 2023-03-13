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
                                <span>Chi tiết địa điểm du lịch</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Breadcrumb Section End -->

            <!-- Destination Detail Section Begin -->
            <div class="container-xxl py-5">
                <div class="container">
                    <div class="row g-5 destination-detail">
                        <div class="col-lg-6" style="min-height: 400px;">
                            <div class="position-relative h-100">
                                <img class="img-fluid position-absolute w-100 h-100" src="addressimg/${address.hinhAnh}" alt="" style="object-fit: cover;">
                            </div>
                        </div>
                        <div class="col-lg-6 destination-introduce">
                            <h1 class="mb-4">Chào mừng đến với<span class=""> ${address.tenDiaDiem}</span></h1>
                            <p class="mb-4">${address.diaChi}</p>
                            <p class="mb-4">${detail.dichVu}</p>
                            <div class="row gy-2 gx-4 mb-4 destination-service">
                                <div class="col-sm-6">
                                    <p class="mb-0"><i class="fa fa-arrow-right me-2"></i>${detail.gia}</p>
                                </div>

                            </div>
                            <div class="mb-4 destination-status">
                                <span class="fa fa-clock-o"></span>
                                <span class="fd-clock__status">${address.trangThai}</span>
                                <span class="fd-clock__open">${detail.giomocua} đến ${detail.giodongcua}</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Destination Detail Section End -->

            <!-- Introduce destination Begin-->
            <div class="container-xxl py-5">
                <div class="container">
                    <div class="text-center travel-des__intro">
                        <h6 class="travel-title bg-white text-center px-3">Giới thiệu</h6>
                    </div>
                    <div class="travel-des__text row g-4 justify-content-center">
                        <p>${detail.mota}</p>
                    </div>
                </div>
            </div>
            <!-- Introduce destination Begin-->

            <!-- Related destinaion Begin -->
            <section class="gallery" id="gallery">
                <div class="text-center heading">
                    <h6 class="travel-title bg-white text-center px-3">Điểm du lịch liên quan</h6>
                </div>
                <div class="box-container">
                <c:forEach var="listAdd" items="${listAdd}">
                    <a href="/travel-destination-detail?id=${listAdd.id}">
                        <div class="box">
                            <img src="addressimg/${listAdd.hinhAnh}" alt="">
                            <h3>${listAdd.tenDiaDiem}</h3>
                        </div>
                    </a>
                </c:forEach>
                </div>
            </section>
            <!-- Related destination End -->

            <!-- Feature image destination start -->
            <section class="gallery" id="gallery">
                <div class="text-center heading">
                    <h6 class="travel-title bg-white text-center px-3">Ảnh nổi bật</h6>
                </div>
                <div class="box-container">
                <c:forEach var="anh" items="${detail.chi_tiet_hinh_anh}">
                    <div class="box">
                        <img src="detailimg/${anh}" alt="">
                    </div>
                </c:forEach>
                </div>
            </section>
            <!-- Feature image destination end -->

            <!-- Customer Review Begin -->

            <div class="container">
                <div class="customer-review-option">
                    <h4>2 Lượt đánh giá</h4>
                    <div class="comment-option">
                        <div class="co-item">
                            <div class="avatar-pic">
                                <img src="img/user/default-user.png" alt="">
                            </div>
                            <div class="avatar-text">
                                <div class="at-rating">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star-o"></i>
                                </div>
                                <h5>Hải Yến <span>28/02/2022</span></h5>
                                <div class="at-reply">Cát Bà thật là một nơi nghỉ mát lý tưởng.</div>
                            </div>
                        </div>
                        <div class="co-item">
                            <div class="avatar-pic">
                                <img src="img/user/default-user.png" alt="">
                            </div>
                            <div class="avatar-text">
                                <div class="at-rating">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star-o"></i>
                                </div>
                                <h5>Tiến Đạt <span>28/02/2022</span></h5>
                                <div class="at-reply">Đồ ăn ngon!</div>
                            </div>
                        </div>
                    </div>
                    <div class="leave-comment">
                        <h4>Bình luận</h4>
                        <form action="" class="comment-form">
                            <div class="row">
                                <div class="col-lg-12">
                                    <textarea placeholder="Nhập bình luận của bạn"></textarea>
                                    <div class="personal-rating">
                                        <h6>Đánh giá của bạn</h6>
                                        <div class="rate">
                                            <input type="radio" id="star5" name="rating" value="5" />
                                            <label for="star5" title="text">5 stars</label>
                                            <input type="radio" id="star4" name="rating" value="4" />
                                            <label for="star4" title="text">4 stars</label>
                                            <input type="radio" id="star3" name="rating" value="3" />
                                            <label for="star3" title="text">3 stars</label>
                                            <input type="radio" id="star2" name="rating" value="2" />
                                            <label for="star2" title="text">2 stars</label>
                                            <input type="radio" id="star1" name="rating" value="1" />
                                            <label for="star1" title="text">1 star</label>
                                        </div>
                                    </div>
                                    <button type="submit" class="site-btn">Gửi bình luận</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <!-- Customer Review End -->

            <div class="container-xxl py-5">
                <div class="container">
                    <div class="text-center travel-tour">
                        <h6 class="travel-title bg-white text-center px-3">Tour</h6>
                        <h1 class="mb-5">Tour du lịch phổ biến</h1>
                    </div>
                    <div class="row g-4 justify-content-center">
                        <div class="col-lg-4 col-md-6">
                            <div class="package-item">
                                <div class="overflow-hidden">
                                    <img class="img-fluid" src="img/package-1.jpg" alt="">
                                </div>
                                <div class="d-flex border-bottom package-heading">
                                    <small class="flex-fill text-center border-end py-2"><i class="fa fa-map-marker me-2"></i>Hòn Dấu</small>
                                    <small class="flex-fill text-center border-end py-2"><i class="fa fa-calendar-alt me-2"></i>3 ngày</small>
                                    <small class="flex-fill text-center py-2"><i class="fa fa-user me-2"></i>2 người</small>
                                </div>
                                <div class="text-center p-4 travel-price">
                                    <h3 class="mb-0">10.000.000</h3>
                                    <div class="mb-3">
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                    </div>
                                    <p>Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam amet diam eos</p>
                                    <div class="d-flex justify-content-center mb-2 travel-button">
                                        <a href="#booking" class="find-btn">Đặt ngay</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="package-item">
                                <div class="overflow-hidden">
                                    <img class="img-fluid" src="img/package-2.jpg" alt="">
                                </div>
                                <div class="d-flex border-bottom package-heading">
                                    <small class="flex-fill text-center border-end py-2"><i class="fa fa-map-marker me-2"></i>Cát Bà</small>
                                    <small class="flex-fill text-center border-end py-2"><i class="fa fa-calendar-alt me-2"></i>2 ngày</small>
                                    <small class="flex-fill text-center py-2"><i class="fa fa-user me-2"></i>1 người</small>
                                </div>
                                <div class="text-center p-4 travel-price">
                                    <h3 class="mb-0">2.999.999</h3>
                                    <div class="mb-3">
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                    </div>
                                    <p>Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam amet diam eos</p>
                                    <div class="d-flex justify-content-center mb-2 travel-button">
                                        <a href="#booking" class="find-btn">Đặt ngay</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="package-item">
                                <div class="overflow-hidden">
                                    <img class="img-fluid" src="img/package-3.jpg" alt="">
                                </div>
                                <div class="d-flex border-bottom package-heading">
                                    <small class="flex-fill text-center border-end py-2"><i class="fa fa-map-marker me-2"></i>Đồ Sơn</small>
                                    <small class="flex-fill text-center border-end py-2"><i class="fa fa-calendar-alt me-2"></i>4 ngày</small>
                                    <small class="flex-fill text-center py-2"><i class="fa fa-user me-2"></i>6 người</small>
                                </div>
                                <div class="text-center p-4 travel-price">
                                    <h3 class="mb-0">4.999.999</h3>
                                    <div class="mb-3">
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                        <small class="fa fa-star"></small>
                                    </div>
                                    <p>Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam amet diam eos</p>
                                    <div class="d-flex justify-content-center mb-2 travel-button">
                                        <a href="#booking" class="find-btn">Đặt ngay</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

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