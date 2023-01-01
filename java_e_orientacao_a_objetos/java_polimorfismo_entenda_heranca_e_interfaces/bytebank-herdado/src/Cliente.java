package bytebank;

public class Cliente implements Autenticavel{

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
