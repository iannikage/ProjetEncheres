<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        		<li><a href="P2inscription.jsp">S'inscrire - Se connecter</a></li>
       		</ul>
       	</nav>
        </header>
        
        <main>
	        <h1>Liste des enchères</h1>
	        <label for="maRecherche">Filtre : </label>
	        <input type="search" id="maRecherche"  placeholder="Le nom de l'article"  name="maRecherche">
	    	<button>Rechercher</button>
	    	
	    	<br><br>
	    	
	    	<label for="Catégories">Catégories : </label>
	    	<select name="Catégories">
	    		<option value="toutes">Toutes</option>
	    		<option value="ameublement">Ameublement</option>
	    		<option value="livres">Livres</option>
	    		<option value="jouets">Jouets</option>
	    		<option value="informatique">Informatique</option>
	    		<option value="vehicules">Véhicules</option>
			</select>
			
		    <div>
		        <h1>Enchères En Cours</h1>
		    </div>
		    
		    <div>
		    	<fieldset>
		        <h1>Article-1</h1>
		        <div><img src="image.jpg" alt="Image de l'article encours d'enchères" title="Article aux enchères" width="50" height="50"></div>
		    	<table>
		    		<tr>
			    		<td>Prix : </td>
			    		<td>210 points </td>
			    	</tr>
			    	<tr>
			    		<td>Fin de l'enchere : </td>
			    		<td>10/08/2018</td>
			    	</tr>
			    	<tr>
			    		<td>Vendeur</td>
			    		<td>jojo44</td>
			    	</tr>
		    	</table>
		    	</fieldset>
		    </div>
		    
		    <br><br>
		    
		    <div>
		    	<fieldset>
		        <h1>Article-2</h1>
		        <div><img src="image.jpg" alt="Image de l'article encours d'enchères" title="Article aux enchères" width="50" height="50"></div>
		    	<table>
		    		<tr>
			    		<td>Prix : </td>
			    		<td>210 points </td>
			    	</tr>
			    	<tr>
			    		<td>Fin de l'enchere : </td>
			    		<td>10/08/2018</td>
			    	</tr>
			    	<tr>
			    		<td>Vendeur</td>
			    		<td>jojo44</td>
			    	</tr>
		    	</table>
		    	</fieldset>
		    </div>
	  
        </main>
        <br><br>
          

</body>
</html>