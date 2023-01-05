<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Modifier ou supprimer un profil</h1>

	<div class="modifierSupprimerUtilisateur">
	<form method="post" action="modifierUtilisateur">
	Pseudo : <input type="text" name="pseudo" id="pseudo" required="required" value="${ userConnected.pseudo }"> <br>
	Nom : <input type="text" name="nom" id="nom" value="${ userConnected.nom }"> <br>
	Prenom : <input type="text" name="prenom" id="prenom" value="${ userConnected.prenom }"> <br>
	Email : <input type="email" name="email" id="email" value="${ userConnected.email }"> <br>
	Telephone : <input type="tel" name="telephone" id="telephone" value="${ userConnected.telephone }"> <br>
	Rue : <input type="text" name="rue" id="rue" value="${ userConnected.rue }"> <br>
	Code Postal : <input type="text" name="codepostal" id="codepostal" value="${ userConnected.codePostal }"> <br>
	Ville : <input type="text" name="ville" id="ville" value="${ userConnected.ville }"> <br>
	Mot de passe : <input type="password" name="password" id="password" value="${ userConnected.motDePasse }"> <br>
	Confirmation : <input type="password" name="confirmation" value="${ userConnected.motDePasse }"> <br>
	Credit : ${ userConnected.credit } <br>
	
	<input type="submit" name="action" value="Enregistrer">

	
	</form>
	</div>
	
</body>
</html>