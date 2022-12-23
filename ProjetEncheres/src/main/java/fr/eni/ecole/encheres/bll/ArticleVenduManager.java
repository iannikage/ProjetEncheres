package fr.eni.ecole.encheres.bll;

import java.util.List;

import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.bo.Categorie;
import fr.eni.ecole.encheres.bo.Enchere;
import fr.eni.ecole.encheres.bo.Utilisateur;
import fr.eni.ecole.encheres.dal.ArticleVenduDAO;
import fr.eni.ecole.encheres.dal.EnchereDAO;
import fr.eni.ecole.encheres.dal.UtilisateurDAO;
import fr.eni.ecole.encheres.dal.CategorieDAO;

public class ArticleVenduManager {

	private static ArticleVenduManager instance = null;
	private ArticleVenduDAO articleVenduDAO;

	private ArticleVenduManager(ArticleVenduDAO articleVenduDAO) {
		this.articleVenduDAO = articleVenduDAO;
	}

	public static ArticleVenduManager getInstance() {
		if (instance == null) {
			instance = new ArticleVenduManager(ArticleVenduDAO.getInstance());
		}
		return instance;
	}
	
	public void save(ArticleVendu articleVendu) {
		articleVenduDAO.save(articleVendu);
	}
	
	public void deleteByNomArticle(String nomArticle) {
		articleVenduDAO.deleteByNomArticle(nomArticle);
	}
	
	public void deleteByNoArticle(int noArticle) {
		articleVenduDAO.deleteByNoArticle(noArticle);
	}
	
	public ArticleVendu findByNoArticle(int noArticle) {
		return articleVenduDAO.findByNoArticle(noArticle);
	}
	
	public ArticleVendu findByNomArticle(String nomArticle) {
		return articleVenduDAO.findByNomArticle(nomArticle);
	}
	
	//liens avec utilisateur/vendeur, liste encheres, categorieArticle, lieuRetrait
	
	//afficher liste articles vendus par utilisateur/vendeur :
	
	public List<ArticleVendu> getByNoUtilisateur (Utilisateur vendeur) {
		return articleVenduDAO.getByNoUtilisateur(vendeur.getNoUtilisateur());
	}
	
	public List<Categorie> findAll (){
		return CategorieDAO.getInstance().findAll();
	}
	
	

}
