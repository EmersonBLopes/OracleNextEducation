package br.com.alura;

public class Aluno {

	String nome;
	int matricula;
	
	public Aluno(String nome, int matricula) {
		
		if(nome == null) throw new NullPointerException("Não pode ser nome não pode ser nulo");
		this.nome = nome;
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		
		String mensagem;	
		mensagem = String.format("Aluno: %s Matricula: %d\n",this.nome,this.matricula);
		
		return mensagem;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.matricula; 
	}
	
	@Override
	public boolean equals(Object obj) {
		
        if (this == obj) return true;
        if (obj == null) return false;
        
        if (getClass() != obj.getClass()) return false;
        
        Aluno other = (Aluno) obj;
        if (nome == null) {
        	
            if (other.nome != null) return false;
            
        } else if (!nome.equals(other.nome)) return false;
        
        if (matricula != other.matricula) return false;
        
        return true;
	}	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.nome.hashCode();
	}

}
