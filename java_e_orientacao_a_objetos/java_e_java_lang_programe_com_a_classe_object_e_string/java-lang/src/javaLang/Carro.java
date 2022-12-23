package javaLang;

public class Carro {
	
	private String cor,modelo;
	private int numeroDaPlaca, documento;
	private static int numeroDeCarros = 0;
	
	public Carro(String cor, String modelo) {
		
		System.out.println("Construindo o carro...");
		this.cor = cor;
		this.modelo = modelo;
		Carro.numeroDeCarros++;
	}
	
	public static int getNumeroDeCarros() {
		return Carro.numeroDeCarros;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroDaPlaca() {
		return numeroDaPlaca;
	}

	public void setNumeroDaPlaca(int numeroDaPlaca) {
		this.numeroDaPlaca = numeroDaPlaca;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	
}
