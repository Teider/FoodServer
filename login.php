<html>
  <body>

Welcome <?php echo $_POST["name"]; ?><br>
Your email address is: <?php echo $_POST["email"]; ?><br>

<?php

$dbconn = pg_connect("host=localhost dbname=teste user=teider password=f3d[]r4!")
  or die('Não foi possível concectar-se: ' . pg_last_error());

?>

  </body>
</html>

