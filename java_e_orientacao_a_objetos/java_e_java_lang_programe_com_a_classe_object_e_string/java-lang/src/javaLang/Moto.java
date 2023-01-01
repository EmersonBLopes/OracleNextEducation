package javaLang;

public class Moto {
	
	private String cor,modelo;
	private int numeroDaPlaca, documento;
	private static int numeroDeMotos = 0;
	
	public Moto(String cor, String modelo) {
		
		System.out.println("Construindo o Moto...");
		this.cor = cor;
		this.modelo = modelo;
		Moto.numeroDeMotos++;
	}
	
	public static int getNumeroDeMotos() {
		return Moto.numeroDeMotos;
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
