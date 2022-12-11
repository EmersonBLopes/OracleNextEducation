package bytebank;

public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

}
