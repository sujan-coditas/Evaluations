package com.xadmin.usermanagement.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        if(email.equals("admin@gmail.com") && password.equals("admin")){
            resp.sendRedirect("UserServlet");
        }
        else{
            out.println("you are not admin");
            RequestDispatcher rd= req.getRequestDispatcher("index.jsp");
            rd.include(req,resp);
        }
    }
}
