package exe09;

public class Main {

	public static void main(String[] args) {
		
		Aeroporto ap = new Aeroporto();
		ap.liberar(12, "Guarulhos" , "Rio de Janeiro", "Guarulhos");
		
		Pessoa pessoa = new Pessoa();
		pessoa.validarTicket(90, "Gabriel");
		
		Piloto piloto = new Piloto(12345, "Felipe");
		
		Passageiro passageiro = new Passageiro(54321, "Fernando");

		Aeronave aeronave = new Aeronave();
		aeronave.decolar(10, "Boing 456");
		

	}

}
