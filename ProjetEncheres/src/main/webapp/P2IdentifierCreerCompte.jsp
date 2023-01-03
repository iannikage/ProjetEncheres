<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

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
    
    <form method="post" action="login">
       <label for="identifiant">Identifiant : </label> 
       <input type="text" name="identifiant" value="${cookie.lastlogin.value}" placeholder="Votre identifiant" autofocus="autofocus" id="Identifiant"/> <br>

       <label for="Mot de passe">Mot de passe : </label>
       <input type="password" name="motdepasse" id="Motdepasse"/> <br>

       <form action="/ProjetEncheres/P4P5AccueilCo.jsp" method="get" target="_blank"> <button type="submit">Connexion</button> </form>

        <input type="checkbox" name="Sesouvenirdemoi"/>Se souvenir de moi <br>
    
        <a href="" id="Mdpoublie"> Mot de passe oublié </a> <br>

        <form action="/ProjetEncheres/P3AjouterCreerProfil.jsp" method="get" target="_blank"> <button type="submit">Créer un compte</button> </form>
        
    
    </form>  

</body>
</html>
