<html>
  <body>

    <form action="verificar_cadastro.php" method="post">
      <pre>E-mail:           <input type="text" name="email">
      <pre>Confirmar E-mail: <input type="text" name="verifica_email">
      <pre>Senha:            <input type="password" name="pwd">
      <pre>Confirmar Senha:  <input type="password" name="verifica_pwd">
      <pre>Tipo de conta:    <input type="radio" name="acc_type" value="Admin">Administrador
      <pre>                  <input type="radio" name="acc_type" value="Restaurante">Restaurante
      <pre>                  <input type="radio" name="acc_type" value="Usuário">Usuario
      <input type="submit" value="Cadastrar">
    </form>

  </body>
</html>

