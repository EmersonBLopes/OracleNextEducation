import bytebank.ContaCorrente;
import bytebank.ContaPoupanca;
import bytebank.exceptions.SaldoInsuficienteException;

public class TesteConta{

  public static void main(String[] args){

    ContaCorrente cc = new ContaCorrente(111,111);
    cc.depositar(100.0);

    try{
      cc.sacar(100);
    }catch(Exception ex){
      System.out.println("Ops!");
    }

    ContaPoupanca cp = new ContaPoupanca(222,222);
    cp.depositar(250.0);

    //cc.transfere(10,cp);

    System.out.println("CC:" +cc.getSaldo());
    System.out.println("CP:" +cp.getSaldo());

  }

}
