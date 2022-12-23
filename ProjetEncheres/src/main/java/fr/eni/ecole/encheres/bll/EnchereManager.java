package fr.eni.ecole.encheres.bll;

import java.util.List;

import fr.eni.ecole.encheres.bo.Enchere;
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
	
	public List<Enchere> findAll(String field, String sens) {
		return enchereDAO.findAll(field, sens);
	}
	
}
