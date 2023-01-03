<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ajout d'un utilisateur</h1>
	
	<div class="formulaireAjoutUtilisateur">
	<form method="post" action="ajouterUtilisateur">
	Pseudo : <input type="text" name="pseudo" id="pseudo" required="required"> <br>
	Nom : <input type="text" name="nom" id="nom" required="required"> <br>
	Prenom : <input type="text" name="prenom" id="prenom" required="required"> <br>
	Telephone : <input type="tel" name="telephone" id="telephone" required="required"> <br>
	Rue : <input type="text" name="rue" id="rue" required="required"> <br>
	Ville : <input type="text" name="ville" id="ville" required="required"> <br>
	Code Postal : <input type="text" name="codepostal" id="codepostal" required="required"> <br>
	Email : <input type="email" name="email" id="email" required="required"> <br>
	Mot de passe : <input type="password" name="password" id="password" required="required"> <br>
	Confirmation : <input type="password" name="confirmation" required="required"> <br>
	
	<input type="submit" name="action" value="Ajouter">
	<input type="reset" name="action" value="Annuler">
	</form>
	</div> 
	
</body>
</html>