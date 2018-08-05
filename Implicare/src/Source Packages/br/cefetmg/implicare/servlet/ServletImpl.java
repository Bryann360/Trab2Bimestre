package br.cefetmg.implicare.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author João Victor
 */
public class ServletImpl extends HttpServlet
{
    private String jsp;
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        
        if(action.equals("AlterarCandidatoVaga"))
        {AlterarCandidatoVaga.execute(request);}
        else if(action.equals("AlterarEmpresa"))
        {AlterarEmpresa.execute(request);}
        else if(action.equals("Alterar"))
        {}
        else
        {throw }
        //A fazer
        RequestDispatcher dispatcher = request.getRequestDispatcher(jsp);
        dispatcher.forward(request, response);
    }
}