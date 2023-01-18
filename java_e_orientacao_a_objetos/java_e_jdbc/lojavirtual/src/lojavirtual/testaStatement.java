package lojavirtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class testaStatement {
	
	public static void main(String[] args) throws SQLException  {
	
		Connection con = ConnectionFactory.recuperaConexao();
		
		
		System.out.println("Fechando conexão...");
		
		PreparedStatement state = con.prepareStatement("SELECT * FROM produtos");
		
		if(state.execute()) {
			ResultSet resultado = state.getResultSet();
			
			while(resultado.next()) {
				System.out.println(resultado.getInt("ID"));
				System.out.println(resultado.getString("nome_produto"));
				System.out.println(resultado.getString("descricao"));
			}
		}
			
		con.close();
	
	}
}
