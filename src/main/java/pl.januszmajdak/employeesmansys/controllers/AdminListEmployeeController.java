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
import java.io.IOException;
import java.util.List;

@WebServlet(name="adminListEmployeeController", value="/admin/listEmployee")
public class AdminListEmployeeController extends HttpServlet {


    private EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<EmployeeDto> employees = employeeService.findEmployee();

        req.setAttribute("employeesModel", employees);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/employees_jsp/employees_list.jsp");
        requestDispatcher.forward(req,resp);

    }
}
