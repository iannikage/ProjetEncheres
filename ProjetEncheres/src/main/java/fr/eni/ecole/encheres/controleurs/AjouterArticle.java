package fr.eni.ecole.encheres.controleurs;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.List;

import fr.eni.ecole.encheres.bll.ArticleVenduManager;
import fr.eni.ecole.encheres.bll.CategorieManager;
import fr.eni.ecole.encheres.bll.UtilisateurManager;
import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.bo.Categorie;
import fr.eni.ecole.encheres.bo.Utilisateur;

/**
 * Servlet implementation class AjouterArticle
 */
@WebServlet("/ajouterArticle")
public class AjouterArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<Categorie> listeCategorie;
			listeCategorie=CategorieManager.getInstance().findAll();
			request.setAttribute("listeCategorie", listeCategorie);
			getServletContext().getRequestDispatcher("/P9NouvelleVente.jsp").forward(request, response);
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomArticle, description;
		Date dateDebutEnchere=null, dateFinEnchere=null;
	 	int prixInitial, noCategorie;
		ArticleVendu a;
		request.setCharacterEncoding("UTF-8");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		nomArticle=request.getParameter("article");
		description=request.getParameter("description");
		noCategorie=Integer.parseInt(request.getParameter("categorie"));
		try {
			dateDebutEnchere=sdf.parse(request.getParameter("dateDebutEnchere"));
			dateFinEnchere=sdf.parse(request.getParameter("dateFinEnchere"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prixInitial=Integer.parseInt(request.getParameter("prixInitial"));
		

		a=new ArticleVendu(nomArticle, description, dateDebutEnchere, dateFinEnchere, prixInitial, 0, 
				(Utilisateur)(request.getSession().getAttribute("userConnected")), null, CategorieManager.getInstance().findById(noCategorie), null);
		
		ArticleVenduManager.getInstance().save(a);
		
		request.getSession().setAttribute("Userconnected",a);
		response.sendRedirect("P4P5AccueilCo.jsp");
		}
}
