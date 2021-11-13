package com.example.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String login = req.getParameter("campo_login");
        String password = req.getParameter("campo_password");


        String loginCerto = "admin";
        String passwordCerto = "admin";


        if (login.equals(loginCerto) && password.equals(passwordCerto)) {

            HttpSession session = req.getSession();

            session.setAttribute("usuario", "jefferson");
            session.setAttribute("estaLogado", true);
            session.setMaxInactiveInterval(3600);

            //System.out.println("/SessionLab/segura");

            resp.sendRedirect("/SessionLab/segura");
            RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/OutraServlet");

        } else {
            resp.sendRedirect("/SessionLab/index.jsp?msg=senha incorreta");
            //System.out.println("/SessionLab/login.jsp?msg=senha incorreta");
        }
    }
}

/*
        request.setAttribute("variável", "valor da variável");
      RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/OutraServlet");

      E na OutraServlet você  pode usar um request.getAttribute("variável") para obter o valor.

 */

