import bytebank.Conta;

public class TestaValores{

  public static void main(String[] args){

    Conta conta = new Conta(001,1337);
    Conta conta2 = new Conta(001,1338);
    Conta conta3 = new Conta(001,1339);

    System.out.println("O total de contas e: "+Conta.getTotalDeContas());

  }

}

