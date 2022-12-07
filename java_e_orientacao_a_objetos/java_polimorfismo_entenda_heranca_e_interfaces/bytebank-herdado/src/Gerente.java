package bytebank;

public class Gerente extends Funcionario{

  private String senha= "0000";

  public setSenha(String senha){
    this.senha = senha;
  }

  public boolean autenticaSenha(String senha){

    if(this.senha == senha){
      return true;
    }
    
    return false;
  }
}
