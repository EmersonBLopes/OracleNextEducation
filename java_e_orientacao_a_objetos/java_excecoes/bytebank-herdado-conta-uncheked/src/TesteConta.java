import bytebank.ContaCorrente;
import bytebank.ContaPoupanca;

public class TesteConta{

  public static void main(String[] args){

    ContaCorrente cc = new ContaCorrente(111,111);
    cc.depositar(100.0);

    cc.sacar(100);

    ContaPoupanca cp = new ContaPoupanca(222,222);
    cp.depositar(250.0);

    //cc.transfere(10,cp);

    System.out.println("CC:" +cc.getSaldo());
    System.out.println("CP:" +cp.getSaldo());

  }

}
