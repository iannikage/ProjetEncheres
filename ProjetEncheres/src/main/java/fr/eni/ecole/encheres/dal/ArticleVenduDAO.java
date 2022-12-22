package fr.eni.ecole.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
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
			Connection con = connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO ArticleVendu (no_article,nom_article, description, date_debut_enchere, date_fin_enchere, prix_initial, prix_vente, no_vendeur, no_vendeur) VALUES (?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, articleVendu.getNoArticle());
			pstmt.setString(2, articleVendu.getNomArticle());
			pstmt.setString(3, articleVendu.getDescription());
			pstmt.setDate(4, articleVendu.getDateDebutEnchere());
			pstmt.setDate(5, articleVendu.getDateFinEnchere());
			pstmt.setInt(6, articleVendu.getPrixInitial());
			pstmt.setInt(7, articleVendu.getPrixVente());
			
			/* //sql 
			pstmt.setInt(8, articleVendu.getNoVendeur());
			pstmt.setString(9, articleVendu.getNoCategorie());
			// classe Java ArticleVendu
			pstmt.setInt(10, articleVendu.getCategorieArticle());
			pstmt.setString(11, articleVendu.getLieuRetrait());
			*/
			
			pstmt.executeUpdate();

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	
	public void deleteByNomArticle(int nomArticle) {

		try {
			Connection con = connectionBDD();

			PreparedStatement pstmt = con.prepareStatement("DELETE FROM ArticlesVendus WHERE nom_article=?");
			pstmt.setInt(1, nomArticle);
			pstmt.executeUpdate();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 

}
	
	
	public void deleteByNoArticle(int noArticle) {

		try {
			Connection con = connectionBDD();

			PreparedStatement pstmt = con.prepareStatement("DELETE FROM ArticlesVendus WHERE no_article=?");
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
	
	/* ajouter? 
	pstmt.setInt(8, articleVendu.getNoVendeur());
	pstmt.setString(9, articleVendu.getNoCategorie());
	// classe Java ArticleVendu
	pstmt.setInt(10, articleVendu.getCategorieArticle());
	pstmt.setString(11, articleVendu.getLieuRetrait());
	*/
	
	
	
	public ArticleVendu findByNoArticle(int noArticle) 
	{
		ArticleVendu articleVendu=null;
		try {
			Connection con = connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ArticlesVendus where no_article=?");
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
	
	
	public ArticleVendu findByNomArticle(String nomArticle) 
	{
		ArticleVendu articleVendu=null;
		try {
			Connection con = connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ArticlesVendus where nom_article=?");
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
	


	private Connection connectionBDD() {
		return null;
	}
	
}
	
	
	/* public ArticleVendu findByDateDebutEnchere -> besoin ou pas?   car dans BLL on aura une recherche ventes en cours
	 * et public ArticleVendu findByCategorie ? possible ou pas
	 * Besoin d'une connection par classeDAO? si pas besoin y a t-il besoin de spécifier quelquechose? 
	 * Public ArticleVendu findByVendeur? 
	 */
	
	

	
	
	
	
	/* private Connection connectionBDD() {
		// TODO Auto-generated method stub
		return null;
	}

	private Connection connectionBDD() {
		// TODO Auto-generated method stub
		return null;
	}

	//Sélectionner un article par son noArticle
	public ArticleVendu selectByNoArticle(int noArticle) throws DALException;
	
	
	//Sélectionner tous les articles 
	public List<ArticleVendu> selectAll() throws DALException;
	
	//Modifier les attributs d'un article connu en BD
	public void update(ArticleVendu data) throws DALException;
	
	//Insérer un nouvel article
	public void insert(ArticleVendu data) throws DALException;
	
	//Supprimer un article par noArticle
	public void delete(int noArticle) throws DALException;
	
	//Sélectionner les articles par categorieArticle
	public List<ArticleVendu> selectByCategorieArticle(int categorieArticle) throws DALException;
	
	//Sélectionner les articles par mot clé
	//On recherche le mot clé dans la désignation et la catégorie
	public List<ArticleVendu> selectByMotCle(String motCle) throws DALException;

}
*/