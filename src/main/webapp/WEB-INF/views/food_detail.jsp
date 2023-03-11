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
<link
	href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap"
	rel="stylesheet">

<!-- Favicon -->
<link href="img/favicon.ico" rel="icon">
<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap"
	rel="stylesheet">

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
						<a href="index.html"><i class="fa fa-home"></i> Home</a> <span>Ẩm
							thực</span>
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
				<div class="col-lg-3 col-md-6 col-sm-8 order-2 order-lg-1">
					<nav class="sidebar">
			            <div class="text">DANH MỤC</div>
			            <ul>
							<c:forEach var="p" items="${listL }">
								<li id='${ p.id}'>
				                    <a onclick="loaihinh(${p.id})" class="feat-btn">${p.ten_loai_hinh}</a>
				                </li>
							</c:forEach>
			            </ul>
			        </nav>
					<div class="blog-sidebar">
						<div class="recent-post">
							<h4>Tin tức nổi bật</h4>
							<div class="recent-blog">
								<a href="#" class="rb-item">
									<div class="rb-pic">
										<img src="img/banhdacua.jpg" alt="">
									</div>
									<div class="rb-text">
										<h6>Top địa điểm bán bánh đa cua nổi tiếng</h6>
										<span>30-02-2023</span>
									</div>
								</a> <a href="#" class="rb-item">
									<div class="rb-pic">
										<img src="img/banhdacua.jpg" alt="">
									</div>
									<div class="rb-text">
										<h6>Top địa điểm bán bánh đa cua nổi tiếng</h6>
										<span>30-02-2023</span>
									</div>
								</a> <a href="#" class="rb-item">
									<div class="rb-pic">
										<img src="img/banhdacua.jpg" alt="">
									</div>
									<div class="rb-text">
										<h6>Top địa điểm bán bánh đa cua nổi tiếng</h6>
										<span>30-02-2023</span>
									</div>
								</a> <a href="#" class="rb-item">
									<div class="rb-pic">
										<img src="img/${monan.hinhanh }" alt="">
									</div>
									<div class="rb-text">
										<h6>Top địa điểm bán bánh đa cua nổi tiếng</h6>
										<span>30-02-2023</span>
									</div>
								</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-9 order-1 order-lg-2">
					<div class="food-list">
						<div class="row">
							<div class="col-lg-12">
								<div class="section-title">
									<h2>
										Giới thiệu về <span>${monan.tenmonan }</span>
									</h2>
								</div>
							</div>

							<div class="col-lg-12">
								<div class="food-featured-img">
									<img src="img/banhdacua.jpg" alt="">
								</div>
								<div class="food-featured-intro">
									<p>${monan.gioithieu }</p>
								</div>
							</div>

							<div class="col-lg-12">
								<div class="section-title">
									<h2>Địa điểm kinh doanh ${monan.tenmonan } nổi bật</h2>
								</div>
							</div>
							
							<c:forEach var="s" items="${monan.diaDiemAnUongs}">
								<div class="col-lg-4 col-sm-6 test">
									<a class="food-item" href="chi-tiet-dia-diem?id=${s.id}&idmonan=${monan.id}" style="height: 250px; border-radius: 10px">
										<div class="food-item__img" style="margin-bottom: 30px">
											<img src="img/${s.hinhanh }" alt="" style="border-radius: 10px" width="250px" height="150px">
										</div>
										<h4 class="food-item__name">${s.tendiadiem }</h4>
										<h4 class="food-item__address">${s.diachi }</h4>
									</a>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Food Menu Section End -->

	<%@ include file="footer.jsp" %>

	<!-- Js Plugins -->
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