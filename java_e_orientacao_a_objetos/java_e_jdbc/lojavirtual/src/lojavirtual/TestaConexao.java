package lojavirtual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestaConexao {
	
	public static void main(String[] args) throws SQLException  {
	
		Connection con =  ConnectionFactory.recuperaConexao();
		
		System.out.println("Fechando conexão...");
		con.close();
	
	}
}
