<%-- 
    Document   : CadastroPessoaFisica
    Created on : 29/07/2018, 22:54:57
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <title>Cadastro Empresas</title>
</head>
<body>
  <div class="container">
    <br>
    <h2>Cadastro Empresas</h2>
    <br>

    <form action="CadastroUsuarioCandidatoServlet" method="post">
      <label for="Nome" class="form">Nome: </label>
      <input type="text" name="Nome" class="form-control">
      <br>

      <label for="Data_Nascimento" class="form">Data Nascimento: </label>
      <input type="date" name="Data_Nascimento" class="form-control">
      <br>

      <label for="CPF" class="form">CPF: </label>
      <input type="text" name="CPF" class="form-control">
      <br>

      <label for="Email" class="form">Email: </label>
      <input type="text" name="Email" class="form-control">
      <br>

      <label for="Senha" class="form">Senha: </label>
      <input type="password" name="Senha" class="form-control">
      <br>
      
      <label for="Foto" class="form">foto: </label>
      <input type="file" name="Foto" class="form-control">
      <br>
      

      <label for="Estado" class="form">Estado: </label>
      <input type="Text" name="Estado" class="form-control">
      <br>
      
      

      <label for="Cidade" class="form">Cidade: </label>
      <input type="text" name="Cidade" class="form-control">
      <br>

      <label for="Cod_CEP" class="form">CEP: </label>
      <input type="text" name="Cod_CEP" class="form-control">
      <br>

      <label for="Endereco" class="form">Endereço: </label>
      <input type="text" name="Endereco" class="form-control">
      <br>

      <label for="Desc_Usuario" class="form">Descrição do usuário: </label>
      <input type="textarea" name="Desc_Usuario"class="form-control" >
      <br>
      
      <label for="Num_Telefone" class="form">Telefone: </label>
      <input type="text" name="Num_Telefone"class="form-control" >
      <br>
      
      <label for="Tipo_Telefone" class="form">Tipo de telefone: </label>
        <select class="form-control" id="Tipo_Telefone">
            <option>Fixo</option>
            <option>Movel</option>
            <option>Comercial</option>
        </select>
      <br>
      
      <label for="DDD" class="form">DDD: </label>
      <input type="text" name="DDD"class="form-control" >
      <br>
      
      <label for="Ramal" class="form">Ramal: </label>
      <input type="text" name="Ramal"class="form-control" >
      <br>
      
      <h6><b>Experiência Profissional</b></h6>
      
      
      <label for="Nom_Empresa" class="form">Nome Empresa: </label>
      <input type="text" name="Nom_Empresal"class="form-control" >
      <br>
      
      <label for="Cargo" class="form">Cargo: </label>
      <input type="text" name="Cargo"class="form-control" >
      <br>
      
      <label for="Cod_CEP" class="form">CEP da Empresa: </label>
      <input type="text" name="Cod_CEP"class="form-control" >
      <br>
      
      <label for="Data_Inicio" class="form">Data de Inicio: </label>
      <input type="date" name="Data_Inicio"class="form-control" >
      <br>
      
      <label for="Data_Termino" class="form">Data de Termino: </label>
      <input type="date" name="Data_Termino"class="form-control" >
      <br>
      
      <label for="Desc_Experiencia_Profissional" class="form">Descrição da Experiencia Profissional: </label>
      <input type="text" name="Desc_Experiencia_Profissional"class="form-control" >
      <br>
      
      <label for="Cidade" class="form">Cidade: </label>
      <input type="text" name="Cidade"class="form-control" >
      <br>
      
      <label for="Estado" class="form">Estado: </label>
      <input type="text" name="Estado"class="form-control" >
      <br>

      <input type="submit" name="Cadastrar" class="btn btn-primary" value="Cadastrar">
      <input type="button" name="Voltar" class="btn btn-primary" value="Voltar">
    </form>
  </div>
  <br>
</body>
</html>

