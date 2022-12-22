<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>page3</title>
</head>
<body>
    <header> 
        <h1>ENI - ENCHERES</h1> 
        <h2>Nouvelle vente</h2>
    </header>

<form>
    <img src=" ">
    
    <label for="article">Article : </label> 
    <input type="text" name="article" autofocus="autofocus" id="article" required="required"/> <br>

    <label for="description">Description : </label> 
    <input type="text" name="description" autofocus="autofocus" id="description" required="required"/> <br>

    <label for="categorie">Catégorie</label> 
<select name="Catégories">
<option value="toutes">Toutes</option>
<option value="ameublement">Ameublement</option>
<option value="livres">Livres</option>
<option value="jouets">Jouets</option>
<option value="informatique">Informatique</option>
<option value="vehicules">Véhicules</option>
</select> <br>

    <label for="Photo de l'article">Photo de l'article</label>
    <input class="Uploader" type="button"value="Uploader"> <br>

    <label for="Mise à prix">Mise à prix : </label>
    <input type="number" name="number" min="1" max="100000" value="150" step="1" /> <br>

    <label for="Debut de l'enchere">Début de l'enchère : </label>
    <input type="date" name="dateDebutEnchere" size="100"/> <br>

    <label for="Fin de l'enchere">Fin de l'enchère : </label>
    <input type="date" name="dateFinEnchere" size="100"/> <br>

   
    <fieldset>
        <legend>Retrait</legend>
    
        <label for="rue">Rue : </label>
        <input type="text" name="rue" autofocus="autofocus" id="rue" required="required"/> <br>

        <label for="codePostal">Code postal : </label>
        <input type="text" name="codePostal" autofocus="autofocus" id="codePostal" required="required"/> <br>

        <label for="ville">Ville : </label>
        <input type="text" name="ville" autofocus="autofocus" id="ville" required="required"/> <br>

    </fieldset>

    <input class="enregistrerArticle" type="button"value="Enregistrer">
    <input class="Annuler" type="button"value="Annuler">
    <input class="AnnulerLaVente" type="button"value="Annuler la vente"> <br>


</form>


</body>

</html>