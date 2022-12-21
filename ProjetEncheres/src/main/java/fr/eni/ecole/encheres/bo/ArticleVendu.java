package fr.eni.ecole.encheres.bo;

import java.sql.Date;
import java.util.List;

public class ArticleVendu {

	   private int noArticle;
	    private String nomArticle;
	    private String description;
	    private Date dateDebutEnchere;
	    private Date dateFinEnchere;
	    private String prixInitial;
	    private String prixVente;
	    private Utilisateur vendeur;
	    private List<Enchere> encheresEmises;
	    private Categorie categorieArticle;
	    private Retrait lieuRetrait;

	    public ArticleVendu () {

	    }

		public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEnchere,
				Date dateFinEnchere, String prixInitial, String prixVente, Utilisateur vendeur,
				List<Enchere> encheresEmises, Categorie categorieArticle, Retrait lieuRetrait) {
			super();
			this.noArticle = noArticle;
			this.nomArticle = nomArticle;
			this.description = description;
			this.dateDebutEnchere = dateDebutEnchere;
			this.dateFinEnchere = dateFinEnchere;
			this.prixInitial = prixInitial;
			this.prixVente = prixVente;
			this.vendeur = vendeur;
			this.encheresEmises = encheresEmises;
			this.categorieArticle = categorieArticle;
			this.lieuRetrait = lieuRetrait;
		}
		public ArticleVendu(String nomArticle, String description, Date dateDebutEnchere,
				Date dateFinEnchere, String prixInitial, String prixVente, Utilisateur vendeur,
				List<Enchere> encheresEmises, Categorie categorieArticle, Retrait lieuRetrait) {
			super();
			this.nomArticle = nomArticle;
			this.description = description;
			this.dateDebutEnchere = dateDebutEnchere;
			this.dateFinEnchere = dateFinEnchere;
			this.prixInitial = prixInitial;
			this.prixVente = prixVente;
			this.vendeur = vendeur;
			this.encheresEmises = encheresEmises;
			this.categorieArticle = categorieArticle;
			this.lieuRetrait = lieuRetrait;
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

		public Utilisateur getVendeur() {
			return vendeur;
		}

		public void setVendeur(Utilisateur vendeur) {
			this.vendeur = vendeur;
		}

		public List<Enchere> getEncheresEmises() {
			return encheresEmises;
		}

		public void setEncheresEmises(List<Enchere> encheresEmises) {
			this.encheresEmises = encheresEmises;
		}

		public Categorie getCategorieArticle() {
			return categorieArticle;
		}

		public void setCategorieArticle(Categorie categorieArticle) {
			this.categorieArticle = categorieArticle;
		}

		public Retrait getLieuRetrait() {
			return lieuRetrait;
		}

		public void setLieuRetrait(Retrait lieuRetrait) {
			this.lieuRetrait = lieuRetrait;
		}

		@Override
		public String toString() {
			return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description="
					+ description + ", dateDebutEnchere=" + dateDebutEnchere + ", dateFinEnchere=" + dateFinEnchere
					+ ", prixInitial=" + prixInitial + ", prixVente=" + prixVente + ", vendeur=" + vendeur
					+ ", encheresEmises=" + encheresEmises + "]";
		}

	   
}
