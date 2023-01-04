<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P6AfficherProfil</title>
</head>
<body>

	<header>

		<h1>ENI - ENCHERES</h1>

	</header>

	<div class="AfficherInfosPerso">
	
		//<p> Pseudo : ${ userConnected.pseudo }</p> 
		<p> Nom : ${ utilisateur.nom }</p> 
		<p> Prénom : ${ utilisateur.prenom }</p> 
		<p> Email : ${ utilisateur.email }</p> 
		<p> Téléphone : ${ utilisateur.telephone }</p> 
		<p> Rue : ${ utilisateur.rue }</p> 
		<p> Code Postal : ${ utilisateur.codePostal }</p> 
		<p> Ville : ${ utilisateur.ville }</p> 
	
		
	</div>

</body>
</html>