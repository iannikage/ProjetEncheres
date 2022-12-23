package fr.eni.ecole.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.bo.Categorie;
import fr.eni.ecole.encheres.bo.Utilisateur;

public class CategorieDAO {
	private static CategorieDAO instance = null;

	private CategorieDAO() {
	
	}

	public static CategorieDAO getInstance() {
		if (instance == null) {
			instance = new CategorieDAO();
		}
		return instance;
	}

	
	public List<Categorie> listerLesCategories() {
		return null;
	}
		List<Categorie> listeCategories = new ArrayList<Categorie>()

        
	/*public  Categorie findByNoCategorie(int noCategorie) {
		Categorie categorieArticle=null;
		try {
			Connection con = connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Categories where no_categorie=?");
			pstmt.setInt(1,noCategorie);
			ResultSet res = pstmt.executeQuery();
			if(res.next()) 
			{
				
				categorieArticle = new Categorie();
				categorieArticle.setNoCategorie(res.getInt("noCategorie"));
				return categorieArticle;
				
			}
			con.close();
		}
			catch (SQLException e) {
				e.printStackTrace();
			} 
			return categorieArticle;
		}
		
		
	
	private Connection connectionBDD() {
		// TODO Auto-generated method stub
		return null
*/
	}
}

	private Connection connectionBDD() {
		// TODO Auto-generated method stub
		return null;
	}