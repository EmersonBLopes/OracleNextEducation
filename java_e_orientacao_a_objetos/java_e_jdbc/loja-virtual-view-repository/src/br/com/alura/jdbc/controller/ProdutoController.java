package br.com.alura.jdbc.controller;

import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoController {

	private ProdutoDAO produtoDAO;
	
	public ProdutoController() {
		
		ConnectionFactory con = new ConnectionFactory();
		this.produtoDAO = new ProdutoDAO(con.recuperarConexao());
	}
	public void deletar(Integer id) {
		produtoDAO.deletar(id);
	}

	public void salvar(Produto produto) {
		produtoDAO.salvarComCategoria(produto);
	}

	public List<Produto> listar() {

		return produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		System.out.println("Alterando produto");
	}
}
