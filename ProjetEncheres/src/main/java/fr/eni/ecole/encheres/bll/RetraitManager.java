package fr.eni.ecole.encheres.bll;

import java.util.List;

import fr.eni.ecole.encheres.bo.Retrait;
import fr.eni.ecole.encheres.dal.RetraitDAO;

public class RetraitManager {

	private static RetraitManager instance = null;
	private RetraitDAO retraitDAO;

	private RetraitManager(RetraitDAO retraitDAO) {
		this.retraitDAO = retraitDAO;
	}

	public static RetraitManager getInstance() {
		if (instance == null) {
			instance = new RetraitManager(RetraitDAO.getInstance());
		}
		return instance;
	}
	
	public void save(Retrait retrait) {
		retraitDAO.save(retrait);
	}
	
	public List<Retrait> findAll(String field, String sens) {
		return retraitDAO.findAll(field, sens);
	}
	
	
}
