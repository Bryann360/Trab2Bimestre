<%-- 
    Document   : EditarPerfilPessoaFisica
    Created on : 29/07/2018, 23:16:12
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Editar perfil pessoa física</h1>
        <h6>Nome Completo:
        <input type="text" name="NomeCompleto"/>
        Data:
        <input type="date" name="Data"/>
        PF:
        <input type="text" name="CPF"/>
        Email:
        <input type="text" name="Email"/>
        Senha:
        <input type="text" name="Senha"/>
        País:
        <input type="text" name="Pais"/>
        UF:
        <input type="text" name="UF"/>
        Cidade:
        <input type="text" name="Cidade"/>
        Rua:
        <input type="text" name="Rua"/>
        CEP:
        <input type="text" name="CEP"/>
        Área de atuação:
        <input type="text" name="Rua"/>
        Sexo:
        <input type="text" name="Sexo"/>
        Formação:
        <input type="text" name="Formacao"/>
        Experiência na Área:
        <input type="text" name="ExpArea"/>
        </h6>
        
        <br>
        foto pessoa
        <br>
        <input type="button" value="Selecionar nova foto" name="EdtFoto">
        <input type="button" value="Editar" name="Editar">
    </body>
</html>
