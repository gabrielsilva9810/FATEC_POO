package exercicio08;

public class Main2 {

	public static void main(String[] args) {
		Caixa2 gabriel = new Caixa2();
		gabriel.venda(1000, 1000, 8000);		//SALDO + VARIOS PRODUTOS
		
		System.out.println("==========================================");
		
		Caixa2 gabriela = new Caixa2();
		gabriela.venda(1000, 1000, 900); 		//SALDO + VARIOS PRODUTOS
		
		System.out.println("==========================================");
	}
}
