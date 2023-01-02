package fr.eni.ecole.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import fr.eni.ecole.encheres.dal.UtilisateurDAO;
import fr.eni.ecole.encheres.bo.Utilisateur;

public class UtilisateurDAO {

	private static UtilisateurDAO instance = null;

	private UtilisateurDAO() {
	
	}

	public static UtilisateurDAO getInstance() {
		if (instance == null) {
			instance = new UtilisateurDAO();
		}
		return instance;
	}
	
	
	
	public void save(Utilisateur utilisateur) {

		try {
			Connection con = connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO Utilisateurs (pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setInt(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setInt(7, utilisateur.getCodePostal());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMotDePasse());
			pstmt.setInt(10, utilisateur.getCredit());
			pstmt.setInt(11, utilisateur.getAdministrateur());
			//securiser mdp avec hashPwd
		
			pstmt.executeUpdate();

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void update(Utilisateur c) {

		try {
			Connection con = connectionBDD();

			
			PreparedStatement pstmt = con.prepareStatement("update Utilisateurs set pseudo=?,nom=?,prenom=?,email=?,telephone=?,rue=?,code_postal=?,ville=?,mot_de_passe=?");
			
			pstmt.setString(1, c.getPseudo());
			pstmt.setString(2, c.getNom());
			pstmt.setString(3, c.getPrenom());
			pstmt.setString(4, c.getEmail());
			pstmt.setInt(5, c.getTelephone());
			pstmt.setString(6, c.getRue());
			pstmt.setInt(7, c.getCodePostal());
			pstmt.setString(8, c.getVille());
			pstmt.setString(9, c.getMotDePasse());
			//securiser mdp avec hashPwd
			
			pstmt.executeUpdate();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	

	public void deleteByNoUtilisateur(int noUtilisateur) {

		try {
			Connection con = connectionBDD();

			PreparedStatement pstmt = con.prepareStatement("DELETE FROM Utilisateurs WHERE no_utilisateur=?");
			pstmt.setInt(1, noUtilisateur);
			pstmt.executeUpdate();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 

}
	

	private Utilisateur userFromRs (ResultSet res) throws SQLException {
		Utilisateur utilisateur;
		utilisateur = new Utilisateur();
		utilisateur.setNoUtilisateur(res.getInt("no_utilisateur"));
		utilisateur.setPseudo(res.getString("pseudo"));
		utilisateur.setNom(res.getString("nom"));
		utilisateur.setPrenom(res.getString("prenom"));
		utilisateur.setEmail(res.getString("email"));
		utilisateur.setTelephone(res.getInt("telephone"));
		utilisateur.setRue(res.getString("rue"));
		utilisateur.setCodePostal(res.getInt("code_postal"));
		utilisateur.setVille(res.getString("ville"));
		utilisateur.setMotDePasse(res.getString("mot_de_passe"));
		utilisateur.setCredit(res.getInt("credit"));
		utilisateur.setAdministrateur(res.getInt("administrateur"));
		return utilisateur;
	}
	
	
	
	public List<Utilisateur> findAll(String field, String sens) {

		List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();

		try {
			PreparedStatement pstmt;
			Connection con = connectionBDD();
			if(field!=null && sens!=null)
			{
				 pstmt= con.prepareStatement("SELECT * FROM Utilisateurs order by " + field + " " + sens);
			}
			else
			{
				 pstmt= con.prepareStatement("SELECT * FROM Utilisateurs ");
			}

			
			ResultSet res = pstmt.executeQuery();

			while (res.next()) {
				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setNoUtilisateur(res.getInt("no_utilisateur"));
				utilisateur.setPseudo(res.getString("pseudo"));
				utilisateur.setNom(res.getString("nom"));
				utilisateur.setPrenom(res.getString("prenom"));
				utilisateur.setEmail(res.getString("email"));
				utilisateur.setTelephone(res.getInt("telephone"));
				utilisateur.setRue(res.getString("rue"));
				utilisateur.setCodePostal(res.getInt("code_postal"));
				utilisateur.setVille(res.getString("ville"));
				utilisateur.setMotDePasse(res.getString("mot_de_passe"));
				utilisateur.setCredit(res.getInt("credit"));
				utilisateur.setAdministrateur(res.getInt("administrateur"));
							
				utilisateurs.add(utilisateur);

			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return utilisateurs;
	}
	
	public Utilisateur findByNoUtilisateur(int noUtilisateur) 
	{
		Utilisateur utilisateur=null;
		try {
			Connection con = connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Utilisateurs where no_utilisateur=?");
			pstmt.setInt(1,noUtilisateur);
			ResultSet res = pstmt.executeQuery();
			if(res.next()) 
			{ 
				utilisateur = userFromRs (res);
				
			}
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return utilisateur;
	}
	
	public Utilisateur findByEmail(String email) 
	{
		Utilisateur utilisateur=null;
		try {
			Connection con = connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Utilisateurs where email=?");
			pstmt.setString(1,email);
			ResultSet res = pstmt.executeQuery();
			if(res.next()) 
			{
				{ 
					utilisateur = userFromRs (res);
					
				}

			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return utilisateur;
	}
	
	public Utilisateur login(String email,String motDePasse) 
	{
		Utilisateur utilisateur=null;
		try {
			Connection con = connectionBDD();
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Utilisateurs where email=? and mot_de_passe=?");
			pstmt.setString(1,email);
			pstmt.setString(2,motDePasse);
			ResultSet res = pstmt.executeQuery();
			if(res.next()) 
			{ 
				utilisateur = userFromRs (res);
				
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return utilisateur;
	}
	
	
	private static Connection connectionBDD() throws SQLException {
		/*	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;database=Annuaire"; // fabriquer l'url de connexion
			Connection con = DriverManager.getConnection(url, "sa", "Pa$$w0rd"); // lance la connexion*/
			Connection con=null;
			DataSource ds;
			InitialContext ctx;
			try 
			{
				ctx=new InitialContext();
				ds=(DataSource)ctx.lookup("java:comp/env/jdbc/pool_cnx");
				con=ds.getConnection();
				
			}
			catch (NamingException e) 
			{
				e.printStackTrace();
			}
			
			//test
			return con;
		}
}
