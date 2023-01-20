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


	public static void main(String[] args) throws SQLException {
		
		Connection con =  ConnectionFactory.recuperaConexao();
		
		
		try(PreparedStatement stm = con.prepareStatement("INSERT INTO produtos(nome_produto,descricao)VALUES(?,?)")) {
			
			con.setAutoCommit(false);
			
			TestaInsecaoComParametro.inserirDados("Playstation 4 1TB","PS4 usado",stm);
			TestaInsecaoComParametro.inserirDados("Xbox One 1TB","Xbox One semi novo",stm);
			
			con.commit();
			//stm.executeUpdate("INSERT INTO produtos(nome_produto,descricao)VALUES('iPhone X' ,'iPhone X seminovo, chama que da bom!')");
			 
		}catch(SQLException ex){
			
			ex.printStackTrace();
			System.out.println("A conexão com o banco de dados falhou. "+ex.getMessage());
			System.out.println("Executando o rollback...");
			con.rollback();
		}finally {
			con.close();
		}
		
		

	}

}
