package model;

public class Funcionario {
	
	public double salario;

	public void receberPagamento(double [] adicionais) {
		double total = this.salario;
		
		for(int i = 0; i < adicionais.length; i++) {
			total += adicionais[i];
		}
		System.out.println("OBA! Recebi meu salário: " + total);
	}
}
