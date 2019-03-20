package pl.januszmajdak.employeesmansys.controllers;

import pl.januszmajdak.employeesmansys.services.EmployeeService;
import pl.januszmajdak.employeesmansys.services.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="adminDeleteEmployeeController", value="/admin/deleteEmployee")
public class AdminDeleteEmployeeController extends HttpServlet {

    private EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Long employeeId = Long.valueOf(id);
        employeeService.deleteEmployee(employeeId);
        resp.sendRedirect("/admin/listEmployee");
    }
}
