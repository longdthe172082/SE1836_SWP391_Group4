<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login | HappyProgramming</title>
    <link href="../css/log.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div class="container">
        <h2>Login</h2>
        <form action="loginServlet" method="post">
            <label for="username">Username</label>
            <input type="text" id="username" name="username" required>
            
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
            
            <button type="submit">Login</button>
        </form>
        <p><a href="#">Forgot password?</a></p>
        <p>Don't have an account? <a href="#">Sign up</a></p>
    </div>
</body>
</html>
