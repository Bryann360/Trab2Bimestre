<%--
    Document   : CadastroPessoaJuridica
    Created on : 28/07/2018, 23:24:25
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

    <form action="CadastroUsuarioEmpresaServlet" method="post">
      <label for="Nom_Razao_Social" class="form">Nome Razão Social: </label>
      <input type="text" name="Nom_Razao_Social" class="form-control">
      <br>

      <label for="Nome_Fantasia" class="form">Nome Fantasia: </label>
      <input type="text" name="Nome_Fantasia" class="form-control">
      <br>

      <label for="CNPJ" class="form">CNPJ: </label>
      <input type="text" name="CNPJ" class="form-control">
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

      

      <input type="submit" name="Cadastrar" class="btn btn-primary" value="Cadastrar">
      <input type="button" name="Voltar" class="btn btn-primary" value="Voltar">
    </form>
  </div>
  <br>
</body>
</html>

