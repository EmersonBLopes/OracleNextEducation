package javaLang;

public class TesteReferenciasArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] veiculos = new Object[5];
		
		veiculos[0] = new Carro("branco","fff");
		veiculos[1] = new Moto("vermelha","f00");
		System.out.println(veiculos.length);
		
	}

}
