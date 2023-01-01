package bytebank;

public class Autenticador{

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

}
