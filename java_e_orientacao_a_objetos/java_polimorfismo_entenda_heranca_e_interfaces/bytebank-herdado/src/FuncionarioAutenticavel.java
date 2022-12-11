package bytebank;

public abstract class FuncionarioAutenticavel extends Funcionario {

	private String senha;
  
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean autentica(String senha) {
		if(this.senha == senha){
			return true;
		} else {
			return false;
		}
	}

}
