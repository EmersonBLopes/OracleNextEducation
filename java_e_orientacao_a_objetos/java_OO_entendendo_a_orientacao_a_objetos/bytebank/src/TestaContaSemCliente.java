import bytebank.Conta;
import bytebank.Cliente;

public class TestaContaSemCliente{

  public static void main(String[] args){
  
    Conta contaDaMarcela = new Conta();

    contaDaMarcela.titular = new Cliente();
    contaDaMarcela.titular.nome = "Marcela";

    System.out.println(contaDaMarcela.titular.nome);

  }

}
