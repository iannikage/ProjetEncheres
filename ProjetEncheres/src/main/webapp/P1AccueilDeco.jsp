<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import = "java.util.List,fr.eni.ecole.encheres.bll.ArticleVenduManager" %>
   <%@page import = "java.util.List,fr.eni.ecole.encheres.bo.ArticleVendu" %>
   <%@page import = "java.util.List,fr.eni.ecole.encheres.bo.ArticleVendu" %>
   <%@page import = "java.util.List,fr.eni.ecole.encheres.bll.ArticleVenduManager" %>
   <%@page import = "java.util.List,fr.eni.ecole.encheres.dal.ArticleVenduDAO" %>
   <%@page import = "java.util.List,fr.eni.ecole.encheres.bll.EnchereManager" %>
   <%@page import = "java.util.List,fr.eni.ecole.encheres.bll.UtilisateurManager" %>
   <%@page import = "java.util.List,fr.eni.ecole.encheres.bo.Utilisateur" %>
   <%@page import = "java.util.List,fr.eni.ecole.encheres.dal.UtilisateurDAO" %>
   <%@page import = "java.util.List" %>
   <%@page import = "java.util.Date" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ACCUEIL</title>
</head>
<body>

            
        <header>
        <h1>ENI-ENCHERE</h1>
        <nav>
        	<ul>
        		<li><a href="P2IdentifierCreerCompte.jsp">S'inscrire - Se connecter</a></li>
       		</ul>
       	</nav>
        </header>
        
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
		    <c:foreach items="${ liste }"  var="l"> <br>
	    	Nom de l'article: ${ l.nomArticle } <br>
	    	Decription: ${ l.description } <br>
	    	Fin de l'enchère: ${ l.dateFinEnchere } <br>
	    	Prix: ${ l.prixInitial } <br>
	    	</c:foreach>
	    	
		    <br><br>
		    
		 
	  
        </main>
        <br><br>
          

</body>
</html>

