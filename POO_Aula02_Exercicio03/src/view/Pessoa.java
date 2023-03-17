package view;

public class Pessoa {
	int id;
	String nome;
	
	//CONSTRUTOR
	public Pessoa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//GET E SETTER
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
