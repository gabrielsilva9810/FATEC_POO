package LivroFX;

import java.time.LocalDate;

public class Livro {
	
	//ATRIBUTOS
	private String titulo;
	private int paginas;
	private LocalDate dataPublicado;
	
	//GETTERS E SETTERS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public LocalDate getDataPublicado() {
		return dataPublicado;
	}
	public void setDataPublicado(LocalDate dataPublicado) {
		this.dataPublicado = dataPublicado;
	}

	//CONSTRUTOR
	public Livro() {
		
	}
}
