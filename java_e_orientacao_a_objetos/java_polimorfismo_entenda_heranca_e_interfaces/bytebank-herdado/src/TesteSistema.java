import bytebank.Gerente;
import bytebank.Administrador;
import bytebank.SistemaInterno;

public class TesteSistema{

  public static void main(String[] args){


    Administrador a = new Administrador();
    Gerente g = new Gerente();

    g.setSenha("0000");
    a.setSenha("3333");

    SistemaInterno.autentica(g);
    SistemaInterno.autentica(a);

  }

}
