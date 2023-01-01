import bytebank.Conta;

public class TesteSacaNegativo{

  public static void main(String[] args){
   
    Conta contaDeTeste = new Conta();
    
    contaDeTeste.depositar(100);
    System.out.println(contaDeTeste.getSaldo());

    /*treicho proibido
    contaDeTeste.saldo = contaDeTeste.saldo - 101;
    */
  }
}
