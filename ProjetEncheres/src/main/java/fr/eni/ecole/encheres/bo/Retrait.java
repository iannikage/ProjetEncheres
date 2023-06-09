package fr.eni.ecole.encheres.bo;

public class Retrait {
	
    private String rue;
    private String codePostal;
    private String ville;
    private ArticleVendu articlesVendus;
     
        
    public Retrait() {}


	public Retrait(String rue, String codePostal, String ville, ArticleVendu articlesVendus) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.articlesVendus = articlesVendus;
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public ArticleVendu getArticlesVendus() {
		return articlesVendus;
	}


	public void setArticlesVendus(ArticleVendu articlesVendus) {
		this.articlesVendus = articlesVendus;
	}


	@Override
	public String toString() {
		return "Retrait [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + ", articlesVendus="
				+ articlesVendus + "]";
	}

	
}
