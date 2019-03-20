<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 16.02.2019
  Time: 00:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="employees_css\home_navigation.css">
    <link rel="stylesheet" href="\employees_css\admin_login.css">
    <link rel="stylesheet" href="\employees_css\alert_login.css">

</head>


<body>


<form action="/admin/login" method="post">
    <div class="imgcontainer">
        <img src="#" alt="Admin picture" class="avatar">
    </div>

    <div class="container">

        <c:if test="${not empty errorMsg}">

            <div class="alert danger" role="alert">
                    ${errorMsg}
            </div>


        </c:if>

        <label for="login"><b>Login</b></label>
        <input type="text" placeholder="Enter login" name="login" required>

        <label for="password"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required>

        <button type="submit">Login</button>
        <label>
            <input type="checkbox" checked="checked" name="remember"> Remember me
        </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">

        <a href="/home" class="cancelbtn" role="button">Cancel</a>

        <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
</form>

</div>

</body>

</html>
