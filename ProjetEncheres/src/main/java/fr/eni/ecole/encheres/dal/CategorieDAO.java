package fr.eni.ecole.encheres.dal;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.encheres.bo.Categorie;


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
	
	public List<Categorie> findAll() {

		List<Categorie> categories = new ArrayList<Categorie>();

		try {
			PreparedStatement pstmt;
			Connection con = ConnexionDAO.connectionBDD();
			
				 pstmt= con.prepareStatement("SELECT * FROM Categories ");

			
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
	
	public Categorie findById(int noCategorie) {

		Categorie categorie;
		categorie=null;

		try {
			PreparedStatement pstmt;
			Connection con = ConnexionDAO.connectionBDD();
			
				 pstmt= con.prepareStatement("SELECT * FROM Categories where no_categorie=? ");
				 pstmt.setInt(1, noCategorie);
			
			ResultSet res = pstmt.executeQuery();

			if (res.next()) {
				categorie = new Categorie();
				categorie.setNoCategorie(res.getInt("no_categorie"));
				categorie.setLibelle(res.getString("libelle"));
						
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return categorie;
	}
	
}

    
	