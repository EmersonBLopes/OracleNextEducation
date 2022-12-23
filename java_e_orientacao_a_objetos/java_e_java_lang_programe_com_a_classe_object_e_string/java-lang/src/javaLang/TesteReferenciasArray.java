package javaLang;

public class TesteReferenciasArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro[] carros = new Carro[5];
		
		for(int i = 0; i<carros.length;i++) {
			System.out.println(carros[i]);
		}
		
		for(int i = 0; i<carros.length;i++) {
			carros[i] = new Carro("Azul","f1f1");
		}
		
		for(int i = 0; i<carros.length;i++) {
			System.out.println(carros[i]);
		}
	}

}
