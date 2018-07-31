<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <p>Página destinada a verificação das paginas jsp</p>
        
        <br><h1>Pagina principal</h1>
            <%@ include file="MainPage.jsp" %>
            <br><br>
        <br><h1>Pagina login</h1>
            <%@ include file="Login.jsp" %>
            <br><br>
        <br><h1>Pagina Principal de pessoa fisica</h1>    
            <%@ include file="PaginaPessoaFisica.jsp" %>
            <br><br>
        <br><h1>Pagina edição de perfil pessoa fisica</h1>    
            <%@ include file="EditarPerfilPessoaFisica.jsp" %>
            <br><br>
        <br><h1>Pagina Principal de pessoa juridica</h1>    
            <%@ include file="PaginaPessoaJuridica.jsp" %>
            <br><br>
        <br><h1>Pagina de vizualização de candidatos</h1>    
            <%@ include file="VizualizacaoCandidatos.jsp" %>    
            <br><br>
        <br><h1>Pagina de vizualização do perfil individual do candidato</h1>    
            <%@ include file="VizualizacaoPerfilCandidato.jsp" %>  
            <br><br>
        <br><h1>Pagina de Chat da empresa com candidato</h1>    
            <%@ include file="ChatEmpresaCandidato.jsp" %>  
            <br><br>
        <br><h1>Pagina de cadastro de pessoa juridica</h1>    
            <%@ include file="CadastroPessoaJuridica.jsp" %>  
    </body>
</html>
