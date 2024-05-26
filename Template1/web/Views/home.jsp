<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Homepage</title>
    <link href="css/home.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <header>
        <nav>
            <div class="nav-left">
                <a href="#">Home</a>
            </div>
            <div class="nav-center">
                <input type="text" placeholder="Search...">
            </div>
            <c:if test="${sessionScope.account!=null}">
                <div class="nav-right">
                    <a href="logout">Logout</a>
                </div>
            </c:if>
            <c:if test="${sessionScope.account==null}">
            <div class="nav-right">
                <a href="login.jsp">Login</a>
                <a href="register.jsp">Signup</a>
            </div>
            </c:if>
        </nav>
    </header>
    
    <main>
        <div class="sidebar">
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">Lộ trình</a></li>
                <li><a href="#">Khóa học</a></li>
                <li><a href="#">Giảng viên</a></li>
            </ul>
        </div>
        <div class="content">
            <section class="courses">
                <h2>Khóa học</h2>
                <!-- Nội dung khóa học -->
            </section>
            <section class="instructors">
                <h2>Giảng viên</h2>
                <!-- Nội dung giảng viên -->
            </section>
            <section class="blog">
                <h2>Blog</h2>
                <!-- Nội dung blog -->
            </section>
        </div>
    </main>
    
    <footer>
        <p>Thông tin bên lề</p>
    </footer>
</body>
</html>
