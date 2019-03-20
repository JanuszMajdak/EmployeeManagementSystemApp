package pl.januszmajdak.employeesmansys.controllers;


import pl.januszmajdak.employeesmansys.dto.EmployeeDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="adminAddEmployeeController", value="/admin/addEmployee")
public class AdminAddEmployeeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("employee", new EmployeeDto());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/employees_jsp/admin_add_employee.jsp");
        requestDispatcher.forward(req, resp);

    }
}
