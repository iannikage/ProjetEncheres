package fr.eni.ecole.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.bo.Categorie;
import fr.eni.ecole.encheres.bo.Enchere;
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
	
	public List<Categorie> findAll(String field, String sens) {

		List<Categorie> categories = new ArrayList<Categorie>();

		try {
			PreparedStatement pstmt;
			Connection con = ConnexionDAO.connectionBDD();
			
				 pstmt= con.prepareStatement("SELECT DISTINCT no_categorie, libelle FROM Categories ");

			
			ResultSet res = pstmt.executeQuery();

			while (res.next()) {
				Categorie categorie = new Categorie();
				categorie.setNoCategorie(res.getInt("no_categorie"));
				categorie.setLibelle(res.getString("libelle"));
						
				categories.add(categorie);

			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return categories;
	}
	
}

    
	