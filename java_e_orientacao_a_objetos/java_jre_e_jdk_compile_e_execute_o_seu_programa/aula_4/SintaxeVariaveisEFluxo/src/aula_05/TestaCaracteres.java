package aula_05;

public class TestaCaracteres {
	
	public static void main(String[] args) {
		char letra = 'a';
		
		for(byte i =0 ;i<=26;i++) {
			letra = (char)(letra+i);
			System.out.println(letra);
		}
		
		String frase = "Oi, eu sou uma string!";
		System.out.println(frase);
		
	}
}
