package com.generation.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.generation.model.entities.Cup;
import com.generation.model.entities.Glass;
import com.generation.model.repositories.CupRepositoryMock;
import com.generation.model.repositories.GlassRepositoryMock;
import com.generation.model.repositories.GlasswareRepository;

@WebServlet("/homepage")
public class HomepageController extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        //voglio il bicchiere e la tazza più costosa

        //Parlo con il model, mi faccio arrivare tutti i bicchieri e tutte le tazze
        GlasswareRepository<Cup> cupRepo = new CupRepositoryMock();
        GlasswareRepository<Glass> glRepo = new GlassRepositoryMock();

        Cup mostExpensiveCup = cupRepo.readAll().stream().sorted((c1,c2) -> (int)(c2.getPrice()-c1.getPrice())).findFirst().get();
        Glass mostExpensiveGlass = glRepo.readAll().stream().sorted((c1,c2) -> (int)(c2.getPrice()-c1.getPrice())).findFirst().get();

        //Ho i dati GREZZI, li impacchetto
        req.setAttribute("cup", mostExpensiveCup);
        req.setAttribute("glass", mostExpensiveGlass);

        //passo i dati grezzi alla View che produrra la pagina WEB da mandare
        //come response all'utente
        req.getRequestDispatcher("/homepageView.ftl").forward(req, resp);
    }
}
