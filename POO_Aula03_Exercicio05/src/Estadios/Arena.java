package Estadios;

public class Arena {
	
	//CARACTERISTICAS
	public String nome;
	public int capacidade;
	public int anoInauguracao;
	public String gramado;
	public String proprietario;
	
	//COMPORTAMENTOS
	public void AbrirPortao() {
		System.out.println("Olá! Bem vindo a " + nome + " nós temos o prazer em te receber. Aqui vão algumas curiosidades: \n"
				+ "A capacidade do estádio é de " + capacidade + " pessoas. \n"
						+ "O ano de sua inauguração foi em " + anoInauguracao + ".\n"
								+ "O nosso gramado é de " + gramado + ".\n"
										+ "O proprietário do estádio é o " + proprietario + ". \n"
												+ "Aproveite o jogo!");
	}
	
	public void FecharPortao() {
		System.out.println("O portão da " + nome + " está fechado! Até a próxima partida!");
	}
	
	public void AnunciarGol() {
		System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLLLLLL!!!!!!!! É DOOOOOOOOO: " + proprietario);
	}
}
