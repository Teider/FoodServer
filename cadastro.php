<html>
  <head>
    <script>
      function validar_campos() {
         var temp1 = document.forms["form_cadastro"]["email"].value;
        if (temp1 = null || temp1 = "") {
          alert("É necessário um e-mail para realizar o cadastro.");
          return false;
        }

        temp1 = document.forms["form_cadastro"]["pwd"].value;
         if (temp1 = null || temp1 = "") {
          alert("É necessário uma senha para realizar o cadastro.");
          return false;
        }

        if ($('input[type=radio]:checked').size() = 0) {
          alert("É necessário escolher um tipo de conta para realizar o cadastro");
          return false;
        }

        temp1 = document.forms["form_cadastro"]["email"].value;
        var temp2 = document.forms["form_cadastro"]["verifica_email"].value;
        if (temp1 != temp2) {
          alert("Dois endereços de e-mail diferentes foram digitados. Por favor verifique seu e-mail.");
          return false;
        }

        temp1 = document.forms["form_cadastro"]["pwd"].value;
        temp2 = document.forms["form_cadastro"]["verifica_pwd"].value;
        if (temp1 != temp2) {
          alert("Duas senhas diferentes foram digitadas. Por favor verifique sua senha.");
          return false;
        }

        document.forms["form_cadastro"].submit();
      }
      </script>
    </head>
      
  <body>

    <form name="form_cadastro" action="verificar_cadastro.php" method="post">
      <pre>E-mail:           <input type="text" name="email">
      <pre>Confirmar E-mail: <input type="text" name="verifica_email">
      <pre>Senha:            <input type="password" name="pwd">
      <pre>Confirmar Senha:  <input type="password" name="verifica_pwd">
      <pre>Tipo de conta:    <input type="radio" name="acc_type" value="Admin">Administrador
      <pre>                  <input type="radio" name="acc_type" value="Restaurante">Restaurante
      <pre>                  <input type="radio" name="acc_type" value="Usuário">Usuario
      <button type="button" onclick="validar_campos()">Cadastrar</button>
    </form>
  </body>
</html>

