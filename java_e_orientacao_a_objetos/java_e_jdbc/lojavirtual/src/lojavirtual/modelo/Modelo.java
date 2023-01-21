package lojavirtual.modelo;

public class Modelo {
	
	private int ID;
	private String nome,descricao;
	
	public Modelo(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d \nNome: %s\nDescricao:%s",this.ID,this.nome,this.descricao);
	}
	
	
}
