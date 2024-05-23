<%-- 
    Document   : view_cv
    Created on : May 20, 2024, 9:39:26 PM
    Author     : Phong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Mentor CV page</title>
        <link href="css/view.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <div class="container">
            <!--CV header -->
            <div class="cv-header">
                <img src="#" alt="Ảnh của Mentor"/>
                <div>
                    <h1>Dương Hải Phong</h1>
                    <h2>Mentor</h2>
                </div>
            </div>
            
            <!--CV main -->
            <div class="cv-main">
                
                <!-- left column -->
                <div class="left-column">
                    <!-- Personal information -->
                    <div class="section personal-information">
                        <h3>Personal Details</h3>
                        <p><strong>Ngày sinh: </strong>20/10/2003</p>
                        <br/>
                        <p><strong>Số điện thoại: </strong>0833080988</p>
                        <br/>
                        <p>
                            <strong>Email: </strong>
                            <li>haiphongduong69@gmail.com</li>
                            <li>phongdhhe176650@fpt.edu.vn</li>
                        </p>
                    </div>
                </div>
                
                <!-- right column -->
                <div class="right-column">
                    <div class="section">
                        <!-- About me -->
                        <h3>Giới thiệu về bản thân</h3>
                        <br/>
                        <p>Tôi tên là Phong. Hiện tôi đang làm việc tại FPT Software.</p>
                    </div>
                    <br/>
                    
                    <div class="section">
                        <!-- Work experience -->
                        <h3>Kinh nghiệm làm việc</h3>
                        <div class="job">
                            <div class="job-title"></div>
                            <span></span>
                        </div>
                    </div>
                    <br/>
                    
                    <div class="section">
                        <!-- Education -->
                        <h3>Education</h3>
                        <div class="education">
                            <div class="degree-title"></div>
                            <span></span>
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
    </body>
</html>
