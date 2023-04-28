package controller;

public class Empresas {

	public static void main(String[] args) {
		RecursosHumanos rh = new RHDemonstrativo();
		
		Funcionario gabriel = new Funcionario();
		
		rh.fazPagamento(gabriel, 2800, 350, 900);

	}

}
