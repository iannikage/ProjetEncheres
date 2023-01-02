package fr.eni.ecole.encheres.dal;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.bo.Enchere;

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
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO Enchere (date_enchere,montant_enchere,no_encherisseur,no_article) VALUES (?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, enchere.getNoEnchere());
			pstmt.setDate(2, enchere.getDateEnchere());
			pstmt.setInt(3, enchere.getMontantEnchere());
			pstmt.setInt(4, enchere.getEncherisseur().getNoUtilisateur());
			pstmt.setInt(5, enchere.getArticleEncheri().getNoArticle());
			

			pstmt.executeUpdate();
			ResultSet cles=pstmt.getGeneratedKeys();
			cles.next();
			enchere.setNoEnchere(cles.getInt(1));


			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public List<Enchere> findAll() {

		List<Enchere> encheres = new ArrayList<Enchere>();

		try {
			PreparedStatement pstmt;
			Connection con = ConnexionDAO.connectionBDD();
				pstmt= con.prepareStatement("SELECT * FROM Enchere ");
		
			
			ResultSet res = pstmt.executeQuery();

			while (res.next()) {
				Enchere enchere = new Enchere();
				enchere.setNoEnchere(res.getInt("no_enchere"));
				enchere.setDateEnchere(res.getDate("date_enchere"));
				enchere.setMontantEnchere(res.getInt("montant_enchere"));
	
							
				encheres.add(enchere);

			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return encheres;
	}
	
	private Enchere enchereFromRs (ResultSet res) throws SQLException {
		Enchere enchere;
		enchere = new Enchere();
		enchere.setNoEnchere(res.getInt("no_enchere"));
		enchere.setDateEnchere(res.getDate("date_enchere"));
		enchere.setMontantEnchere(res.getInt("montant_enchere"));
	
		
		return enchere;
	}
	
	public List<Enchere> getByNoUtilisateur (int noUtilisateur, boolean ouvertes, boolean enCours, boolean remportees) throws SQLException 
	{
		List<Enchere> encheresEmises= new ArrayList<>();
		String request;
		PreparedStatement pstmt=null;
		Connection con = ConnexionDAO.connectionBDD();
		if (ouvertes) {
			request = "SELECT * from ARTICLES_VENDUS where date_debut_enchere < GETDATE() and date_fin_enchere > GETDATE()";
			pstmt = con.prepareStatement(request);
			
		}
		if (enCours) {
			request = "SELECT * from ARTICLES_VENDUS where date_debut_enchere < GETDATE() and date_fin_enchere < GETDATE() and where no_encherisseur = ?";
			pstmt = con.prepareStatement(request);
			pstmt.setInt(1,noUtilisateur);
					
		}
		if (remportees) {
			request = "SELECT * from ARTICLES_VENDUS where date_fin_enchere > GETDATE() and where no_encherisseur = ? //and where prix_vente = ?";
			pstmt = con.prepareStatement(request);
			pstmt.setInt(1,noUtilisateur);
			//pstmt.setInt(2,noEnchere);
		}
		
		try {
			ResultSet res = pstmt.executeQuery();
			while (res.next()) 
			{ 
				encheresEmises.add(enchereFromRs (res));

			}
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return encheresEmises;
	}
}
