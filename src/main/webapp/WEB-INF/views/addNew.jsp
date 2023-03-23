<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>Foodtour & Travel</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, shrink-to-fit=no" />

<!-- Disable tap highlight on IE -->
<meta name="msapplication-tap-highlight" content="no">

<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css"
	rel="stylesheet">

<link href="assets/css/main.css" rel="stylesheet">
<link href="assets/css/my_style.css" rel="stylesheet">
</head>

<body>
	<div
		class="app-container app-theme-white body-tabs-shadow fixed-header fixed-sidebar">
		<%@ include file="header_FormUser_Admin.jsp"%>


		<div class="app-main">
			<%@ include file="category_FormUser_Admin.jsp"%>

			<div class="app-main__outer">

				<!-- Main -->
				<div class="app-main__inner">
					<div class="app-page-title">
						<div class="page-title-wrapper">
							<div class="page-title-heading">
								<div class="page-title-icon">
									<i class="pe-7s-ticket icon-gradient bg-mean-fruit"></i>
								</div>
								<div>Thêm mới thông tin</div>
							</div>

						</div>
					</div>
					<div class="app-main__inner">
						<div class="row">
							<div class="col-md-12">
								<div class="main-card mb-3 card">
									<div class="card-body">
										<div class="position-relative row form-group">
											<label for="image"
												class="col-md-3 text-md-right col-form-label">Hình
												ảnh</label>
											<div class="col-md-9 col-xl-8">
												<img style="height: 200px; cursor: pointer;"
													class="thumbnail " data-toggle="tooltip"
													title="Chọn hình ảnh" data-placement="bottom"
													src="assets/images/add-image-icon.jpg" alt="Avatar">
												<input name="image" id="img" type="file" onchange="changeImg(this)"
													class="image form-control-file" style="display: none;"
													value=""> <input type="hidden" name="image_old"
													value=""> <small class="form-text text-muted">
													Chọn ảnh (bắt buộc) </small>
											</div>
										</div>

										<div class="position-relative row form-group">
											<label for="name"
												class="col-md-3 text-md-right col-form-label">Tên
												món ăn</label>
											<div class="col-md-9 col-xl-8">
												<input required name="name" id="name" placeholder="Tên"
													type="text" class="form-control" value="">
											</div>
										</div>

										<div class="position-relative row form-group">
											<label for="name"
												class="col-md-3 text-md-right col-form-label">Địa
												chỉ</label>
											<div class="col-md-9 col-xl-8">
												<input required name="diachi" id="diachi"
													placeholder="Địa chỉ" type="text" class="form-control"
													value="">
											</div>
										</div>
										<div class="position-relative row form-group">
											<label for="tag"
												class="col-md-3 text-md-right col-form-label">Loại
												hình</label>
											<div class="col-md-9 col-xl-8">
												<select required name="tag" id="tag" class="form-control">
													<option value="1">Ẩm thực đường phố</option>
													<option value="2">Ẩm thực đặc sắc</option>
													<option value="3">Đồ uống</option>
												</select>
											</div>
										</div>
										<div class="position-relative row form-group">
											<label for="name"
												class="col-md-3 text-md-right col-form-label">Đơn
												giá</label>
											<div class="col-md-9 col-xl-8">
												<input required name="dongia" id="dongia"
													placeholder="Đơn giá" type="text" class="form-control"
													value="">
											</div>
										</div>

										<div class="position-relative row form-group">
											<label for="description"
												class="col-md-3 text-md-right col-form-label">Mô tả</label>
											<div class="col-md-9 col-xl-8">
												<textarea class="form-control" name="mota" id="mota"
													placeholder="Mô tả"></textarea>
											</div>
										</div>

										<div class="position-relative row form-group mb-1">
											<div class="col-md-9 col-xl-8 offset-md-2">
												<a href="#" class="border-0 btn btn-outline-danger mr-1">
													<span class="btn-icon-wrapper pr-1 opacity-8"> <i
														class="fa fa-times fa-w-20"></i>
												</span> <span>Hủy bỏ</span>
												</a>

												<button type="button" onclick="sendData()"
													class="btn-shadow btn-hover-shine btn btn-primary">
													<span class="btn-icon-wrapper pr-2 opacity-8"> <i
														class="fa fa-download fa-w-20"></i>
													</span> <span>Lưu lại</span>
												</button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- End Main -->

				</div>
			</div>

		</div>

		<script src="assets/scripts/jquery-3.2.1.min.js"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

		<script type="text/javascript" src="assets/scripts/main.js"></script>
		<script type="text/javascript" src="assets/scripts/my_script.js"></script>
		<script type="text/javascript">
			function sendData(){
				var img = document.getElementById("img").value;
				var tenmonan = document.getElementById("name").value;
				var diachi = document.getElementById("diachi").value;
				var loaihinh = document.getElementById("tag").value;
				var dongia = document.getElementById("dongia").value;
				var mota = document.getElementById("mota").value;
				$.ajax({
	                url: "/saveInfomation",
	                type: "POST",
	                data:{
	                	img: img,
	                	ten: tenmonan,
	                	diachi: diachi,
	                	loaihinh: loaihinh,
	                	dongia: dongia,
	                	mota: mota
	                },
	                success: function (ress) {
	                    alert(ress);
	                },
	                error: function () {
	                    alert("co loi");
	                }
	            });
			}
		</script>
</body>

</html>