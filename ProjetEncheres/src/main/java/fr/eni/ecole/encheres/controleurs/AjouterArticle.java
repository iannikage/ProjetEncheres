package fr.eni.ecole.encheres.controleurs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;

import fr.eni.ecole.encheres.bll.ArticleVenduManager;
import fr.eni.ecole.encheres.bll.UtilisateurManager;
import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.bo.Utilisateur;

/**
 * Servlet implementation class AjouterArticle
 */
@WebServlet("/ajouterArticle")
public class AjouterArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/ProjetEncheres/P9NouvelleVente.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomArticle, description;
		Date dateDebutEnchere, dateFinEnchere;
	 	int prixInitial, prixVente, noUtilisateur, noCategorie;
		ArticleVendu a;
		nomArticle=request.getParameter("nomArticle");
		description=request.getParameter("description");
		dateDebutEnchere=Date.parseDate(request.getParameter("dateDebutEnchere"));
		dateDebutEnchere=Date.parseDate(request.getParameter("dateDebutEnchere"));
		prixInitial=Integer.parseInt(request.getParameter("prixInitial"));
		prixVente=Integer.parseInt(request.getParameter("prixVente"));
		noUtilisateur=Integer.parseInt(request.getParameter("noUtilisateur"));
		noCategorie=Integer.parseInt(request.getParameter("noCategorie"));
		
		
		a=new ArticleVendu(nomArticle, description, dateDebutEnchere, dateFinEnchere, prixInitial, prixVente, noUtilisateur, noCategorie);
		ArticleVenduManager.getInstance().save(a);
		
		request.getSession().setAttribute("Userconnected",a);
		response.sendRedirect("P4P5AccueilCo.jsp");
		}

}
