package lojavirtual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestaConexao {
	
	public static void main(String[] args) throws SQLException  {
	
		Connection con =  DriverManager.getConnection
				("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "123456");
		
		System.out.println("Fechando conexão...");
		con.close();
	
	}
}
