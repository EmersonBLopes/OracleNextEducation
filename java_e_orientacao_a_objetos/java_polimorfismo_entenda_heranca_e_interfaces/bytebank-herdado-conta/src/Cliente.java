package bytebank;

public class Cliente{

    private String nome,cpf,profissao;

    public void setProfissao(String profissao){
      this.profissao = profissao;
    }

    public String getProfisao(){
      return this.profissao;
    }

    public void setCpf(String cpf){
      this.cpf = cpf;
    }

    public String getCpf(){
      return this.cpf;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public String getNome(){
      return this.nome;
    }

}
