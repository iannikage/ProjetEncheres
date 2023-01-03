package fr.eni.ecole.encheres.controleurs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.encheres.bll.UtilisateurManager;
import fr.eni.ecole.encheres.bo.Utilisateur;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/P2IdentifierCreerCompte.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo, motDePasse;	
		Utilisateur u;
		pseudo=request.getParameter("pseudo");
		motDePasse=request.getParameter("motDePasse");
		u=UtilisateurManager.getInstance().login(pseudo, motDePasse);
		if(u!=null) {
			Cookie coo;
			coo=new Cookie("lastLogin",u.getPseudo());
			coo.setMaxAge(7*24*60*60);
			response.addCookie(coo);
			request.getSession().setAttribute("userConnected", u);
			response.sendRedirect("login");/*a connecter avec servlet P4*/
		}
		else {
			response.sendRedirect("login");
		}
	}

}
