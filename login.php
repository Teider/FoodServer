
<!DOCTYPE HTML>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <script>
      function validar_campos() {
         var temp1 = document.forms["form_login"]["email"].value;
        if(temp1==null || temp1==""){
          alert("É necessário um e-mail para realizar o cadastro.");
          return false;
        }

        temp1 = document.forms["form_login"]["senha"].value;
         if (temp1 == null || temp1 == "") {
          alert("É necessário uma senha para realizar o cadastro.");
          return false;
        }

        document.forms["form_login"].submit();
      }
      </script>
    </head>
<body>
<form action ="ValidarLogin.php" method="post" name="form_login">
Login: <input type="text" name="email"><br>
Senha: <input type="password" name="senha"><br>
<button type="button" onclick="validar_campos()">Acesse</button>
</form>
</body>
</html>