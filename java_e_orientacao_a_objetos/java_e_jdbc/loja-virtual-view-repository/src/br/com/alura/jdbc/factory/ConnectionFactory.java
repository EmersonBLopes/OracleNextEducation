package br.com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory{

	public Connection recuperarConexao(){
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?user=root&password=123456");	
		}catch(SQLException ex) {
			throw new RuntimeException(ex);
		}
		
	}
}
	