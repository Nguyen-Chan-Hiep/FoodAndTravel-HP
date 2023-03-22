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
				<%@include file="danhmuc.jsp"%>
				<div class="col-lg-9 order-1 order-lg-2">
					<div class="food-list">
						<div class="row" id="listMonAn">
							<c:forEach var="s" items="${listM}">
								<div class="col-lg-4 col-sm-6 test">
									<a class="food-item" href="/food-detail?id=${s.id }">
										<div class="food-item__img">
											<img src="img/${s.hinhanh }" alt="" width="300px"
												height="250px" style="border-radius: 10px">
										</div>
										<h4 class="food-item__name">${s.tenmonan}</h4>
										<div class="food-item__tag">
											<span class="fa fa-tag"></span>
											<h5>${s.loai_hinh_am_thuc.ten_loai_hinh}</h5>
										</div>
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
<script>
       
        function loaihinh(x) {
            var s = "/list-mon-an-theo-loai-hinh/" + x.toString();
            $.ajax({
                url: s,
                type: "GET",
                success: function (ress) {
                    var html = "";
                    for (p of ress) {
                        html += `<div class="col-lg-4 col-sm-6">
                                <a class="food-item" href="/food-detail?id=`+ p.id + `">
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
    <style>
        .test a:hover img{
            transform: scale(1.1);
            opacity: 0.8;
        }
        .test a{

            overflow: hidden;
        }
        .test a img{
            transition: all 0.3s ease-in-out;
        }
    </style>
</html>