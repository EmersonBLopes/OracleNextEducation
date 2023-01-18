package lojavirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class TestaInsecaoComParametro {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement stm = null;
		
		try {
			con =  ConnectionFactory.recuperaConexao();
			stm = con.prepareStatement("INSERT INTO produtos(nome_produto,descricao)VALUES(?,?)");
			
			stm.setString(1, "Televisão Oled 4k LG");
			stm.setString(2, "Perfeita para assistir aquele domigão do faustop");
			
			stm.execute();
			
			//stm.executeUpdate("INSERT INTO produtos(nome_produto,descricao)VALUES('iPhone X' ,'iPhone X seminovo, chama que da bom!')");
			 
		}catch(SQLException ex){
			System.out.println("A conexão com o banco de dados falhou. "+ex.getMessage());
		}
		
		

	}

}
