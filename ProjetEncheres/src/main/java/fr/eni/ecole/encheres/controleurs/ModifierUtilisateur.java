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
 * Servlet implementation class ModifierUtilisateur
 */
@WebServlet("/modifierUtilisateur")
public class ModifierUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */


		protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		int noUtilisateur;
		Utilisateur u;
		noUtilisateur=Integer.parseInt(request.getParameter("noUtilisateur"));
		u=UtilisateurManager.getInstance().findByNoUtilisateur(noUtilisateur);
		request.setAttribute("userConnected", u);
		getServletContext().getRequestDispatcher("/ProjetEncheres/P7ModifierProfil.jsp").forward(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur userConnected;
		userConnected=(Utilisateur)(request.getSession().getAttribute("userConnected"));
	
		userConnected.setPseudo(request.getParameter("pseudo"));
		userConnected.setNom(request.getParameter("nom"));
		userConnected.setPrenom(request.getParameter("prenom"));
		userConnected.setEmail(request.getParameter("email"));
		userConnected.setTelephone(Integer.parseInt(request.getParameter("telephone")));
		userConnected.setRue(request.getParameter("rue"));
		userConnected.setCodePostal(Integer.parseInt(request.getParameter("codepostal")));
		userConnected.setVille(request.getParameter("ville"));
		userConnected.setMotDePasse(request.getParameter("password"));
		
		UtilisateurManager.getInstance().update(userConnected);
		
		response.sendRedirect("P7ModifierProfil.jsp");
		}

}


