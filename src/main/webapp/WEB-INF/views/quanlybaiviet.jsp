<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Foodtour & Travel</title>
    <meta name="viewport"
        content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, shrink-to-fit=no" />

    <!-- Disable tap highlight on IE -->
    <meta name="msapplication-tap-highlight" content="no">

    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">

    <link href="assets/css/main.css" rel="stylesheet">
    <link href="assets/css/my_style.css" rel="stylesheet">
</head>

<body>
    <div class="app-container app-theme-white body-tabs-shadow fixed-header fixed-sidebar">
        <%@ include file="header_FormUser_Admin.jsp" %>

        <div class="app-main">
            <%@ include file="category_FormUser_Admin.jsp" %>

            <div class="app-main__outer">

                <!-- Main -->
                <div class="app-main__inner">
                    <div class="app-page-title">
                        <div class="page-title-wrapper">
                            <div class="page-title-heading">
                                <div class="page-title-icon">
                                    <i class="pe-7s-ticket icon-gradient bg-mean-fruit"></i>
                                </div>
                                <div>
                                    Thông tin người dùng
                                    <div class="page-title-subheading">
                                        Xem, tạo, sửa, xóa và quản lý bài viết
                                    </div>
                                </div>
                            </div>

                            <div class="page-title-actions">
                                <a href="/addNew" class="btn-shadow btn-hover-shine mr-3 btn btn-primary">
                                    <span class="btn-icon-wrapper pr-2 opacity-7">
                                        <i class="fa fa-plus fa-w-20"></i>
                                    </span>
                                    Thêm mới
                                </a>
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
                                                placeholder="Tìm kiếm" class="form-control">
                                            <span class="input-group-append">
                                                <button type="submit" class="btn btn-primary">
                                                    <i class="fa fa-search"></i>&nbsp;
                                                    Tìm kiếm
                                                </button>
                                            </span>
                                        </div>
                                    </form>
                                </div>

                                <div class="table-responsive">
                                    <table class="align-middle mb-0 table table-borderless table-striped table-hover">
                                        <thead>
                                            <tr>
												<th class="text-center">ID</th>
												<th class="text-center">Hình ảnh</th>
												<th class="text-center">Tên món ăn</th>
												<th class="text-center">Tên địa điểm</th>
												<th class="text-center">Địa chỉ</th>
												<th class="text-center">Loại hình</th>
												<th class="text-center">Người đăng</th>
											</tr>
                                        </thead>

                                        <tbody>
											
                                            <c:forEach var="s" items="${listBaiviet }">
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
                                                « Previous
                                            </span>

                                            <a href="#page=2"
                                                class="relative inline-flex items-center px-4 py-2 ml-3 text-sm font-medium text-gray-700 bg-white border border-gray-300 leading-5 rounded-md hover:text-gray-500 focus:outline-none focus:shadow-outline-blue focus:border-blue-300 active:bg-gray-100 active:text-gray-700 transition ease-in-out duration-150">
                                                Next »
                                            </a>
                                        </div>

                                        <div class="hidden sm:flex-1 sm:flex sm:items-center sm:justify-between">                                           

                                            <div>
                                                <span class="relative z-0 inline-flex shadow-sm rounded-md">
                                                    <span aria-disabled="true" aria-label="&amp;laquo; Previous">
                                                        <span
                                                            class="relative inline-flex items-center px-2 py-2 text-sm font-medium text-gray-500 bg-white border border-gray-300 cursor-default rounded-l-md leading-5"
                                                            aria-hidden="true">
                                                            <svg class="w-5 h-5" fill="currentColor"
                                                                viewBox="0 0 20 20">
                                                                <path fill-rule="evenodd"
                                                                    d="M12.707 5.293a1 1 0 010 1.414L9.414 10l3.293 3.293a1 1 0 01-1.414 1.414l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 0z"
                                                                    clip-rule="evenodd"></path>
                                                            </svg>
                                                        </span>
                                                    </span>

                                                    <span aria-current="page">
                                                        <span
                                                            class="relative inline-flex items-center px-4 py-2 -ml-px text-sm font-medium text-gray-500 bg-white border border-gray-300 cursor-default leading-5">1</span>
                                                    </span>
                                                    <a href="#page=2"
                                                        class="relative inline-flex items-center px-4 py-2 -ml-px text-sm font-medium text-gray-700 bg-white border border-gray-300 leading-5 hover:text-gray-500 focus:z-10 focus:outline-none focus:border-blue-300 focus:shadow-outline-blue active:bg-gray-100 active:text-gray-700 transition ease-in-out duration-150"
                                                        aria-label="Go to page 2">
                                                        2
                                                    </a>

                                                    <a href="#page=2" rel="next"
                                                        class="relative inline-flex items-center px-2 py-2 -ml-px text-sm font-medium text-gray-500 bg-white border border-gray-300 rounded-r-md leading-5 hover:text-gray-400 focus:z-10 focus:outline-none focus:border-blue-300 focus:shadow-outline-blue active:bg-gray-100 active:text-gray-500 transition ease-in-out duration-150"
                                                        aria-label="Next &amp;raquo;">
                                                        <svg class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20">
                                                            <path fill-rule="evenodd"
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
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <script type="text/javascript" src="assets/scripts/main.js"></script>
    <script type="text/javascript" src="assets/scripts/my_script.js"></script>
</body>

</html>