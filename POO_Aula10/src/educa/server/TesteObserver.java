package educa.server;

public class TesteObserver {

	public static void main(String[] args) {
		

		Pessoa p1 = new Pessoa("Gabriel");
		Pessoa p2 = new Pessoa("Gabriele");
		
		Jornal j1 = new Jornal("Estadao");
		Jornal j2 = new Jornal("Clarim Diario");
		
		j1.adicionar(p1);
		j2.adicionar(p2);
		
		j1.publicar("Teste ESTADAO");
		j2.publicar("Teste CLARIM DIARIO");
		

	}

}
