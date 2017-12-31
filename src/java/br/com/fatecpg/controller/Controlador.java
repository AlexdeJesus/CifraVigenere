package br.com.fatecpg.controller;

import br.com.fatecpg.cifra.Cifra;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author Alex Souza
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    
        String palavra = request.getParameter("palavra");
        String chave = request.getParameter("chave");
        String acao = request.getParameter("acao");
    
        if(acao != null && acao.equals("gerarCifra")){ 
            String cifra[][] = Cifra.gerarCifra();
            request.setAttribute("cifra", cifra);
            request.getRequestDispatcher("gerarcifra.jsp").forward(request, response);
        }else if(acao!= null && acao.equals("cifrar")){
            String cifra[][] = Cifra.gerarCifra();
            String[] palavraCifrada = Cifra.cifrarPalavra(palavra, chave, cifra);
            request.setAttribute("palavraCifrada", palavraCifrada);
            request.getRequestDispatcher("cifra.jsp").forward(request, response);        
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
