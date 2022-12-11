package bytebank;

/*
métodos abstratos não contém corpo por conta disso o corpo do método dever ser especificado pela classe filha.

 métodos abstratos só podem ser definidos dentro de classes abstratas.

 a unica maneira de não ser obrigatório a implementação do corpo do método abstrato em uma classe filha é se a classe também for abstrata.
 */

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
