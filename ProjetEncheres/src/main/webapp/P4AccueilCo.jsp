<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>ENI-ENCHERES
	Enchères
	Vendre un article
	Mon Profil
	Déconnexion</header>
	<br>
	<h1>Liste des enchères</h1>
	
	Filtres : <br>
	<input type="text" name="article" placeholder="Le nom de l'article" autofocus="autofocus"/><br>

	Catégorie : <label for="categories"></label>
				<select name="categories">
				<optgroup>
				<option value="ameublement"> Ameublement</option>
				<option value="livres"> Livres</option>
				<option value="jouets"> Jouets</option>
				<option value="informatique"> Informatique</option>
				<option value="vehicules"> Véhicules</option>
				</optgroup>
                </select>
    <br>
    <input type="radio" name="achats"/>
    Achats <br>
    <input type="checkbox" name="encheresOuv"/>enchères ouvertes<br>
    <input type="checkbox" name="mesEncheres"/>mes enchères<br>
    <input type="checkbox" name="mesEncheresRemp"/>mes enchères remportées<br>
    <br>
    <input type="radio" name="mesVentes"/>
    Mes ventes <br>
    <input type="checkbox" name="mesVentesEC"/>mes ventes en cours<br>
    <input type="checkbox" name="ventesNonDeb"/>ventes non débutées<br>
    <input type="checkbox" name="ventesTerm"/>ventes terminées<br>
    <br>
    <input type="submit" name="valider" value="Recherche">

</body>
</html>