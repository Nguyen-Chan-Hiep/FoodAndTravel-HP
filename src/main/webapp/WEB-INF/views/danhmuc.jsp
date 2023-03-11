<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
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
    </div>
</body>
</html>