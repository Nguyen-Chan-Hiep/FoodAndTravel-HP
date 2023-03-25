<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                                    Chi tiết thông tin món ăn
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="main-card mb-3 card">
                                <div class="card-body display_data">

                                    <div class="position-relative row form-group">
                                        <label for="" class="col-md-3 text-md-right col-form-label">Hình ảnh</label>
                                        <div class="col-md-9 col-xl-8">
                                            <ul class="text-nowrap overflow-auto" id="images">
                                                <li class="d-inline-block mr-1" style="position: relative;">
                                                    <img style="height: 150px;" src="img/${baiviet.hinhanh }"
                                                        alt="Image">
                                                </li>
                                            </ul>
                                        </div>
                                    </div>                       
                                
                                    <div class="position-relative row form-group">
                                        <label for="name" class="col-md-3 text-md-right col-form-label">Tên món ăn</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>${baiviet.name }</p>
                                        </div>
                                    </div>
									<div class="position-relative row form-group">
                                        <label for="name" class="col-md-3 text-md-right col-form-label">Tên địa điểm</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>${baiviet.tendiadiem }</p>
                                        </div>
                                    </div>
                                    <div class="position-relative row form-group">
                                        <label for="name" class="col-md-3 text-md-right col-form-label">Địa chỉ</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>${baiviet.diachi }</p>
                                        </div>
                                    </div>
                                    <div class="position-relative row form-group">
                                        <label for="tag"
                                            class="col-md-3 text-md-right col-form-label">Loại hình</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>${baiviet.loaihinh }</p>
                                        </div>
                                    </div>

                                    <div class="position-relative row form-group">
                                        <label for="description"
                                            class="col-md-3 text-md-right col-form-label">Mô tả</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>${baiviet.motadiadiem}</p>
                                        </div>
                                    </div>

                                    <div class="position-relative row form-group">
                                        <label for="operate-time"
                                            class="col-md-3 text-md-right col-form-label">Thời gian mở cửa</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>${baiviet.giomocua } - ${baiviet.giodongcua }</p>
                                        </div>
                                    </div>
                                    <div class="position-relative row form-group">
                                        <label for="operate-time"
                                            class="col-md-3 text-md-right col-form-label"></label>
                                        <div class="col-md-9 col-xl-8">
                                            <a href="pheduyet?id=${baiviet.id }"><button class="btn btn-success">Phê duyệt</button></a>
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
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <script type="text/javascript" src="assets/scripts/main.js"></script>
    <script type="text/javascript" src="assets/scripts/my_script.js"></script>
</body>

</html>