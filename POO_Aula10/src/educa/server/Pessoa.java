package educa.server;

public class Pessoa implements Assinante {
	private String nome;
	
	Pessoa(String nome){
		this.nome = nome;
	}
	
	public void receberPublicacao(String p) {
		System.out.println("Pessoa " + this.nome + " está lendo este arquivo " + p);
	}
	

}
