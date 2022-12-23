package fr.eni.ecole.encheres.bll;

import java.util.List;


import fr.eni.ecole.encheres.bll.UtilisateurManager;
import fr.eni.ecole.encheres.dal.UtilisateurDAO;
import fr.eni.ecole.encheres.bo.Utilisateur;

public class UtilisateurManager {

	private static UtilisateurManager instance = null;
	private UtilisateurDAO utilisateurDAO;

	private UtilisateurManager(UtilisateurDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}

	public static UtilisateurManager getInstance() {
		if (instance == null) {
			instance = new UtilisateurManager(UtilisateurDAO.getInstance());
		}
		return instance;
	}

	public void save(Utilisateur utilisateur) {
		utilisateur.setCredit(utilisateur.getCredit() + 100);
		utilisateurDAO.save(utilisateur);
	}

	public void update(Utilisateur utilisateur) {
		utilisateurDAO.update(utilisateur);
	}

	public void deleteByNoUtilisateur(int noUtilisateur) {
		utilisateurDAO.deleteByNoUtilisateur(noUtilisateur);
	}

	public List<Utilisateur> findAll(String field, String sens) {
		return utilisateurDAO.findAll(field, sens);
	}

	public Utilisateur findByNoUtilisateur(int noUtilisateur) {
		return utilisateurDAO.findByNoUtilisateur(noUtilisateur);
	}

	public Utilisateur findByEmail(String email) {
		return utilisateurDAO.findByEmail(email);
	}

	public Utilisateur login(String email, String pwd) {
		return utilisateurDAO.login(email, pwd);
	}

	public boolean verificationPassword(String password) {
		char mdp;
		boolean numberOk = false;
		boolean letterOk = false;

		for (int i = 0; i < password.length(); i++) {
			mdp = password.charAt(i);
			if (Character.isDigit(mdp)) {
				numberOk = true;
			} else if (Character.isLetter(mdp)) {
				letterOk = true;
			}

		}

		return numberOk && letterOk;
	}

}
