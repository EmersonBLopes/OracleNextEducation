package bytebank;

public class Gerente extends Funcionario{

  private String senha= "0000";

  public void setSenha(String senha){
    this.senha = senha;
  }

  public boolean autenticaSenha(String senha){

    if(this.senha == senha){
      return true;
    }
    
    return false;
  }

    public double getBonificacao(){
      return super.getBonificacao() + super.getSalario();
    }
}
