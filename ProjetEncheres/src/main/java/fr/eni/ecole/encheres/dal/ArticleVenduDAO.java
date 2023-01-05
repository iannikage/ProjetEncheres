package fr.eni.ecole.encheres.dal;

import java.sql.Connection;





import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.bo.Categorie;
import fr.eni.ecole.encheres.bo.Utilisateur;
import fr.eni.ecole.encheres.dal.DALException;

public class ArticleVenduDAO {
	
	private static ArticleVenduDAO instance = null;

	private ArticleVenduDAO() {
	
	}

	public static ArticleVenduDAO getInstance() {
		if (instance == null) {
			instance = new ArticleVenduDAO();
		}
		return instance;
	}
	
	
	public void save(ArticleVendu articleVendu) { 

		try {
			Connection con = ConnexionDAO.connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO Articles_Vendus (nom_article, description, date_debut_enchere, date_fin_enchere, prix_initial, prix_vente, no_vendeur, no_categorie) VALUES (?,?,?,?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, articleVendu.getNomArticle());
			pstmt.setString(2, articleVendu.getDescription());
			pstmt.setDate(3, new Date(articleVendu.getDateDebutEnchere().getTime()));
			pstmt.setDate(4, new Date(articleVendu.getDateFinEnchere().getTime()));
			pstmt.setInt(5, articleVendu.getPrixInitial());
			pstmt.setInt(6, articleVendu.getPrixVente());
			pstmt.setInt(7, articleVendu.getVendeur().getNoUtilisateur());
			pstmt.setInt(8, articleVendu.getCategorieArticle().getNoCategorie());
		
		
			
			pstmt.executeUpdate();
			ResultSet cles=pstmt.getGeneratedKeys();
			cles.next();
			articleVendu.setNoArticle(cles.getInt(1));

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	
	
	
	public void deleteByNomArticle(String nomArticle) {

		try {
			Connection con = ConnexionDAO.connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM Articles_Vendus WHERE nom_article=?");
			pstmt.setString(1, nomArticle);
			pstmt.executeUpdate();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 

}
	
	
	public void deleteByNoArticle(int noArticle) {

		try {
			Connection con = ConnexionDAO.connectionBDD();

			PreparedStatement pstmt = con.prepareStatement("DELETE FROM Articles_Vendus WHERE no_article=?");
			pstmt.setInt(1, noArticle);
			pstmt.executeUpdate();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 

}
	
	
	private ArticleVendu articleFromRs (ResultSet res) throws SQLException {
		ArticleVendu articleVendu;
		articleVendu = new ArticleVendu();
		articleVendu.setNoArticle(res.getInt("no_article"));
		articleVendu.setNomArticle(res.getString("nom_article"));
		articleVendu.setDescription(res.getString("description"));
		articleVendu.setDateDebutEnchere(res.getDate("date_debut_enchere"));
		articleVendu.setDateFinEnchere(res.getDate("date_fin_enchere"));
		articleVendu.setPrixInitial(res.getInt("prix_initial"));
		articleVendu.setPrixVente(res.getInt("prix_vente"));
		
		
		return articleVendu;
	}
	
	
	public List<ArticleVendu> getByNoUtilisateur (int noUtilisateur, boolean enCours, boolean nonDebutees, boolean terminees) throws SQLException 
	{
		List<ArticleVendu> articlesVendus= new ArrayList<>();
		String request;
		PreparedStatement pstmt=null;
		Connection con = ConnexionDAO.connectionBDD();
		if (enCours) {
			request = "SELECT * from ARTICLES_VENDUS where date_debut_enchere < GETDATE() and date_fin_enchere > GETDATE() and where no_vendeur = ?";
			pstmt = con.prepareStatement(request);
			pstmt.setInt(1, noUtilisateur);
			
		}
		if (nonDebutees) {
			request = "SELECT * from ARTICLES_VENDUS where date_debut_enchere > GETDATE() and where no_vendeur = ?";
					pstmt = con.prepareStatement(request);
					pstmt.setInt(1,noUtilisateur);
					
		}
		if (terminees) {
			request = "SELECT * from ARTICLES_VENDUS where date_fin_enchere > GETDATE() and where no_vendeur = ?";
					pstmt = con.prepareStatement(request);
					pstmt.setInt(1,noUtilisateur);
					
		}
		try {
			ResultSet res = pstmt.executeQuery();
			while (res.next()) 
			{ 
				articlesVendus.add(articleFromRs (res));
				
			}
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return articlesVendus;
	}
	
	
	public ArticleVendu findByNoArticle(int noArticle) 
	{
		ArticleVendu articleVendu=null;
		try {
			Connection con = ConnexionDAO.connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Articles_Vendus where no_article=?");
			pstmt.setInt(1,noArticle);
			ResultSet res = pstmt.executeQuery();
			if(res.next()) 
			{ 
				articleVendu = articleFromRs (res);
				
			}
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return articleVendu;
	}
	
	public List<ArticleVendu> findByNoCategorie (int noCategorie) 
	{
		List<ArticleVendu> articleVendu= new ArrayList<>();
		try {
			Connection con = ConnexionDAO.connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Articles_Vendus where no_categorie=?");
			pstmt.setInt(1,noCategorie);
			ResultSet res = pstmt.executeQuery();
			if(res.next()) 
			{ 
				articleVendu.add (articleFromRs (res));
				
			}
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return articleVendu;
	}
	
	
	public ArticleVendu findByNomArticle(String nomArticle) 
	{
		ArticleVendu articleVendu=null;
		try {
			Connection con = ConnexionDAO.connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Articles_Vendus where nom_article=?");
			pstmt.setString(1,nomArticle);
			ResultSet res = pstmt.executeQuery();
			if(res.next()) 
			{ 
				articleVendu = articleFromRs (res);
				
			}
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return articleVendu;
	}
	
	//vu
	
}
	

	
	
	
	
	