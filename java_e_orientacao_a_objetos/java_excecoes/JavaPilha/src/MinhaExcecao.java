
public class MinhaExcecao extends RuntimeException {
	
	MinhaExcecao(String mensagem){
		super(mensagem);
	}
	
	MinhaExcecao(){
		super();
	}
}
