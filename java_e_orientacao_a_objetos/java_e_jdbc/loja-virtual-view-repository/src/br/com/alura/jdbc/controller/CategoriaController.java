package br.com.alura.jdbc.controller;

import java.util.List;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Categoria;

public class CategoriaController {
	
	private CategoriaDAO categoriaDAO;
	
	public CategoriaController(){
		
		ConnectionFactory con = new ConnectionFactory();
		categoriaDAO = new CategoriaDAO(con.recuperarConexao());
	}

	public List<Categoria> listar() {
		
		return this.categoriaDAO.listar();
	}
}
