package bytebank;

public class ContaCorrente extends Conta implements Tributavel{

  public ContaCorrente(int agencia, int numero){
    super(agencia,numero);
  }

  @Override

  public double getTribatacao(){
    return super.getSaldo() * 0.01;
  }

  @Override
  public void sacar(double valor){

    super.sacar(valor+0.2);
    return;

    }

}
