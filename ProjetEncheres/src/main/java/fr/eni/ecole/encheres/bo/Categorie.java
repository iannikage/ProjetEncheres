package fr.eni.ecole.encheres.bo;

import java.util.List;

public class Categorie {

	private int noCategorie;
	private String libelle;
	private List<ArticleVendu> articlesVendus;
	
	
	public Categorie () {
	
	}

	public Categorie(int noCategorie, String libelle, List<ArticleVendu> articlesVendus) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
		this.articlesVendus = articlesVendus;
	}
	public Categorie(String libelle, List<ArticleVendu> articlesVendus) {
		super();
		this.libelle = libelle;
		this.articlesVendus = articlesVendus;
	}

	public int getNoCategorie() {
		return noCategorie;
	}


	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public List<ArticleVendu> getArticlesVendus() {
		return articlesVendus;
	}


	public void setArticlesVendus(List<ArticleVendu> articlesVendus) {
		this.articlesVendus = articlesVendus;
	}


	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + ", articlesVendus=" + articlesVendus
				+ "]";
	}

	
	
}
