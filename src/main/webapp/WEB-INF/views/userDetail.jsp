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
                                        Xem, tạo, cập nhật, xóa và quản lý bài viết
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>

                    <ul class="body-tabs body-tabs-layout tabs-animated body-tabs-animated nav">
                        <li class="nav-item">
                            <a href="./user-edit.html" class="nav-link">
                                <span class="btn-icon-wrapper pr-2 opacity-8">
                                    <i class="fa fa-edit fa-w-20"></i>
                                </span>
                                <span>Sửa</span>
                            </a>
                        </li>

                        <li class="nav-item delete">
                            <form action="" method="post">
                                <button class="nav-link btn" type="submit"
                                    onclick="return confirm('Do you really want to delete this item?')">
                                    <span class="btn-icon-wrapper pr-2 opacity-8">
                                        <i class="fa fa-trash fa-w-20"></i>
                                    </span>
                                    <span>Xóa</span>
                                </button>
                            </form>
                        </li>
                    </ul>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="main-card mb-3 card">
                                <div class="card-body display_data">
                                    <div class="position-relative row form-group">
                                        <label for="image" class="col-md-3 text-md-right col-form-label">Ảnh đại diện</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>
                                                <img style="height: 200px;" class="rounded-circle" data-toggle="tooltip"
                                                    title="Avatar" data-placement="bottom"
                                                    src="assets/images/_default-user.png" alt="Avatar">
                                            </p>
                                        </div>
                                    </div>

                                    <div class="position-relative row form-group">
                                        <label for="name" class="col-md-3 text-md-right col-form-label">
                                            Tên
                                        </label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>Tiến Đạt</p>
                                        </div>
                                    </div>

                                    <div class="position-relative row form-group">
                                        <label for="email" class="col-md-3 text-md-right col-form-label">Email</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>datvb@gmail.com</p>
                                        </div>
                                    </div>                                

                                    <div class="position-relative row form-group">
                                        <label for="town_city" class="col-md-3 text-md-right col-form-label">
                                            Địa chỉ</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>Vĩnh Bảo, Hải Phòng</p>
                                        </div>
                                    </div>

                                    <div class="position-relative row form-group">
                                        <label for="phone" class="col-md-3 text-md-right col-form-label">Số điện thoại</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>0123456789</p>
                                        </div>
                                    </div>

                                    <div class="position-relative row form-group">
                                        <label for="level" class="col-md-3 text-md-right col-form-label">Cấp độ</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>Quản trị</p>
                                        </div>
                                    </div>

                                    <div class="position-relative row form-group">
                                        <label for="description"
                                            class="col-md-3 text-md-right col-form-label">Mô tả</label>
                                        <div class="col-md-9 col-xl-8">
                                            <p>mô tả</p>
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