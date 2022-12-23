package javaLang;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Quantidade de carros fabricados: "+Carro.getNumeroDeCarros());
		Carro hondaCivic = new Carro("Preto","123456");
		Carro hb20 = new Carro("Cromado","4321");
		
		System.out.println("O modelo do carro é: "+hondaCivic);
		System.out.println(hondaCivic.hashCode());
		
		System.out.println("Quantidade de carros fabricados: "+Carro.getNumeroDeCarros());

	}

}
