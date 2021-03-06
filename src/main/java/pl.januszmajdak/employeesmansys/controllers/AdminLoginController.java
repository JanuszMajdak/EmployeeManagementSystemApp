package pl.januszmajdak.employeesmansys.controllers;


import pl.januszmajdak.employeesmansys.services.LoginService;
import pl.januszmajdak.employeesmansys.services.LoginServiceInMemoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "adminLoginController", value = "/admin/login")
public class AdminLoginController extends HttpServlet {

    private LoginService loginService = new LoginServiceInMemoryImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/employees_jsp/admin_login.jsp");
        requestDispatcher.forward(req, resp);
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String user = req.getParameter("login");
        String password = req.getParameter("password");

        boolean logged = loginService.login(user, password);

        if (logged) {
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("login", user);
            resp.sendRedirect("/admin/portal");
        } else {

            req.setAttribute("errorMsg", "You've type wrong login or password");

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/employees_jsp/admin_login.jsp");
            requestDispatcher.forward(req, resp);
        }

    }
}
