package bytebank;

public class CalculadorDeImposto{

  private double totalImposto;

  public void registra(Tributavel t){
    double valor = t.getTribatacao();
    this.totalImposto += valor;
  }

  public double getTotalImposto(){
    return totalImposto;
  }

}
