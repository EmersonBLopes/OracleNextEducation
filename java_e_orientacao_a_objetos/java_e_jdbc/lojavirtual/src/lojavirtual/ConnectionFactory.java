package lojavirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionFactory{
	
	private static String password = "123456";
	private static String user = "root";

	public static Connection recuperaConexao() throws SQLException{
		
		return DriverManager.getConnection
				("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", ConnectionFactory.user, ConnectionFactory.password);
	}
}
