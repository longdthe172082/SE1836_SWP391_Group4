<%-- 
    Document   : register
    Created on : May 18, 2024, 8:45:15 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <link href="css/register.css" rel="stylesheet" type="text/css"/>

        <!-- Compiled and minified JavaScript -->
    </head>
    <body>
        <div class="container">
            <h1>Register</h1>
            <form action="register" method="post">
                <div>
                    <h5 style="color: green">${mes}<h5>
                            <h5 style="color: green">${success}<h5>
                                    <h5 style="color: red">${usernameExist}<h5>
                                            </div>
                                            <div>
                                                <label for="exampleInputEmail1">Username</label>
                                                <input type="text" name="username" id="exampleInputEmail1" value="${sessionScope.newAccount.getUserName()}" aria-describedby="emailHelp" placeholder="">
                                            </div>
                                            <div>
                                                <label for="exampleInputPassword1">Password</label>
                                                <input type="password" name="password" value="${sessionScope.newAccount.getPass()}" id="exampleInputPassword1" placeholder="">
                                            </div>
                                            <div>
                                                <label for="exampleInputPassword1">Acc Name</label>
                                                <select type="text" name="accName" value="${sessionScope.newAccount.getAccName()}" id="accName" placeholder="">
                                                    <option value="Mentor">Mentor</option>
                                                    <option value="Mentee">Mentee</option>
                                                </select>
                                            </div>
                                            <div>
                                                <label for="exampleInputPassword1">Full Name</label>
                                                <input type="text" name="fullName" value="${sessionScope.newAccount.getFullName()}" id="exampleInputPassword1" placeholder="">
                                            </div>
                                            <div>
                                                <label for="exampleInputPassword1">DoB</label>
                                                <input type="date" name="dob" value="${sessionScope.newAccount.getDob()}" id="exampleInputPassword1" placeholder="">
                                            </div>
                                            <div>
                                                <label for="exampleInputPassword1">Sex</label>
                                                <select name="sex">
                                                    <option ${'Male' eq sessionScope.newAccount.getSex() ? 'selected':''}  value="Male">Male</option>
                                                    <option ${'Female' eq sessionScope.newAccount.getSex() ? 'selected':''}  value="Female">Female</option>

                                                </select>
                                            </div>
                                            <div>
                                                <label for="exampleInputPassword1">Address</label>
                                                <input type="text" name="address" value="${sessionScope.newAccount.getAddress()}" class="form-control" id="exampleInputPassword1" placeholder="">
                                            </div>
                                            <div>
                                                <label for="exampleInputPassword1">Phone Number</label>
                                                <input type="text" name="phone" value="${sessionScope.newAccount.getPhoneNumber()}"  class="form-control" id="exampleInputPassword1" placeholder="">
                                            </div>

                                            <div><h5 style="color: red">${mailExist}<h5></div>
                                                        <div>
                                                            <label for="exampleInputPassword1">Email</label>
                                                            <input type="email" name="email" value="${sessionScope.newAccount.getEmail()}" class="form-control" id="exampleInputPassword1" placeholder="">
                                                        </div>
                                                        <div>
                                                            <input type="hidden" name="role" id="role">
                                                        </div>
                                                        <div><h5 style="color: red">${inputEmpty}<h5></div>
                                                                    <button type="submit">Register</button>
                                                                    </form>
                                                                    </div>
                                                                    <script>
                                                                        // Lắng nghe sự kiện change trên select accName
                                                                        document.getElementById("accName").addEventListener("change", function () {
                                                                            var accName = this.value; // Lấy giá trị của accName khi select box thay đổi
                                                                            var roleInput = document.getElementById("role"); // Lấy phần tử input role

                                                                            // Thiết lập giá trị cho role tương ứng với giá trị của accName
                                                                            if (accName === "Mentor") {
                                                                                roleInput.value = "3"; // Gán giá trị 3 cho role nếu accName là Mentor
                                                                            } else if (accName === "Mentee") {
                                                                                roleInput.value = "4"; // Gán giá trị 4 cho role nếu accName là Mentee
                                                                            }
                                                                        });
                                                                    </script>
                                                                    </body>

                                                                    </html>
