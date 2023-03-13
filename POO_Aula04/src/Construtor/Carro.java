package Construtor;

public class Carro {
	
	//ATRIBUTOS
	String cor; 	//x
	String modelo;
	String placa;

	//CONSTRUTOR - //x = a (cor daqui dbaixo)
	public Carro(String cor, String modelo, String placa) {
		System.out.println("Construindo o carro...");
		this.cor = cor; 		//x = a
		this.modelo = modelo;
		this.placa = placa;
	}
	
	//MAIN
	public static void main(String[] args) {
		Carro c1 = new Carro ("Roxo", "Corsa" , "AAA1010");
		Carro c2 = new Carro("Preto", "Onix", "EUJ9999");
		c1.imprimirDados();
		c2.imprimirDados();
	}
	
	//IMPRIMINDO OS DADOS
	void imprimirDados() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Placa: " + this.placa);
	}

}
