<%-- 
    Document   : create_cv
    Created on : May 20, 2024, 9:51:41 PM
    Author     : Phong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create new cv Page</title>
        <link href="css/create_cv.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <form action="create">
            <h1>Tạo CV</h1>
        <br/>
        <hr/>
            <div class="section">
                Ảnh: 
                <input type="file" id="photo" name="photo" accept="image/*" required>
            </div>
            <div class="section">
                Họ và tên: 
                <input type="text" id="name" name="dob" required>
            </div>
            <div class="section">
                Ngày sinh: 
                <input type="text" id="dob" name="dob" required>
            </div>
            
            <div class="section">
                Số điện thoại: 
                <input type="text" id="phone" name="phone" required>
            </div>
            <div class="section">
                Email: 
                <input type="text" id="email" name="email" required>
            </div>
            <div class="section">
                Giới thiệu: 
                <textarea id="about" name="about" rows="4" required></textarea>
            </div>
            <div class="section">
                Kinh nghiệm làm việc: 
                <textarea id="experience" name="experience" rows="4" required></textarea>
            </div>
            <div class="section">
                Học vấn: 
                <textarea id="education" name="education" rows="4" required></textarea>
            </div>
            <div class="section">
                <button type="submit">Submit</button>
            </div>
        </form>
    </body>
</html>
