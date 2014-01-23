<html>
<body>
<form> id='Cadastro' method='post'>
<fieldset>
<legend>Cadastro</legend>
 
<input type='hidden' name='submitted' id='submitted' value='1'/>
 
    <label for='nome' >Nome: </label><br/>
    <input type='text' name='nome' id='nome'  maxlength="50" /><br/>
    <label for='endereco' >Endereco:</label><br/>
    <input type='text' name='endereco' id='endereco' maxlength="50" /><br/>
    <label for='telefone' >Telefone:</label><br/>
    <input type='text' name='telefone' id='telefone' maxlength="12" /><br/>
     <br/>
    <label for='titulo' >Tipo de usuario:</label><br/>
    <input name=”titulo” value=”item1″ type='radio' />Admin<br/>
    <input name=”titulo” value=”item2″ type='radio' />Usuario<br/>
    <input name=”titulo” value=”item3″ type='radio' />Dono de restaurante<br/>
    
    <input type='submit' name='Cadastrar' value='Cadastrar' />
</fieldset>
</form>
Welcome <?php echo $_POST["name"]; ?><br>
Your email address is: <?php echo $_POST["email"]; ?>

</body>
</html>

