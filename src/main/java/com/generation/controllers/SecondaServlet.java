package com.generation.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/seconda")
public class SecondaServlet extends HttpServlet
{
    //http://localhost:8080/base/seconda?a=8&b=16
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //Arriviamo QUI solo se la REQUEST ha URL:
        //localhost:8080/base/seconda
        //Console.print("Inserici valore a");
        //int a = Console.readInt();
        //Console.print("Inserici valore b");
        //int b = Console.readInt();
        //int somma=a+b;
        //Console.print("La loro somma è b");



        PrintWriter stampatore = resp.getWriter();
        String indirizzoCorto = req.getRequestURI();
        int primoParametro = Integer.parseInt(req.getParameter("a"));
        int secondoParametro = Integer.parseInt(req.getParameter("b"));
        int risultatoSomma = primoParametro+secondoParametro;
        // stampatore.println(indirizzoCorto);//lo stampo nella pagina web della response
        // stampatore.println("ho il parametro \"a\" che vale "+primoParametro);
        // stampatore.println("ho il parametro \"b\" che vale "+secondoParametro);
        stampatore.println("la loro somma è "+risultatoSomma);
        stampatore.close();
    }
}
