import bytebank.Gerente;

public class TesteGerente{

  public static void main(String[] args){

    Gerente g1 = new Gerente();

    g1.setNome("Emerson Lopes");
    g1.setCpf("12345678-9");
    g1.setSalario(5000.00);

    System.out.println(g1.getNome());
    System.out.println(g1.getCpf());
    System.out.println(g1.getSalario());

    System.out.println(g1.autenticaSenha("0000"));

    System.out.println(g1.getBonificacao());
  }
}
