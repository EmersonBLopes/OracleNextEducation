package bytebank;

/**
 *
 *@author Emerson Basilio 
 *@version 0.1.0
 *
 * classe que representa um cliente dentro do sistema do bytebank.
 *
 */

public class Cliente implements Autenticavel{

  private String senha;

  public void setSenha(String senha){
    this.senha = senha;
  }

  /**
   * Autentica a passada pelo cliente caso conhecida com a senha do objeto instancia retorna true se não false.
   *
   * @param senha senha passada pelo usuário por passagem de pararametro por valor.
   * 
   **/

  public boolean autentica(String senha){

    if(senha == this.senha){
      return true;
    }

    return false;
  }
}
