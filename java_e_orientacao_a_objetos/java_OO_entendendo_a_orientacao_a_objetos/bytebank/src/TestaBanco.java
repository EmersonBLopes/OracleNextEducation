import bytebank.Conta;
import bytebank.Cliente;

public class TestaBanco{

  public static void main(String args[]){
  
    Cliente Emerson = new Cliente();
    Conta contaEmerson = new Conta();

    contaEmerson.titular = Emerson;

    System.out.println(Emerson);
    System.out.println(contaEmerson.titular);
    contaEmerson.depositar(100);
    System.out.println(contaEmerson.getSaldo());
  }
}
