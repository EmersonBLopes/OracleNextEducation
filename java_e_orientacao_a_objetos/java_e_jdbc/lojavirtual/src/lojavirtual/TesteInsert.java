package lojavirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsert {

	public static void main(String[] args){
		
		Connection con = null;
		Statement stm = null;
		
		try {
			con =  ConnectionFactory.recuperaConexao();
			stm = con.createStatement();
			
			stm.executeUpdate("INSERT INTO produtos(nome_produto,descricao)VALUES('iPhone X' ,'iPhone X seminovo, chama que da bom!')",Statement.RETURN_GENERATED_KEYS);
			 
		}catch(SQLException ex){
			System.out.println("A conexão com o banco de dados falhou. "+ex.getMessage());
		}
		
		
	}

}
