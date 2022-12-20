package br.com.alura.bytebank;

import bytebank.Gerente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g = new Gerente();
		
		g.setNome("Emerson");
		g.setSalario(6.000);
		
		System.out.println(g.getNome() + g.getSalario());
	}

}
