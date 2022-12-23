package fr.eni.ecole.encheres.bll;

import java.util.List;


import fr.eni.ecole.encheres.bo.Categorie;
import fr.eni.ecole.encheres.dal.CategorieDAO;

public class CategorieManager {

	private static CategorieManager instance = null;
	private CategorieDAO categorieDAO;

	private CategorieManager(CategorieDAO categorieDAO) {
		this.categorieDAO = categorieDAO;
	}

	public static CategorieManager getInstance() {
		if (instance == null) {
			instance = new CategorieManager(CategorieDAO.getInstance());
		}
		return instance;
	}
	
	public List<Categorie> findAll() {
		return categorieDAO.findAll();
	}
}
