package pl.januszmajdak.employeesmansys.controllers;

import pl.januszmajdak.employeesmansys.services.LoginService;
import pl.januszmajdak.employeesmansys.services.LoginServiceInMemoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="homePageController", value="/home")
public class HomePageController extends HttpServlet {

    private LoginService loginService=new LoginServiceInMemoryImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/employees_jsp/home_page.jsp");
        requestDispatcher.forward(req,resp);
    }
}
