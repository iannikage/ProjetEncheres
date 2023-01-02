package fr.eni.ecole.encheres.bll;

import java.util.List;

import fr.eni.ecole.encheres.bo.Enchere;
import fr.eni.ecole.encheres.bo.Utilisateur;
import fr.eni.ecole.encheres.dal.EnchereDAO;

public class EnchereManager {

	private static EnchereManager instance = null;
	private EnchereDAO enchereDAO;

	private EnchereManager(EnchereDAO enchereDAO) {
		this.enchereDAO = enchereDAO;
	}

	public static EnchereManager getInstance() {
		if (instance == null) {
			instance = new EnchereManager(EnchereDAO.getInstance());
		}
		return instance;
	}
	
	public void save(Enchere enchere) {
		enchereDAO.save(enchere);
	}
	
	public List<Enchere> findAll() { //Suppr de field/sens
		return enchereDAO.findAll();
	}
		
	public List<Enchere> getByUtilisateur (Utilisateur encherisseur, boolean ouvertes, boolean enCours, boolean remportees){
			return EnchereDAO.getInstance().getByNoUtilisateur(encherisseur.getNoUtilisateur(), ouvertes, enCours, remportees);
	}
	
}
