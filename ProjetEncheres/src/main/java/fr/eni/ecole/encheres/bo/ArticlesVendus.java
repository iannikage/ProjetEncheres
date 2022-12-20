package fr.eni.ecole.encheres.bo;

import java.sql.Date;

public class ArticlesVendus {

	   private int noArticle;
	    private String nomArticle;
	    private String description;
	    private Date dateDebutEnchere;
	    private Date dateFinEnchere;
	    private String prixInitial;
	    private String prixVente;
	    private int noVendeur;
	    private int noCategorie;
	    private int categorieArticle;
	    private String lieuRetrait;

	    public ArticlesVendus () {

	    }

	    public ArticlesVendus(int noArticle, String nomArticle, String description, Date dateDebutEnchere,
	            Date dateFinEnchere, String prixInitial, String prixVente, int noVendeur, int noCategorie,
	            int categorieArticle, String lieuRetrait) {
	        super();
	        this.noArticle = noArticle;
	        this.nomArticle = nomArticle;
	        this.description = description;
	        this.dateDebutEnchere = dateDebutEnchere;
	        this.dateFinEnchere = dateFinEnchere;
	        this.prixInitial = prixInitial;
	        this.prixVente = prixVente;
	        this.noVendeur = noVendeur;
	        this.noCategorie = noCategorie;
	        this.categorieArticle = categorieArticle;
	        this.lieuRetrait = lieuRetrait;
	    }


	    //Getter pour lieu retrait 
	    public String lieuRetrait() {
	        return lieuRetrait;
	    }

	    //Getter pour categorie Article 
	    public int categorieArticle () {
	        return categorieArticle;
	    }

	 

	    public int getNoArticle() {
	        return noArticle;
	    }

	 

	    public void setNoArticle(int noArticle) {
	        this.noArticle = noArticle;
	    }

	 

	    public String getNomArticle() {
	        return nomArticle;
	    }

	 

	    public void setNomArticle(String nomArticle) {
	        this.nomArticle = nomArticle;
	    }

	 

	    public String getDescription() {
	        return description;
	    }

	 

	    public void setDescription(String description) {
	        this.description = description;
	    }

	 

	    public Date getDateDebutEnchere() {
	        return dateDebutEnchere;
	    }

	 

	    public void setDateDebutEnchere(Date dateDebutEnchere) {
	        this.dateDebutEnchere = dateDebutEnchere;
	    }

	 

	    public Date getDateFinEnchere() {
	        return dateFinEnchere;
	    }

	 

	    public void setDateFinEnchere(Date dateFinEnchere) {
	        this.dateFinEnchere = dateFinEnchere;
	    }

	 

	    public String getPrixInitial() {
	        return prixInitial;
	    }

	 

	    public void setPrixInitial(String prixInitial) {
	        this.prixInitial = prixInitial;
	    }

	 

	    public String getPrixVente() {
	        return prixVente;
	    }

	 

	    public void setPrixVente(String prixVente) {
	        this.prixVente = prixVente;
	    }

	 

	    public int getNoVendeur() {
	        return noVendeur;
	    }

	 

	    public void setNoVendeur(int noVendeur) {
	        this.noVendeur = noVendeur;
	    }

	 

	    public int getNoCategorie() {
	        return noCategorie;
	    }

	 

	    public void setNoCategorie(int noCategorie) {
	        this.noCategorie = noCategorie;
	    }

	 

	    public int getCategorieArticle() {
	        return categorieArticle;
	    }

	 

	    public void setCategorieArticle(int categorieArticle) {
	        this.categorieArticle = categorieArticle;
	    }

	 

	    public String getLieuRetrait() {
	        return lieuRetrait;
	    }

	 

	    public void setLieuRetrait(String lieuRetrait) {
	        this.lieuRetrait = lieuRetrait;
	    }

	 

	    @Override
	    public String toString() {
	        return "ArticlesVendus [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
	                + ", dateDebutEnchere=" + dateDebutEnchere + ", dateFinEnchere=" + dateFinEnchere + ", prixInitial="
	                + prixInitial + ", prixVente=" + prixVente + ", noVendeur=" + noVendeur + ", noCategorie=" + noCategorie
	                + ", categorieArticle=" + categorieArticle + ", lieuRetrait=" + lieuRetrait + "]";
	    }



}
