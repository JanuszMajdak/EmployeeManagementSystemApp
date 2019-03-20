
<%@ page import="pl.januszmajdak.employeesmansys.dto.EmployeeDto"%>
<%@ page import="java.util.List" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>


    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="">
    <jsp:include page="admin_portal_navigation.jsp"/>
</head>


<body>


 <!--<div style="overflow-x:auto;"> oznacza responsywną tabelę,czyli jak za młao miejsca to pasek się przewiajania się pojawia!-->

<div class="container" style="overflow-x:auto;">

    <h1>Employees list</h1>
    <br><br>

    <table class="table">

        <thead>

        <tr>

            <th>id</th>
            <th>First name</th>
            <th>Last name</th>
            <th>Father's name</th>
            <th>Mother's name</th>
            <th>Date of birth</th>
            <th>Login</th>
            <th>Password</th>
            <th>Confirmed Password</th>
            <th>Mobile phone number</th>
            <th>Gender</th>
            <th>Position</th>
            <th>Department</th>
            <th>Email</th>
            <th>Date of joining</th>
            <th>Education</th>
            <th>Software skills</th>
            <th>Personal skills</th>
            <th>Current address</th>
            <th>Permament address</th>

        </tr>

        </thead>

        <tbody>

        <c:forEach items="${employeesModel}" var="employee">

            <tr>
                <td>${employee.firstName}</td>
                <td>${employee.lastName}</td>
                <td>${employee.fatherName}</td>
                <td>${employee.motherName}</td>
                <td>${employee.dateOfBirth}</td>
                <td>${employee.login}</td>
                <td>${employee.password}</td>
                <td>${employee.confirmedPassword}</td>
                <td>${employee.mobilePhoneNumber}</td>
                <td>${employee.gender}</td>
                <td>${employee.position}</td>
                <td>${employee.department}</td>
                <td>${employee.eMail}</td>
                <td>${employee.dateOfJoining}</td>
                <td>${employee.education}</td>
                <td>${employee.softwareSkills}</td>
                <td>${employee.personalSkills}</td>
                <td>${employee.currentAddress}</td>
                <td>${employee.permanentAddress}</td>


                <c:if test="${employee.login==sessionScope.login}">
                    <td><a href="/admin/listEmployee?id=${employee.id}">Edit employee</a></td>

                </c:if>

                <c:if test="${employee.login!=sessionScope.login}">
                    <td></td>

                </c:if>


                <c:if test="${employee.login==sessionScope.login}">
                    <td><a href="/admin/deleteEmployee?id=${employee.id}">Delete employee</a></td>

                </c:if>

                <c:if test="${employee.login!=sessionScope.login}">

                    <td></td>
                </c:if>

            </tr>

        </c:forEach>

        </tbody>

    </table>

</div>

</body>


</html>