<html>
  <body>
    
    <?php

      $dbconn = pg_connect("host=localhost dbname=teste user=teider password=f3d[]r4!")
      or die('Não foi possível concectar-se: ' . pg_last_error());

      $resource = pq_query( $dbconn, "SELECT NOME FROM USERS WHERE NOME = " . $_POST["nome"]);

    ?>

  </body>
</html>

