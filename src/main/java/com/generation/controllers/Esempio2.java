package com.generation.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/esempio2")
public class Esempio2 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        List<String> boh = new ArrayList<>();
        boh.add("Ciao");
        boh.add("bye");
        boh.add("hello");
        boh.add("hola");
        req.setAttribute("lista", boh);
        req.getRequestDispatcher("/esempio4.ftl").forward(req, resp);
    }
}
