package bytebank;

/*contrato Autenticavel
quem assinar o contrato, precisa implementar os métodos abstratos*/

public abstract interface Autenticavel{

	public abstract void setSenha(String senha);

	public abstract boolean autentica(String senha);

}

