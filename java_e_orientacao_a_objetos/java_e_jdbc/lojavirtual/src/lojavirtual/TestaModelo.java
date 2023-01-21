package lojavirtual;

import lojavirtual.modelo.Modelo;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestaModelo {

	public static void main(String[] args) {
		
		Modelo fogao = new Modelo("Fogao Eletrolux","Fogao Eletrolux 4 bocas");
		
		try(Connection con = ConnectionFactory.recuperaConexao() ){
			
			try(PreparedStatement stm = con.prepareStatement("INSERT INTO produtos(nome_produto,descricao)VALUES(?,?)",Statement.RETURN_GENERATED_KEYS)){
				
				stm.setString(1, fogao.getNome());
				stm.setString(2, fogao.getDescricao());
				stm.execute();
				
				try(ResultSet rs = stm.getGeneratedKeys()){
					while(rs.next()) {
						fogao.setID(rs.getInt(1));
					}
				}catch(SQLException ex) {
					System.out.println("Erro no Result Set");
				}
			}catch(Exception ex) {
				System.out.println("Erro no prepareted Statement: "+ex.getMessage());
			}
		}catch(SQLException ex) {
			System.out.println("Erro na conexao");
		}

		System.out.println(fogao);
	}

}
