package com.generation.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.generation.model.entities.Glass;
import com.generation.model.repositories.GlassRepositoryMock;
import com.generation.model.repositories.GlasswareRepository;

@WebServlet("/showglasscolorsearch")
public class ShowGlassColorSearchController extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        //parla con il model, quindi prendiamo la repository 
        GlasswareRepository<Glass> glRepo = new GlassRepositoryMock();
        String color = req.getParameter("color");
        List<Glass> glasses = glRepo.readAll().stream().filter(g -> g.getColor().toLowerCase().equals(color.toLowerCase())).toList();

        req.setAttribute("color", color);
        req.setAttribute("glasses", glasses);

        req.getRequestDispatcher("/showGlassColorSearchView.ftl").forward(req, resp);
    }
}
