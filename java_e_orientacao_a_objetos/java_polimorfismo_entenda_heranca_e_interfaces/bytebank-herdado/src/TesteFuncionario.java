import bytebank.Funcionario;

public class TesteFuncionario{

  public static void main(String[] args){
   
    Funcionario funcionario = new Funcionario();

    funcionario.setNome("Emerson Lopes");
    funcionario.setSalario(3000.50);
    funcionario.setCpf("12345678-9");

    System.out.println(funcionario.getNome());
    System.out.println(funcionario.getSalario());
    System.out.println(funcionario.getBonificacao());
    System.out.println(funcionario.getCpf());

    System.out.println(funcionario instanceof Funcionario);
    
  }

}
