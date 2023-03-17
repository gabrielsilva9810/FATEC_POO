package exercicio07;

public class Caixa {

	double saldo;
	double valorProduto;
	double total;
	
	//FUNÇÃO PARA VENDA DO PRODUTO
	public void vendendoProduto(double saldo, double valorProduto) {
		
		//SALDO + VALOR DO PRODUTO
		total = saldo + valorProduto;
		
		//EXIBINDO VALORES NO CONSOLE
		System.out.println("Salario: " + saldo + "\n"
		+ "Valor da Venda: " + valorProduto 
		+ "\n" + "Total: " + total);
	}
}