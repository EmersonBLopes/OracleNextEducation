package bytebank;

public class Administrador extends Funcionario implements Autenticavel{

  private Autenticador autenticador;

  public Administrador(){
    this.autenticador = new Autenticador();
  }

  @Override
  public void setSenha(String senha){
    this.autenticador.setSenha(senha);
  }

  @Override
  public boolean autentica(String senha){
    return this.autenticador.autentica(senha);
  }

  @Override
  public double getBonificacao(){
    return 50;
  }


}
