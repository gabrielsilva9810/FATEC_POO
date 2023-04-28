package exe09;

public class Aeroporto {

	int codigo;
	String nome;
	String origem;
	String destino;

	public void liberar (int codigo, String nome, String origem, String destino) {
		
		System.out.println("Bem vindos ao Aeroporto de: " + nome);
		System.out.println("Voo para: " + origem);
		System.out.println("Destino:  " + destino);
	}

}
