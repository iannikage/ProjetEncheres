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
        		<li><a href="P2inscription.jsp">Ench�res</a></li>
        		<li><a href="P2inscription.jsp">Vendre un article</a></li>
        		<li><a href="P2inscription.jsp">Mon profil</a></li>
        		<li><a href="P2inscription.jsp">D�connexion</a></li>
       		</ul>
       	</nav></header>
	<br>

    <main>

	<h1>Liste des ench�res</h1>
	
	Filtres : <br>
	<input type="text" name="article" placeholder="Le nom de l'article" autofocus="autofocus"/>
    <input type="submit" name="action" value="Rechercher"> <br>

	<label for="Cat�gories">Cat�gories : </label>
    	<select for="Cat�gories">
    		<option value="toutes">Toutes les cat�gories</option>
    		<option value="ameublement">Ameublement</option>
    		<option value="livres">Livres</option>
    		<option value="jouets">Jouets</option>
    		<option value="informatique">Informatique</option>
    		<option value="vehicules">V�hicules</option>
		</select>
		
    <br>
    <div>
	<input type="radio" name="choix" id="choix1" value="achats"/>
    <label for="choix1">Achats</label> 
	</div><br>
    <input type="checkbox" name="encheresOuv"/>ench�res ouvertes<br>
    <input type="checkbox" name="mesEncheres"/>mes ench�res<br>
    <input type="checkbox" name="mesEncheresRemp"/>mes ench�res remport�es<br>
    <br>
	<div>
    <input type="radio" name="choix" id="choix2" value="mesVentes"/>
    <label for="choix2">Mes Ventes</label>
	</div><br>
    <input type="checkbox" name="mesVentesEC"/>mes ventes en cours<br>
    <input type="checkbox" name="ventesNonDeb"/>ventes non d�but�es<br>
    <input type="checkbox" name="ventesTerm"/>ventes termin�es<br>
    <br>
        

</body>
</html>