package SistemaDeAlunos;

import java.sql.Date;

public class Aluno {

	private long id;
	private Date nascimento;
	private String ra;
	private String nome;
	
	//CONSTRUTOR
	public Aluno(long id, Date nascimento, String ra, String nome) {

	this.id = id;
	this.nascimento = nascimento;
	this.ra = ra;
	this.nome = nome;
}

	public Aluno(String nascimento2, String ra2, String nome2) {
		// TODO Auto-generated constructor stub
	}

	//GETTER E SETTER
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date dataNascimento) {
		this.nascimento = dataNascimento;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//TO STRING COM OVERIDE - 
	@Override
	public String toString() {
		return "ID: " + id + "\nNome: " + nome + "\nRA: " + ra + "\nData de Nascimento: " + nascimento;
	}
	
	
}
