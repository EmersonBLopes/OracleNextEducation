package br.com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.jdbc.modelo.Categoria;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoDAO {

	private Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}

	public void salvar(Produto produto){
		String sql = "INSERT INTO produtos (nome_produto, descricao) VALUES (?, ?)";

		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());

			pstm.execute();

			try (ResultSet rst = pstm.getGeneratedKeys()) {
				while (rst.next()) {
					produto.setId(rst.getInt(1));
				}
			}
		}catch(SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	public void salvarComCategoria(Produto produto){
		String sql = "INSERT INTO produtos (nome_produto, descricao, categoriaID) VALUES (?, ?, ?)";

		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());
			pstm.setInt(3, produto.getCategoriaId());

			pstm.execute();

			try (ResultSet rst = pstm.getGeneratedKeys()) {
				while (rst.next()) {
					produto.setId(rst.getInt(1));
				}
			}
		}catch(SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	public List<Produto> listar(){
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			String sql = "SELECT ID, nome_produto, descricao FROM produtos";

			try (PreparedStatement pstm = connection.prepareStatement(sql)) {
				pstm.execute();

				trasformarResultSetEmProduto(produtos, pstm);
			}
			return produtos;
		}catch(SQLException ex) {
			throw new RuntimeException(ex);
		}
		
	}

	public List<Produto> buscar(Categoria ct) throws SQLException {
		List<Produto> produtos = new ArrayList<Produto>();
		String sql = "SELECT ID, nome_produto, descricao FROM produtos WHERE categoriaID = ?";

		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.setInt(1, ct.getId());
			pstm.execute();

			trasformarResultSetEmProduto(produtos, pstm);
		}
		return produtos;
	}

	public void deletar(Integer id){
		try (PreparedStatement stm = connection.prepareStatement("DELETE FROM produtos WHERE ID = ?")) {
			stm.setInt(1, id);
			stm.execute();
		}catch(SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	public void alterar(String nome, String descricao, Integer id) throws SQLException {
		try (PreparedStatement stm = connection
				.prepareStatement("UPDATE produtos P SET P.nome_produto = ?, P.descricao = ? WHERE ID = ?")) {
			stm.setString(1, nome);
			stm.setString(2, descricao);
			stm.setInt(3, id);
			stm.execute();
		}
	}

	private void trasformarResultSetEmProduto(List<Produto> produtos, PreparedStatement pstm) throws SQLException {
		try (ResultSet rst = pstm.getResultSet()) {
			while (rst.next()) {
				Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3));

				produtos.add(produto);
			}
		}
	}
}
