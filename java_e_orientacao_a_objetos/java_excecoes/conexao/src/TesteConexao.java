import bytebank.conexao.Conexao;

public class TesteConexao{

  public static void main(String[] args){

    try(Conexao con = new Conexao()){

      con.leDados();

    }catch(IllegalStateException ex){

      System.out.println("Deu ruim com a conexão.");

    }

    /*Conexao con = null;

    try{

      con = new Conexao();
      con.leDados();

    }catch(IllegalStateException ex){

      System.out.println("Deu ruim com a conexão.");

    }finally{

      if(con != null){
        con.close();
      }

    }*/
  }
}

