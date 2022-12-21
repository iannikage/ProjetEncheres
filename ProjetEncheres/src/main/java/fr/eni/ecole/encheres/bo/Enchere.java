package fr.eni.ecole.encheres.bo;

import java.util.Date;

public class Enchere {
    
	private int noEnchere;
    private Date dateEnchere;
    private int montantEnchere;
    private Utilisateur encherisseur;
    private ArticleVendu articleEncheri;
    
    
    public Enchere() {
    	
    }
    
    public Enchere(int noEnchere, Date dateEnchere, int montantEnchere, Utilisateur encherisseur, ArticleVendu articleEncheri) {
		super();
		this.noEnchere = noEnchere;
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
		this.encherisseur = encherisseur;
		this.articleEncheri = articleEncheri;
	}
    
	public Enchere(Date dateEnchere, int montantEnchere, Utilisateur encherisseur, ArticleVendu articleEncheri) {
		super();
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
		this.encherisseur = encherisseur;
		this.articleEncheri = articleEncheri;
	}

	public int getNoEnchere() {
		return noEnchere;
	}

	public void setNoEnchere(int noEnchere) {
		this.noEnchere = noEnchere;
	}

	public Date getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public int getMontantEnchere() {
		return montantEnchere;
	}

	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	public Utilisateur getEncherisseur() {
		return encherisseur;
	}

	public void setEncherisseur(Utilisateur encherisseur) {
		this.encherisseur = encherisseur;
	}

	public ArticleVendu getArticleEncheri() {
		return articleEncheri;
	}

	public void setArticleEncheri(ArticleVendu articleEncheri) {
		this.articleEncheri = articleEncheri;
	}

	@Override
	public String toString() {
		return "Enchere [dateEnchere=" + dateEnchere + ", montantEnchere=" + montantEnchere + ", encherisseur="
				+ encherisseur + "]";
	}
    
	
    
    
   
    
    
}
