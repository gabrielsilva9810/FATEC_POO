package exe09;

public class Aeronave extends Aeroporto {

	int codigo;
	String modelo;
	
	public void decolar (int codigo, String modelo) {
		System.out.println("Atenção...");
		System.out.println("Voo liberado! Boa viagem!");
	}

}
