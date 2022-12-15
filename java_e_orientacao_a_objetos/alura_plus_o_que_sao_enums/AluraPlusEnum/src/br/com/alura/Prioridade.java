package br.com.alura;

public enum Prioridade {

	MIN(10),NORMAL(20),MAX(30);
	
	private int valor;
	
	Prioridade(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
