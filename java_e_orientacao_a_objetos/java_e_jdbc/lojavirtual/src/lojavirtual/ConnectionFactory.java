package lojavirtual;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public abstract class ConnectionFactory{
	
	private static String url = "jdbc:mysql://localhost:3306/loja_virtual";
	private static String password = "123456";
	private static String user = "root";

	public static Connection recuperaConexao() throws SQLException{
		
		try (BasicDataSource bds = new BasicDataSource()) {
			bds.setUrl(url);
			bds.setUsername(user);
			bds.setPassword(password);
			bds.setMaxTotal(15);
			
			return bds.getConnection();
		}
	}
}
