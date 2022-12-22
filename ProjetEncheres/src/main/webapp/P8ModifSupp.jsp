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
	<form method="post" action="mettreAJour">
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
	Credit : //code <br>
	
	<input type="submit" name="action" value="Enregistrer">
	<input type="submit" name="action" value="Supprimer mon compte">
	//+code pour supprimer dans bdd
	</form>
	</div>
	
</body>
</html>