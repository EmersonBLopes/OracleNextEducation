package bytebank;

public class SistemaInterno{

  private static String senha = "0000";

  public static void autentica(FuncionarioAutenticavel f){

    boolean autenticou = f.autentica(senha);

    if(autenticou){
      System.out.println("Pode entrar no sistema.");
    }else{
      System.out.println("Erro de autenticação, não pode entrar no sistema.");
    }

  }

}
