<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 16.02.2019
  Time: 00:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="employees_css\home_navigation.css">
</head>
<body>

<div class="navbar">
    <a class="active" href="/home"><i class="fa fa-fw fa-home"></i> Home</a>
    <a href="/employee/login"><i class="fa fa-fw fa-lock"></i> Employee login</a>
    <a href="/admin/login"><i class="fa fa-fw fa-lock"></i> Admin login</a>
    <a href="/signup"><i class="fa fa-fw fa-sign-in "></i> Sign up</a>
</div>

</body>
</html>