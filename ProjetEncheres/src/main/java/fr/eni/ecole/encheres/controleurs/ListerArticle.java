package fr.eni.ecole.encheres.controleurs;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.encheres.bll.ArticleVenduManager;
import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.bo.Categorie;
import fr.eni.ecole.encheres.bo.Enchere;

/**
 * Servlet implementation class ListerArticle
 */
@WebServlet("/ListerArticle")
public class ListerArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ArticleVendu> liste;
		int noCategorie;
		noCategorie= Integer.parseInt(request.getParameter("categorie"));
		liste=ArticleVenduManager.getInstance().findByNoCategorie(noCategorie);
		
		request.setAttribute("liste", liste);
		getServletContext().getRequestDispatcher("/P1AccueilDeco.jsp").forward(request,  response);
	}


}
