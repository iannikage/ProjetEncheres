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
		request.setAttribute("utilisateur", u);
		getServletContext().getRequestDispatcher("/ProjetEncheres/P7Modifier.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int noUtilisateur;
		Utilisateur u;
		noUtilisateur=Integer.parseInt(request.getParameter("noUtilisateur"));
		u=UtilisateurManager.getInstance().findByNoUtilisateur(noUtilisateur);
		u.setPseudo(request.getParameter("pseudo"));
		u.setNom(request.getParameter("nom"));
		u.setPrenom(request.getParameter("prenom"));
		u.setEmail(request.getParameter("email"));
		u.setMotDePasse(request.getParameter("password"));
		UtilisateurManager.getInstance().update(u);
		response.sendRedirect("lister");
		
	}

}
