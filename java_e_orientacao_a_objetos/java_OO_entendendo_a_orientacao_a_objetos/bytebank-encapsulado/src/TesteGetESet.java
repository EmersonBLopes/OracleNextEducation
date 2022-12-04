import bytebank.Conta;
import bytebank.Cliente;

public class TesteGetESet{

  public static void main(String[] args){

   Conta conta = new Conta();
   conta.setNumero(1337);

   Cliente Emerson = new Cliente();

   conta.setTitular(Emerson);
   conta.getTitular().setNome("Emerson");
   System.out.println(conta.getTitular().getNome());
  }

}

