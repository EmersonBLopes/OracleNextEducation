package lojavirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) {
		Connection con = null;
		
		try {
			
			con = ConnectionFactory.recuperaConexao();	
			Statement stm = con.createStatement();
			
			stm.executeUpdate("DELETE FROM produtos WHERE ID > 3");
			System.out.println(stm.getUpdateCount());
			
		}catch(SQLException ex) {
			System.out.println("Ops... algo deu errado.");
		}
		

	}

}
