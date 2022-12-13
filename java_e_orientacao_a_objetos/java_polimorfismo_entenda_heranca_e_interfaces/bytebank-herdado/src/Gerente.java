package bytebank;

public class Gerente extends Funcionario implements Autenticavel{

  private Autenticador autenticador;

  public Gerente(){
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

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

}
