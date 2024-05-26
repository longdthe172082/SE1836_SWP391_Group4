<%-- 
    Document   : login
    Created on : May 17, 2024, 5:45:15 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>

    </head>
    <body>
        <div class="container">
            <h1>Login</h1>
            <form action="login" method="post">
                <div><h5 style="color: red">${error}<h5></div>
                            <div>
                                <label for="exampleInputEmail1">Username</label>
                                <input type="text" name="username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter username">
                            </div>
                            <div>
                                <label for="exampleInputPassword1">Password</label>
                                <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                            </div>
                            <button type="submit">Login</button>
                            <p><a href="#">Forgot password?</a></p>
                            <p>Don't have an account? <a href="register.jsp">Sign up</a></p>
                            </form>
                            </div>
                            </body>
                            </html>
