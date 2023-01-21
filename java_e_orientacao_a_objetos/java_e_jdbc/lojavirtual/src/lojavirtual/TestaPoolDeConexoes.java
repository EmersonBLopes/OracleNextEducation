package lojavirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestaPoolDeConexoes {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<Connection> con = new ArrayList <Connection>();
		
		for(int i=1; i<=20; i++) {
			con.add(ConnectionFactory.recuperaConexao());
			System.out.println("recuperando conexão de número:"+i);
		}
		
		for(int i=0; i<=19; i++) {
			System.out.println(con.get(i));
		}
	}

}
