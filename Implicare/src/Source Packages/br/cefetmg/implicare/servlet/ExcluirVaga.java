/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.servlet;

import br.cefetmg.implicare.model.serviceImpl.VagaManagementImpl;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Gabriel
 */
class ExcluirVaga {

    static String execute(HttpServletRequest request) {
        String jsp="";
        try{

            Long CNPJ = Long.parseLong(request.getParameter("CNPJ"));
            int Cod_Cargo = Integer.parseInt(request.getParameter("Cod_Cargo"));
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = (Date) formato.parse("Data_Publicacao");
            VagaManagementImpl VagaImpl = new VagaManagementImpl();        
            boolean Vaga = VagaImpl.delete(CNPJ, Cod_Cargo, data);

            if (Vaga =! false) {
                jsp="";
            } else {
                String Erro = "Ocorreu erro ao Excluir Vaga!";
                jsp="/WEB-Pages/Erro.jsp";
                request.setAttribute("Erro", Erro);
            }
        } catch(Exception e) {
            e.printStackTrace();
            jsp="";
        }
        
        return jsp;
    }
    
}
