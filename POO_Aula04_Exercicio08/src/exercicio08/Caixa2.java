package exercicio08;

public class Caixa2 {

	double saldo;
	double valorProduto;
	double total;
	
	public void venda(double valorProduto) {
		this.saldo = this.saldo + valorProduto;
		System.out.println("Valor: " + this.saldo);
	}
	
	//FUNÇÃO PARA VENDA DO PRODUTO
	public void venda(double saldo, double ... valorProduto) {			//VARAGS
		
		//VARIOS PRODUTOS VENDIDOS
		for(double cada: valorProduto) {
			cada = cada + this.saldo;						//CADA PRODUTO VENDIDO VAI SOMAR COM O SALDO
			
			total = saldo + cada;							//AQUI EXIBE O TOTAL
			
			//EXIBINDO VALORES NO CONSOLE
			System.out.println("Saldo: " + cada);
		}
			//IMPRIME TOTAL NO CONSOLE
			System.out.println("Total: " + total);
	}
}
