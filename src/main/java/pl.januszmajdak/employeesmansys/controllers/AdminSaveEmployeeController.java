package pl.januszmajdak.employeesmansys.controllers;


import pl.januszmajdak.employeesmansys.dto.EmployeeDto;
import pl.januszmajdak.employeesmansys.services.EmployeeService;
import pl.januszmajdak.employeesmansys.services.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


@WebServlet(name = "adminSaveController", value = "/admin/save_employee")
public class AdminSaveEmployeeController extends HttpServlet {

    private EmployeeService employeeService = new EmployeeServiceImpl();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String fatherName = req.getParameter("fatherName");
        String motherName = req.getParameter("motherName");
        String dateOfBirth = req.getParameter("dateOfBirth");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String confirmedPassword = req.getParameter("confirmedPassword");
        String mobilePhoneNumber = req.getParameter("mobilePhoneNumber");
        String gender = req.getParameter("gender");
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        String email = req.getParameter("email");
        String dateOfJoining = req.getParameter("dateOfJoining");
        String education = req.getParameter("education");
        String softwareSkills = req.getParameter("softwareSkills");
        String personalSkills = req.getParameter("personalSkills");
        String currentAddress = req.getParameter("currentAddress");
        String permamentAddress = req.getParameter("permamentAddress");

        String id = req.getParameter("id");


        Long employeeId = null;

        try {
            employeeId = Long.valueOf(id);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

        Integer employeeMobilePhoneNumber = null;
        try {
            employeeMobilePhoneNumber = Integer.valueOf(mobilePhoneNumber);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

        LocalDate employeeDateOfBirth = LocalDate.parse(dateOfBirth);

        LocalDate employeeDateOfJoining = LocalDate.parse(dateOfJoining);


        HttpSession session = req.getSession();
        login = (String) session.getAttribute("login");

        if (
                (firstName == null || "".equals(firstName)) ||
                        (lastName == null || "".equals(lastName)) ||
                        (fatherName == null || "".equals(fatherName)) ||
                        (motherName == null || "".equals(motherName)) ||
                        (dateOfBirth == null || "".equals(dateOfBirth)) ||
                        (login == null || "".equals(login)) ||
                        (password == null || "".equals(password)) ||
                        (confirmedPassword == null || "".equals(confirmedPassword)) ||
                        (mobilePhoneNumber == null || "".equals(mobilePhoneNumber)) ||
                        (gender == null || "".equals(gender)) ||
                        (position == null || "".equals(position)) ||
                        (department == null || "".equals(department)) ||
                        (email == null) || "".equals(email) ||
                        (dateOfJoining == null || "".equals(dateOfJoining)) ||
                        (education == null || "".equals(education)) ||
                        (softwareSkills == null || "".equals(softwareSkills)) ||
                        (personalSkills == null || "".equals(personalSkills)) ||
                        (currentAddress == null || "".equals(currentAddress)) ||
                        (permamentAddress == null || "".equals(permamentAddress))


        ) {
            req.setAttribute("errorMsg", "The fields shouldn't be empty. Please be so kind to fill in");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/employees_jsp/admin_add_employee.jsp");
            requestDispatcher.forward(req, resp);
        } else {

            EmployeeDto formEmployeeDto = new EmployeeDto(employeeId, firstName, lastName, fatherName, motherName, employeeDateOfBirth, login, password, confirmedPassword, employeeMobilePhoneNumber, gender, position, department, email, employeeDateOfJoining, education, softwareSkills, personalSkills, currentAddress, permamentAddress);
            employeeService.saveEmployee(formEmployeeDto);
            resp.sendRedirect("/admin/listEmployee");
        }

    }
}
