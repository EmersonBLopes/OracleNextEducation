package bytebank;

public class Gerente extends Funcionario implements Autenticavel{

  private String senha;

  public void setSenha(String senha){
    this.senha = senha;
  }

  public boolean autentica(String senha){

    if(senha == this.senha){
      return true;
    }

    return false;
  }

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

}
