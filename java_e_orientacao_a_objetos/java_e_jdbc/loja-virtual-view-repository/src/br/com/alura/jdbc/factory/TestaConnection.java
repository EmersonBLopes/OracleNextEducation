package br.com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		ConnectionFactory conFac = new ConnectionFactory();
			
			try(Connection con = conFac.recuperarConexao()){
				PreparedStatement ps = con.prepareStatement("SELECT * FROM produtos");
				
				ps.execute();
			try(ResultSet rs = ps.getResultSet()){
					while(rs.next()) {
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));
						System.out.println(rs.getString(3));
					System.out.println(rs.getInt(4));
					}
			}
		}

	}

}
