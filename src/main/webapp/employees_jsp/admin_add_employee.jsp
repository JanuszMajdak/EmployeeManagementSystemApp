<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 17.02.2019
  Time: 03:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="\employees_css\admin_add_employee.css">
    <jsp:include page="admin_portal_navigation.jsp"/>


</head>
<body>
<h2>Add employee</h2>


<div class="container">
    <!-- do wyjaśnienia !-->

    <c:if test="${not empty errorMsg}">

        <div class="alert danger" role="alert">
                ${errorMsg}

        </div>

    </c:if>


    <c:if test="${not empty employee}">

        <form action="/admin/save_employee" method="post">

            <div class="row">
                <div class="col-25">
                    <label for="fname">First name</label>
                </div>
                <div class="col-75">
                    <input type="text" id="fname" name="firstName" placeholder="First name.."
                           value="${employee.firstName}">
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="lname">Last name</label>
                </div>
                <div class="col-75">
                    <input type="text" id="lname" name="lastName" placeholder="Last name.."
                           value="${employee.lastName}">
                </div>
            </div>


            <div class="row">
                <div class="col-25">
                    <label for="faname">Father's name</label>
                </div>
                <div class="col-75">
                    <input type="text" id="faname" name="fatherName" placeholder="Father's name.."
                           value="${employee.fatherName}">
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="mname">Mother's name</label>
                </div>
                <div class="col-75">
                    <input type="text" id="mname" name="motherName" placeholder="Mother's name.."
                           value="${employee.motherName}">
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="dbirth">Date of birth</label>
                </div>
                <div class="col-75">
                    <input type="date" id="dbirth" name="dateOfBirth" placeholder="Date of birth.."
                           value="${employee.dateOfBirth}">
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="login">Login</label>
                </div>
                <div class="col-75">
                    <input type="text" id="login" name="login" placeholder="Login.." value="${employee.login}">
                </div>
            </div>


            <div class="row">
                <div class="col-25">
                    <label for="password">Password</label>
                </div>
                <div class="col-75">
                    <input type="text" id="password" name="password" placeholder="Password.."
                           value="${employee.password}">
                </div>
            </div>


            <div class="row">
                <div class="col-25">
                    <label for="cpassword">Confirmed Password</label>
                </div>
                <div class="col-75">
                    <input type="text" id="cpassword" name="confirmedPassword" placeholder="Confirmed password.."
                           value="${employee.confirmedPassword}">
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="mpnumber">Mobile phone number</label>
                </div>
                <div class="col-75">
                    <input type="text" id="mpnumber" name="mobilePhoneNumber" placeholder="Mobile phone number.."
                           value="${employee.mobilePhoneNumber}">
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="gender">Gender</label>
                </div>
                <div class="col-75">
                    <select id="gender" name="gender">
                        <option value="woman">Woman</option>
                        <option value="man">Man</option>
                        value="${employee.gender}"
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="position">Position</label>
                </div>
                <div class="col-75">
                    <select id="position" name="position">
                        <option value="junior">Junior Java Developer</option>
                        <option value="mid">Mid Java Developer</option>
                        <option value="senior">Senior Java Developer</option>
                        <option value="manager">Manager</option>
                        <option value="projectmanager">Project Manager</option>
                        <option value="itadministrator">IT Administrator</option>
                        value="${employee.position}"
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="department">Department</label>
                </div>

                <div class="col-75">
                    <select id="department" name="department">
                        <option value="IT_A">IT-A</option>
                        <option value="IT_B">IT-B</option>
                        <option value="IT_C">IT-C</option>
                        <option value="IT_D">IT_D</option>
                        <option value="IT_E">IT-E</option>
                        value="${employee.department}"

                    </select>

                </div>


                <div class="row">
                    <div class="col-25">
                        <label for="email">Email</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="email" name="email" placeholder="Email.." value="${employee.eMail}">
                    </div>
                </div>

                <div class="row">
                    <div class="col-25">
                        <label for="djoining">Date of joining</label>
                    </div>
                    <div class="col-75">
                        <input type="date" id="djoining" name="dateOfJoining" placeholder="Date of joining.."
                               value="${employee.dateOfJoining}">
                    </div>
                </div>


                <div class="row">
                    <div class="col-25">
                        <label for="education">Education</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="education" name="education" placeholder="Education.."
                               value="${employee.education}">
                    </div>
                </div>


                <div class="row">
                    <div class="col-25">
                        <label for="sskills">Software skills</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="sskills" name="softwareSkills" placeholder="Software skills.."
                               value="${employee.softwareSkills}">
                    </div>
                </div>


                <div class="row">
                    <div class="col-25">
                        <label for="pskills">Personal skills</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="pskills" name="personalSkills" placeholder="Personal skills.."
                               value="${employee.personalSkills}">
                    </div>
                </div>

                <div class="row">
                    <div class="col-25">
                        <label for="caddress">Current address</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="caddress" name="currentAddress" placeholder="Current address.."
                               value="${employee.currentAddress}">
                    </div>
                </div>


                <div class="row">
                    <div class="col-25">
                        <label for="paddress">Permament address</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="paddress" name="permamentAddress" placeholder="Permament address.."
                               value="${employee.permanentAddress}">
                    </div>
                </div>


                <input type="hidden" name="id" value="${employee.id}">
                <br><br>


                <div class="row">
                    <input type="submit" value="Submit">
                </div>
            </div>

        </form>

    </c:if>

</div>

</body>
</html>
