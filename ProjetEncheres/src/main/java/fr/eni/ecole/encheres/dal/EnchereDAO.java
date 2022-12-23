package fr.eni.ecole.encheres.dal;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import fr.eni.ecole.encheres.bo.Enchere;
import fr.eni.ecole.encheres.bo.Utilisateur;

public class EnchereDAO {
	
	private static EnchereDAO instance = null;

	private EnchereDAO() {
	
	}

	public static EnchereDAO getInstance() {
		if (instance == null) {
			instance = new EnchereDAO();
		}
		return instance;
	}
	
	public void save(Enchere enchere) {

		try {
			Connection con = ConnexionDAO.connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO Enchere (no_enchere,date_enchere,montant_enchere,no_encherisseur,no_article) VALUES (?,?,?,?,?)");
			pstmt.setInt(1, enchere.getNoEnchere());
			pstmt.setDate(2, enchere.getDateEnchere());
			pstmt.setInt(3, enchere.getMontantEnchere());
			pstmt.setInt(4, enchere.getEncherisseur().getNoUtilisateur());
			pstmt.setInt(5, enchere.getArticleEncheri().getNoArticle());
			

			pstmt.executeUpdate();

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public List<Enchere> findAll(String field, String sens) {

		List<Enchere> encheres = new ArrayList<Enchere>();

		try {
			PreparedStatement pstmt;
			Connection con = ConnexionDAO.connectionBDD();
			if(field!=null && sens!=null)
			{
				 pstmt= con.prepareStatement("SELECT * FROM Enchere order by " + field + " " + sens);
			}
			else
			{
				 pstmt= con.prepareStatement("SELECT * FROM Enchere ");
			}

			
			ResultSet res = pstmt.executeQuery();

			while (res.next()) {
				Enchere enchere = new Enchere();
				enchere.setNoEnchere(res.getInt("no_enchere"));
				enchere.setDateEnchere(res.getDate("date_enchere"));
				enchere.setMontantEnchere(res.getInt("montant_enchere"));
				/*
				enchere.setNoArticle(res.getInt("no_article"));
				utilisateur.setNoEncherisseur(res.getString("no_encherisseur"));
				*/
							
				encheres.add(enchere);

			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return encheres;
	}
	
	//mettre un finbyDatedébut ?
	
	
}
