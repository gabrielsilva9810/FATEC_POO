
package educa.server;

import java.util.ArrayList;
import java.util.List;

public class Jornal implements Publicador {
	private String nome;
	
	//CONSTRUTOR
	public Jornal(String nome) { 
		this.nome = nome;
	}
	
	private List<Assinante> lista = new ArrayList<>();
	
	//METODOS
	public void adicionar(Assinante a) { 
		lista.add(a);
	}
	
	public void remover(Assinante a) {
		lista.remove(a);
	}
	
	public void publicar(String p) { 
		for (Assinante a : lista) {
			a.receberPublicacao(p);
		}
	}
	
}
