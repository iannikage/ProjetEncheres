package fr.eni.ecole.encheres.dal;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.encheres.bo.Retrait;

public class RetraitDAO {

	private static RetraitDAO instance = null;

	private RetraitDAO() {
	
	}

	public static RetraitDAO getInstance() {
		if (instance == null) {
			instance = new RetraitDAO();
		}
		return instance;
	}
	
	public void save(Retrait retrait) {

		try {
			Connection con = ConnexionDAO.connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO Retraits (rue,code_postal,ville) VALUES (?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, retrait.getRue());
			pstmt.setString(2, retrait.getCodePostal());
			pstmt.setString(3, retrait.getVille());
			
		
			pstmt.executeUpdate();
			ResultSet cles=pstmt.getGeneratedKeys();
			cles.next();
			retrait.set(cles.getInt(1));


			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public List<Retrait> findAll() {

		List<Retrait> retraits = new ArrayList<Retrait>();

		try {
			PreparedStatement pstmt;
			Connection con = ConnexionDAO.connectionBDD();
			
				 pstmt= con.prepareStatement("SELECT * FROM Retraits ");
		
			ResultSet res = pstmt.executeQuery();

			while (res.next()) {
				Retrait retrait = new Retrait();
				retrait.setRue(res.getString("rue"));
				retrait.setCodePostal(res.getString("code_postal"));
				retrait.setVille(res.getString("ville"));
				
							
				retraits.add(retrait);

			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return retraits;
	}
	
}
