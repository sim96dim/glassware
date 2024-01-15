package com.generation.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/primaweb")
public class PrimaServletHtml extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        //noi invece che mandare come response del testo con il WRITER mandiamo la pagina web

        req.getRequestDispatcher("/primaPaginaWeb.ftl").forward(req, resp);
        
    }
}
