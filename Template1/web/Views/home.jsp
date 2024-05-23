<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
            <div class="nav-right">
                <a href="Views/Login.jsp">Login</a>
                <a href="#">Signup</a>
            </div>
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
