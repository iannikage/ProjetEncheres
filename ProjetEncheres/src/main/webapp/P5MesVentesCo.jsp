<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>ENI-ENCHERES
	<nav>
        	<ul>
        		<li><a href="P2inscription.jsp">Enchères</a></li>
        		<li><a href="P2inscription.jsp">Vendre un article</a></li>
        		<li><a href="P2inscription.jsp">Mon profil</a></li>
        		<li><a href="P2inscription.jsp">Déconnexion</a></li>
       		</ul>
       	</nav></header>
	<br>

    <main>

	<h1>Liste des enchères</h1>
	
	Filtres : <br>
	<input type="text" name="article" placeholder="Le nom de l'article" autofocus="autofocus"/>
    <input type="submit" name="action" value="Rechercher"> <br>

	<label for="Catégories">Catégories : </label>
    	<select for="Catégories">
    		<option value="toutes">Toutes les catégories</option>
    		<option value="ameublement">Ameublement</option>
    		<option value="livres">Livres</option>
    		<option value="jouets">Jouets</option>
    		<option value="informatique">Informatique</option>
    		<option value="vehicules">Véhicules</option>
		</select>
		
    <br>
    <div>
	<input type="radio" name="choix" id="choix1" value="achats"/>
    <label for="choix1">Achats</label> 
	</div><br>
    <input type="checkbox" name="encheresOuv"/>enchères ouvertes<br>
    <input type="checkbox" name="mesEncheres"/>mes enchères<br>
    <input type="checkbox" name="mesEncheresRemp"/>mes enchères remportées<br>
    <br>
	<div>
    <input type="radio" name="choix" id="choix2" value="mesVentes"/>
    <label for="choix2">Mes Ventes</label>
	</div><br>
    <input type="checkbox" name="mesVentesEC"/>mes ventes en cours<br>
    <input type="checkbox" name="ventesNonDeb"/>ventes non débutées<br>
    <input type="checkbox" name="ventesTerm"/>ventes terminées<br>
    <br>
        

</body>
</html>