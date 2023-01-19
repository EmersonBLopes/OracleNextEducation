package lojavirtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {

	public static void main(String[] args) {
		Connection con = null;
		
		try {
			
			con = ConnectionFactory.recuperaConexao();	
			
			PreparedStatement stm = con.prepareStatement("DELETE FROM produtos WHERE ID = ?");
			stm.setInt(1, 7);
			
			stm.execute();
			System.out.println(stm.getUpdateCount());
			
		}catch(SQLException ex) {
			System.out.println("Ops... algo deu errado.");
		}
		

	}

}
