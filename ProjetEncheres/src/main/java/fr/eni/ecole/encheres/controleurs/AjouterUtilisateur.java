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
 * Servlet implementation class Ajouter
 */
@WebServlet("/ajouterUtilisateur")
public class AjouterUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/ProjetEncheres/P3AjouterCreerProfil.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo, nom, prenom, rue, ville,  email, password;
	 	int telephone, codepostal;
		Utilisateur u;
		pseudo=request.getParameter("pseudo");
		nom=request.getParameter("nom");
		prenom=request.getParameter("prenom");
		email=request.getParameter("email");
		telephone=Integer.parseInt(request.getParameter("telephone"));
		rue=request.getParameter("rue");
		codepostal=Integer.parseInt(request.getParameter("codepostal"));
		ville=request.getParameter("ville");
		password=request.getParameter("password");
		
		u=new Utilisateur(pseudo, nom, prenom, email, telephone, rue, codepostal, ville, password, 0, 0);
		UtilisateurManager.getInstance().save(u);
		
		request.getSession().setAttribute("userConnected",u);
		response.sendRedirect("P4P5AccueilCo.jsp");
		}

}
