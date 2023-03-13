package view;

import model.Funcionario;


public class TestaFuncionario {
		
		public static void main(String[] args) {
			
		//RecursosHumanos rh = new RecursosHumanos();
		Funcionario mario = new Funcionario();
		Funcionario junior = new Funcionario();
		Funcionario osvaldo = new Funcionario();
		
		//GESTOR MARIO
		mario.salario = 9900.0;
		mario.receberPagamento(new double[] {400.0, 700.0, 200.0, 450.0});
		
		//ESTAGIARIO JUNIOR
		junior.salario = 2300.0;
		junior.receberPagamento(new double[] {400.0, 300.0, 0, 0});
		
		osvaldo.salario = 5000.0;
		osvaldo.receberPagamento(new double[] {0, 0.0, 0, 0});
}
}
