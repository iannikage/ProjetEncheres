<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page2IdentifierCreerCompte</title>
</head>
<body>
    
    <header> 
    <h1>ENI - ENCHERES</h1> 
    
    </header>
    
    <form name="" method="post" action="">
       <label for="identifiant">Identifiant : </label> 
       <input type="text" name="identifiant" placeholder="Votre identifiant" autofocus="autofocus" id="Identifiant" required="required"/> <br>

       <label for="Mot de passe">Mot de passe : </label>
       <input type="password" name="motdepasse" id="Motdepasse"/> <br>

        <input type="button" value="Connexion" id="Connexion"> <br>

        <input type="checkbox" name="Sesouvenirdemoi"/>Se souvenir de moi <br>
    
        <a href="" id="Mdpoublie"> Mot de passe oublié </a> <br>

        <input type="button" value="Créer un compte" id="Creeruncompte">
    
    </form>  

</body>
</html>
