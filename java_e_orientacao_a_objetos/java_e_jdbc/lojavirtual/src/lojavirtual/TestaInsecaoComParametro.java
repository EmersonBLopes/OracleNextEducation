package lojavirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class TestaInsecaoComParametro {	
	
	private static void inserirDados(String nomeProduto, String descricaoProduto, PreparedStatement stm) throws SQLException{
		
		stm.setString(1, nomeProduto);
		stm.setString(2, descricaoProduto);
		
		stm.execute();
	}


	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement stm = null;
		
		try {
			con =  ConnectionFactory.recuperaConexao();
			stm = con.prepareStatement("INSERT INTO produtos(nome_produto,descricao)VALUES(?,?)");
			
			TestaInsecaoComParametro.inserirDados("","",stm);
			
			//stm.executeUpdate("INSERT INTO produtos(nome_produto,descricao)VALUES('iPhone X' ,'iPhone X seminovo, chama que da bom!')");
			 
		}catch(SQLException ex){
			System.out.println("A conexão com o banco de dados falhou. "+ex.getMessage());
		}
		
		

	}

}
