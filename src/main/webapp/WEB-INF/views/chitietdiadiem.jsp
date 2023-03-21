<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<link rel="stylesheet"
	href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
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
						<a href="index.html"><i class="fa fa-home"></i> Home</a> <a
							href="food.html">Ẩm thực</a> <span>Chi tiết</span>
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
								<img src="img/${diadiem.hinhanh }" alt="">
							</div>
						</div>
						<div class="col-lg-6">
							<div class="food-details">
								<div class="fd-title">
									<h3>${diadiem.tendiadiem }</h3>
								</div>
								<div class="fd-rating">
									<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star-o"></i> <span>(5)</span>
								</div>
								<div class="fd-address">
									<span class="fa fa-location-arrow"></span> <span
										class="fd-address__text">${diadiem.diachi }</span>
								</div>
								<div class="fd-clock">
									<span class="fa fa-clock-o"></span> <span
										class="fd-clock__status">Giờ mở cửa</span> <span
										class="fd-clock__open">14:00 - 02:00</span>
										<c:if test="${tg.soluonglike == 0}">
		                                       <a class="heart-icon"
		                                           style="margin-left: 20px; border-color: black;"
		                                           id="heart"><i id="0"
		                                               onclick="changeHeart(${tg.id}, this.id, ${tg.soluonglike})"
		                                               class="fa fa-heart-o text-danger"
		                                               style="font-size: 20px; border-color: black;"></i></a>
		                                   </c:if>
		                                   <c:if test="${tg.soluonglike != 0}">
		                                       <a class="heart-icon"
		                                           style="margin-left: 20px; border-color: black;"
		                                           id="heart"><i id="1"
		                                               onclick="changeHeart(${tg.id}, this.id, ${tg.soluonglike})"
		                                               class="fa fa-heart text-danger"
		                                               style="font-size: 20px; border-color: black;"></i></a>
		                                   </c:if>
		                                   <span id="solike"> Yêu thích (${tg.soluonglike})</span>
								</div>
								<div class="fd-price">
									<span class="fa fa-money"></span> <span
										class="fd-price__detail">${tg.dongia } Đồng</span>
								</div>
							</div>
						</div>
					</div>
					<div class="customer-review-option">
						<h4>Lượt đánh giá</h4>
						<div class="comment-option" id="listComment">
							<c:forEach var="s" items="${listNhanxet }">
								<div class="co-item">
	                                <div class="avatar-pic">
	                                    <img src="img/user/default-user.png" alt="">
	                                </div>
	                                <div class="avatar-text">
	                                    <div class="at-rating">
	                                    <c:forEach var="o" begin="1" end="5">
	                                    	<c:if test="${o <= s.star }">
	                                    		<i class="fa fa-star"></i>
	                                    	</c:if>
	                                    	<c:if test="${o > s.star }">
	                                    		<i class="fa fa-star-o"></i>
	                                    	</c:if>
	                                    </c:forEach>
	                                    </div>
	                                    <h5>${s.user.tendaidien } <span>${s.thoigianpost }</span></h5>
	                                    <div class="at-reply">${s.noidung }</div>
	                                </div>
	                            </div>
							</c:forEach>
						</div>
						<div class="leave-comment">
							<h4>Bình luận</h4>
							<form class="comment-form">
								<div class="row">
									<div class="col-lg-12">
										<textarea id="comment" placeholder="Nhập bình luận của bạn"></textarea>
										<div class="personal-rating">
											<h6>Đánh giá của bạn</h6>
											<div class="rate">
												<input type="radio" id="star5" name="rating" value="5" /> <label
													for="star5" title="text">5 stars</label> <input
													type="radio" id="star4" name="rating" value="4" /> <label
													for="star4" title="text">4 stars</label> <input
													type="radio" id="star3" name="rating" value="3" /> <label
													for="star3" title="text">3 stars</label> <input
													type="radio" id="star2" name="rating" value="2" /> <label
													for="star2" title="text">2 stars</label> <input
													type="radio" id="star1" name="rating" value="1" /> <label
													for="star1" title="text">1 star</label>
											</div>
										</div>
										<button onclick="binhluan()" type="button" class="site-btn">Gửi bình luận</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Food Menu Section End -->

	<!-- Related Food Section Begin -->
	<div class="related-products spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">
						<h2>Địa điểm liên quan</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="product-slider owl-carousel">
					<c:forEach var="s" items="${listKhac}">
						<a class="food-item" href="/chi-tiet-dia-diem?id=${s.id }&&idmonan=${tg.id_mon_an}">
							<div class="food-item__img">
								<img src="img/${s.hinhanh }" alt="" width="200px" height="200px" style="border-radius: 10px">
							</div>
							<h4 class="food-item__name">${s.tendiadiem }</h4>
							<h4 class="food-item__address">${s.diachi }</h4>
						</a>
					</c:forEach>
					 
				</div>

			</div>
		</div>
	</div>
	<!-- Related Food Section End -->

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
	<script>
	
       function changeHeart(idmonan, stt, solike) {
    	   var x = solike;
           if (stt == 1) {
               stt = 0;
               x = x - 1;
              document.getElementById("heart").innerHTML = `<i id=`+stt+`
                                              onclick="changeHeart(${tg.id}, `+stt+`,`+x+`)"
                                              class="fa fa-heart-o text-danger"
                                              style="font-size: 20px; border-color: black;"></i>`;
                                          document.getElementById("solike").innerHTML = ' Yêu thích ('+x+')';
           }
           else {
               stt = 1;
               x = x + 1;
               document.getElementById("heart").innerHTML = `<i id=`+stt+`
                                               onclick="changeHeart(${tg.id}, `+stt+`,`+x+`)"
                                               class="fa fa-heart text-danger"
                                               style="font-size: 20px; border-color: black;"></i>`;
                                           document.getElementById("solike").innerHTML = ' Yêu thích ('+x+')';
           }
           $.ajax({
        	   url: "/them-like",
        	   type: "POST",
        	   data: {
        		   idmonan: idmonan,
        		   stt: stt
        	   }
           });
       }
       function binhluan(){
    	   var comment = document.getElementById("comment").value, x = 0;
    	   var a = document.getElementsByName("rating");
           for (let i = 0; i < a.length; i++) {
               if (a[i].checked === true) {
                   x = a[i].value;
                   break;
               }
           }
           $.ajax({
        	   url: "/comment",
        	   type: "POST",
        	   data: {
        		   comment: comment,
        		   sosao: x, 
        		   idmonan: ${tg.id},
        		   iduser : ${user.id}
        	   },
        	   success: function(data){
        		    document.getElementById("listComment").innerHTML += data;
        		    document.getElementById("comment").value = "";
        	   },
        	   error : function(){
        		   alert("loi");
        	   }
           });
       }
   </script>
</body>
</html>