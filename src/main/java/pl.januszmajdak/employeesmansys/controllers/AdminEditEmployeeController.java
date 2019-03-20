package pl.januszmajdak.employeesmansys.controllers;

import pl.januszmajdak.employeesmansys.dto.EmployeeDto;
import pl.januszmajdak.employeesmansys.exceptions.EmployeeNotFoundException;
import pl.januszmajdak.employeesmansys.services.EmployeeService;
import pl.januszmajdak.employeesmansys.services.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "adminEditEmployeeController", value = "/admin/editEmployee")
public class AdminEditEmployeeController extends HttpServlet {

    private EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        Long employeeId = Long.valueOf(id);

        try {

            EmployeeDto employeeDto = employeeService.findEmployeeById(employeeId);
            req.setAttribute("employee", employeeDto);
        } catch (EmployeeNotFoundException ex) {
            req.setAttribute("errorMsg", "Employee with id= " + id + " was not found");
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/employees_jsp/employees_list.jsp");
        requestDispatcher.forward(req, resp);

    }
}
