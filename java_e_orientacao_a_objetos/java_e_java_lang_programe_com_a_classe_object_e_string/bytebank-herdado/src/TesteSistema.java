import bytebank.Gerente;
import bytebank.Administrador;
import bytebank.SistemaInterno;
import bytebank.Cliente;

public class TesteSistema{

  public static void main(String[] args){


    Administrador a = new Administrador();
    Gerente g = new Gerente();
    Cliente c = new Cliente();

    g.setSenha("0000");
    a.setSenha("3333");
    c.setSenha("4444");

    SistemaInterno.autentica(g);
    SistemaInterno.autentica(a);
    SistemaInterno.autentica(c);

  }

}
