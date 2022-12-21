<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ACCUEIL</title>
</head>
<body>

    <div class="container">
        
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
        <input type="search" id="maRecherche" name="name">
    	<button>Rechercher</button>
    	
    	<br><br>
    	
    	<label for="Catégories">Catégories : </label>
    	<select for="Catégories">
    		<option value="">Toutes les catégories</option>
    		<option value="">Ameublement</option>
    		<option value="">Livres</option>
    		<option value="">Jouets</option>
    		<option value="">Informatique</option>
    		<option value="">Véhicules</option>
		</select>
      
        </main>
        <aside>SIDE
        	        </aside>
        <footer>FOOTER</footer>
    </div>

</body>
</html>