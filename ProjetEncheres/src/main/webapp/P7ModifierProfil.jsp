<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P7ModifierProfil</title>
</head>


<body>
 <header> 
        <h1>ENI - ENCHERES </h1> 
    
    </header>

 <div class="ModifierInfosPerso">

	<form method="post" action="modifierUtilisateur">
		<p> Pseudo : ${ userConnected.pseudo }</p> 
		<p> Nom : ${ userConnected.nom }</p> 
		<p> Prénom : ${ userConnected.prenom }</p> 
		<p> Email : ${ userConnected.email }</p> 
		<p> Téléphone : ${ userConnected.telephone }</p> 
		<p> Rue : ${ userConnected.rue }</p> 
		<p> Code Postal : ${ userConnected.codePostal }</p> 
		<p> Ville : ${ userConnected.ville }</p> 
   </form>
 </div>


<form action="/ProjetEncheres/P8ModifSupp.jsp" method="get" target="_blank"> <button type="submit">Modifier</button> </form>


<form action="supprimerUtilisateur" method="get" target="_blank"> <button type="submit">Supprimer mon compte</button> </form>


</body>
</html>