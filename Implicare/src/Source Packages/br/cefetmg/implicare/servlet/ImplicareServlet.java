/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
public class ImplicareServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Declarando Variaveis
        String jsp = "";
        String acao = request.getParameter("acao");
        // Encode Dos Caracteres
        request.setCharacterEncoding("UTF-8");

        //Redirecionando Para Classe de Serviço
        if (null != acao) {
            switch (acao) {
                case "AlterarCandidatoVaga":
                    jsp = AlterarCandidatoVaga.execute(request);
                    break;
                case "AlterarEmpresa":
                    jsp = AlterarEmpresa.execute(request);
                    break;
                case "AlterarExperienciaProfissional":
                    jsp = AlterarExperienciaProfissional.execute(request);
                    break;
                case "AlterarFormacaoAcademica":
                    jsp = AlterarFormacaoAcademica.execute(request);
                    break;
                case "AlterarPessoaFisica":
                    jsp = AlterarPessoaFisica.execute(request);
                    break;
                case "AlterarTelefone":
                    jsp = AlterarTelefone.execute(request);
                    break;
                case "AlterarUsuario":
                    jsp = AlterarUsario.execute(request);
                    break;
                case "AlterarVaga":
                    jsp = AlterarVaga.execute(request);
                    break;
                case "ExcluirCandidatoVaga":
                    jsp = ExcluirCandidatoVaga.execute(request);
                    break;
                case "ExcluirCargoInteresse":
                    jsp = ExcluirCargoInteresse.execute(request);
                    break;
                case "ExcluirCompetenciaPessoaFisica":
                    jsp = ExcluirCompetenciaPessoaFisica.execute(request);
                    break;
                case "ExcluirExperienciaProfissional":
                    jsp = ExcluirExperienciaProfissional.execute(request);
                    break;
                case "ExcluirFormacaoAcademica":
                    jsp = ExcluirFormacaoAcademica.execute(request);
                    break;
                case "ExcluirTelefone":
                    jsp = ExcluirTelefone.execute(request);
                    break;
                case "ExcluirVaga":
                    jsp = ExcluirVaga.execute(request);
                    break;
                case "InserirCandidatoVaga":
                    jsp = InserirCandidatoVaga.execute(request);
                    break;
                case "InserirCandidatoVagaDialogo":
                    jsp = InserirCandidatoVagaDialogo.execute(request);
                    break;
                case "InserirCargoInteresse":
                    jsp = InserirCargoInteresse.execute(request);
                    break;
                case "InserirCompetenciaPessoaFisica":
                    jsp = InserirCompetenciaPessoaFisica.execute(request);
                    break;
                case "InserirEmpresa":
                    jsp = InserirEmpresa.execute(request);
                    break;
                case "InserirExperienciaProfissional":
                    jsp = InserirExperienciaProfissional.execute(request);
                    break;
                case "InserirFormacaoAcademica":
                    jsp = InserirFormacaoAcademica.execute(request);
                    break;
                case "InserirPessoaFisica":
                    jsp = InserirPessoaFisica.execute(request);
                    break;
                case "InserirTelefone":
                    jsp = InserirTelefone.execute(request);
                    break;
                case "InserirUsuario":
                    jsp = InserirUsuario.execute(request);
                    break;
                case "InserirVaga":
                    jsp = InserirVaga.execute(request);
                    break;
                case "ListarAreaEstudo":
                    jsp = ListarAreaEstudo.execute(request);
                    break;
                case "ListarCargo":
                    jsp = ListarCargo.execute(request);
                    break;
                case "ListarCidade":
                    jsp = ListarCidadeServlet.execute(request);
                    break;
                case "ListarCompetencia":
                    jsp = ListarCompetencia.execute(request);
                    break;
                case "ListarEstado":
                    jsp = ListarEstado.execute(request);
                    break;
                case "ListarProficiencia":
                    jsp = ListarProficiencia.execute(request);
                    break;
                default:
                    jsp = "/WEB-Pages/Erro.jsp";
                    request.setAttribute("Erro", "Erro Geral");
                    break;
            }
        }
        RequestDispatcher rd = request.getRequestDispatcher(jsp);

        //Redirecioando Pra Uma Nova Pagina
        rd.forward(request, response);
    }

}
