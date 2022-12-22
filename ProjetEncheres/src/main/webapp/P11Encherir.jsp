<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Encherir</title>
</head>
<body>
    <header>
      <h1>ENI-ENCHERE</h1>
    </header>  
   
    <div>
      <h1>Détail Vente</h1>
    </div>

    <div>
        <div>
          <h1>Nom de l'article</h1>
        </div>
        <div>
          <img src="image.jpg" alt="Image de l'article encours d'enchères" title="Article aux enchères" width="50" height="50">
        </div>
        <table>
            <tr>
                <td>Description:</td>
                <td>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Reiciendis natus recusandae dolore molestiae fuga ipsam aperiam animi quis, ipsa, fugiat in saepe quae voluptates, numquam eveniet cum voluptatibus veritatis illum laborum reprehenderit? Quis ullam, voluptatibus voluptas rerum odio, eius voluptate inventore culpa molestias a earum sequi veniam quam? Pariatur, esse.</td>
            </tr>
            <tr>
                <td>Meilleure offre:</td>
                <td>210 pts par bob</td>
            </tr>
            <tr>
                <td>Mise à prix:</td>
                <td>185 points</td>
            </tr>    
            <tr>
                <td>Fin de l'enchère:</td>
                <td>09/10/2018</td>
            </tr>
            <tr>
                <td>Retrait:</td>
                <td>10 allée des alouettes 44800 Saint Herblain</td>
            </tr>
            <tr>
                <td>Vendeur:</td>
                <td>jojo44</td>
            </tr> 
        </table>

        <div>
            <label for="mPrix">Ma Proposition :</label>
            <input class="input" type="number" name="mPrix" id="mPrix" 
            step="1" max= "10000" min="0" required>
        </div>

      <div>
        <button type="submit">Enchérir</button> 
      </div>

</body>
</html>