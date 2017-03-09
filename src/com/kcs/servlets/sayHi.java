package com.kcs.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PathParam;
import java.io.IOException;

/**
 * Created by Askew on 3/8/2017.
 */
@WebServlet(value = "/sayHi")
public class sayHi extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //@PathParam("name") String name;
        resp.getWriter().println("Hello, " + req.getParameter("name") + " " + req.getParameter("surname") + ".");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}
