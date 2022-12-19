package bytebank.exceptions;

public class SaldoInsuficienteException extends RuntimeException{

  public SaldoInsuficienteException(String msg){
    super(msg);
  }

}
