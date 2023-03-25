<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Language" content="en">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
			<div class="app-sidebar sidebar-shadow">
				<div class="app-header__logo">
					<div class="logo-src"></div>
					<div class="header__pane ml-auto">
						<div>
							<button type="button"
								class="hamburger close-sidebar-btn hamburger--elastic"
								data-class="closed-sidebar">
								<span class="hamburger-box"> <span
									class="hamburger-inner"></span>
								</span>
							</button>
						</div>
					</div>
				</div>
				<div class="app-header__mobile-menu">
					<div>
						<button type="button"
							class="hamburger hamburger--elastic mobile-toggle-nav">
							<span class="hamburger-box"> <span class="hamburger-inner"></span>
							</span>
						</button>
					</div>
				</div>
				<div class="app-header__menu">
					<span>
						<button type="button"
							class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
							<span class="btn-icon-wrapper"> <i
								class="fa fa-ellipsis-v fa-w-6"></i>
							</span>
						</button>
					</span>
				</div>
				<div class="scrollbar-sidebar">
					<div class="app-sidebar__inner">
						<ul class="vertical-nav-menu">
							<li class="app-sidebar__heading">Menu</li>

							<li class="mm-active"><a href="#"> <i
									class="metismenu-icon pe-7s-plugin"></i>Danh mục <i
									class="metismenu-state-icon pe-7s-angle-down caret-left"></i>
							</a>
								<ul>
									<li><a href="#" onclick="test()"> <i
											class="metismenu-icon"></i> Danh sách thông tin chờ phê duyệt
									</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="app-main__outer">

				<!-- Main -->
				<div class="app-main__inner">
					<div class="app-page-title">
						<div class="page-title-wrapper">
							<div class="page-title-heading">
								<div class="page-title-icon">
									<i class="pe-7s-ticket icon-gradient bg-mean-fruit"></i>
								</div>
								<div>Danh sách thông tin chờ phê duyệt</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-12">
							<div class="main-card mb-3 card">

								<div class="card-header">

									<form>
										<div class="input-group">
											<input type="search" name="search" id="search"
												placeholder="Tìm kiếm" class="form-control"> <span
												class="input-group-append">
												<button type="submit" class="btn btn-primary">
													<i class="fa fa-search"></i>&nbsp; Tìm kiếm
												</button>
											</span>
										</div>
									</form>
								</div>

								<div class="table-responsive">
									<table
										class="align-middle mb-0 table table-borderless table-striped table-hover">
										<thead>
											<tr>
												<th class="text-center">ID</th>
												<th class="text-center">Hình ảnh</th>
												<th class="text-center">Tên món ăn</th>
												<th class="text-center">Tên địa điểm</th>
												<th class="text-center">Địa chỉ</th>
												<th class="text-center">Loại hình</th>
												<th class="text-center">Người đăng</th>
												<th class="text-center">Thao tác</th>
											</tr>
										</thead>

										<tbody>
											<c:forEach var="s" items="${listBV }">
												<tr>
													<td class="text-center text-muted">${s.id }</td>
													<td class="text-center"><img style="height: 60px;"
														data-toggle="tooltip" title="Image"
														data-placement="bottom" src="img/${s.hinhanh }"
														alt=""></td>
													<td class="text-center">${s.name }</td>
													<td class="text-center">${s.tendiadiem }</td>
													<td class="text-center">${s.diachi }</td>
													<td class="text-center">${s.loaihinh }</td>
													<td class="text-center">${s.idnguoidung }</td>
													<td class="text-center"><a href="/monan-show?id=${s.id }"
														class="btn btn-hover-shine btn-outline-primary border-0 btn-sm">
															Chi tiết </a>
														<form class="d-inline" action="" method="post">
															<button
																class="btn btn-hover-shine btn-outline-danger border-0 btn-sm"
																type="submit" data-toggle="tooltip" title="Delete"
																data-placement="bottom"
																onclick="return confirm('Bạn thật sự muốn xóa?')">
																<span class="btn-icon-wrapper opacity-8"> <i
																	class="fa fa-trash fa-w-20"></i>
																</span>
															</button>
														</form></td>
												</tr>
											</c:forEach>



										</tbody>
									</table>
								</div>

								<div class="d-block card-footer">
									<nav role="navigation" aria-label="Pagination Navigation"
										class="flex items-center justify-between">
										<div class="flex justify-between flex-1 sm:hidden">
											<span
												class="relative inline-flex items-center px-4 py-2 text-sm font-medium text-gray-500 bg-white border border-gray-300 cursor-default leading-5 rounded-md">
												« Previous </span> <a href="#page=2"
												class="relative inline-flex items-center px-4 py-2 ml-3 text-sm font-medium text-gray-700 bg-white border border-gray-300 leading-5 rounded-md hover:text-gray-500 focus:outline-none focus:shadow-outline-blue focus:border-blue-300 active:bg-gray-100 active:text-gray-700 transition ease-in-out duration-150">
												Next » </a>
										</div>

										<div
											class="hidden sm:flex-1 sm:flex sm:items-center sm:justify-between">

											<div>
												<span class="relative z-0 inline-flex shadow-sm rounded-md">
													<span aria-disabled="true"
													aria-label="&amp;laquo; Previous"> <span
														class="relative inline-flex items-center px-2 py-2 text-sm font-medium text-gray-500 bg-white border border-gray-300 cursor-default rounded-l-md leading-5"
														aria-hidden="true"> <svg class="w-5 h-5"
																fill="currentColor" viewBox="0 0 20 20">
                                                                <path
																	fill-rule="evenodd"
																	d="M12.707 5.293a1 1 0 010 1.414L9.414 10l3.293 3.293a1 1 0 01-1.414 1.414l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 0z"
																	clip-rule="evenodd"></path>
                                                            </svg>
													</span>
												</span> <span aria-current="page"> <span
														class="relative inline-flex items-center px-4 py-2 -ml-px text-sm font-medium text-gray-500 bg-white border border-gray-300 cursor-default leading-5">1</span>
												</span> <a href="#page=2"
													class="relative inline-flex items-center px-4 py-2 -ml-px text-sm font-medium text-gray-700 bg-white border border-gray-300 leading-5 hover:text-gray-500 focus:z-10 focus:outline-none focus:border-blue-300 focus:shadow-outline-blue active:bg-gray-100 active:text-gray-700 transition ease-in-out duration-150"
													aria-label="Go to page 2"> 2 </a> <a href="#page=2"
													rel="next"
													class="relative inline-flex items-center px-2 py-2 -ml-px text-sm font-medium text-gray-500 bg-white border border-gray-300 rounded-r-md leading-5 hover:text-gray-400 focus:z-10 focus:outline-none focus:border-blue-300 focus:shadow-outline-blue active:bg-gray-100 active:text-gray-500 transition ease-in-out duration-150"
													aria-label="Next &amp;raquo;"> <svg class="w-5 h-5"
															fill="currentColor" viewBox="0 0 20 20">
                                                            <path
																fill-rule="evenodd"
																d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z"
																clip-rule="evenodd"></path>
                                                        </svg>
												</a>
												</span>
											</div>
										</div>
									</nav>
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
</body>

</html>