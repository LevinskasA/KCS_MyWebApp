package com.kcs.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Askew on 3/8/2017.
 */
@WebServlet(value = "/myTestServletPath")
public class MyFirstServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Hello, world.");

        //String name = "Andrius";

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        req.setAttribute("name", name + " " + surname);
        req.getRequestDispatcher("welcome.jsp").forward(req, resp);

        //resp.sendRedirect("/welcome.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Hello, doPost!");
    }

}
