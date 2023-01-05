<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
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
        		<li><a href="/ProjetEncheres/ajouterArticle">Vendre un article</a></li>
        		<li><a href="P7ModifierProfil.jsp">Mon profil</a></li>
        		<li><a href="P1AccueilDeco.jsp">Déconnexion</a></li>
       		</ul>
       	</nav></header>
	<br>

    <main>

	 <form method="get" action="ListerArticle">
	        <h1>Liste des enchères</h1>
	        <label for="maRecherche">Filtre : </label>
	        <input type="search" id="maRecherche"  placeholder="Le nom de l'article"  name="maRecherche">
	    	<button>Rechercher</button>
	    	
	    	
	    	<br><br>
	    	
	    	<label for="categorie">Catégories : </label>
	    	<select name="categorie">
	    	<option value="0"> toutes</option>
	    	<c:forEach items="${ listeCategorie }"  var="c">
	    	<option value="${ c.noCategorie }">${ c.libelle }</option>
	    	</c:forEach>
	    	
	    		
			</select>
			</form>
		    <div>
		        <h1>Enchères En Cours</h1>
		    </div>
		    
		    	</table>
		    	</fieldset>
		    </div>
		    <c:forEach items="${ liste }"  var="l">
	    	${ l.nomArticle }
	    	</c:forEach>
		
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