package fr.eni.ecole.encheres.dal;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnexionDAO {

	public static Connection connectionBDD() throws SQLException {
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
