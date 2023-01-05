package fr.eni.ecole.encheres.controleurs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.encheres.bll.UtilisateurManager;
import fr.eni.ecole.encheres.bo.Utilisateur;

/**
 * Servlet implementation class SupprimerUtilisateur
 */
@WebServlet("/supprimerUtilisateur")
public class SupprimerUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int noUtilisateur;
	Utilisateur userConnected;
	userConnected=(Utilisateur)(request.getSession().getAttribute("userConnected"));
	UtilisateurManager.getInstance().deleteByNoUtilisateur(userConnected.getNoUtilisateur());

	response.sendRedirect("/ProjetEncheres/P1AccueilDeco.jsp");
		
	}
	
}

	