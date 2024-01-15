package com.generation.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Una Servlet è un programmino Java che riceve HTTP Request e Produce HTTP Response
@WebServlet("/prima")
public class PrimaServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        //Prende come parametri una Request e una Response
        //Usiamo la request per capire cosa l'utente voglia fare
        //produciamo la Response

        //La request non mi interessa, come quando scrivo il Main Senza Ciclo Principale
        //Chiedo alla resp di darmi il Printer (letteralemente lo stampatore)
        //lo uso con println
        PrintWriter contenuto = resp.getWriter();//mi preparo per scrivere nella pagina web che manderò al client
        contenuto.println("Ciao sono la prima riga");
        contenuto.println("Sono la seconda riga e sono felice di essere qui");
        contenuto.close();
        //In automatico quando il metodo termina, la resp viene inviata al client
    }
}
