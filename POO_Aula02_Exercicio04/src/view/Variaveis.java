package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Variaveis {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO - Crie e inicie variáveis para guardar as informações abaixo usando os tipos de variáveis 
		 * de acordo com a forma que achar correto.
		 * 
		 * Nome da empresa com no máximo 25 caracteres.
		 * Total de salários pagos no mês, em uma grande empresa 
		 * Quantidade de dias de faturamento, normalmente esta informação será fixa e nunca mais alterada 
		 * Todas as notas de um aluno de uma disciplina 
		 * Todos os dados de um carro (placa, chassi, modelo, ano, cor, nome do dono) que foi multado. 
		 * O número de ouro da matemática valor 1.61803...
		 * Os nomes dos alunos de uma turma com 10 alunos 
		 * Quantidade de pares de tênis de um armário 
		 * 
		 */
	//===========================================================================================//	
		//Nome da empresa com no máximo 25 caracteres.
		
		String nomeEmpresa = "Linx Stone";
		System.out.println("Nome da Empresa: " + nomeEmpresa);
	//===========================================================================================//	
		//Total de salários pagos no mês, em uma grande empresa
		
		double salario1 = 2000;
		double salario2 = 1000;
		double totalSalario = salario1 + salario2;
		System.out.println("Total de Salário: " + totalSalario);
	//===========================================================================================//		
		//Quantidade de dias de faturamento, normalmente esta informação será fixa e nunca mais alterada
		
		int mesImpar = 1;
		int mesPar = 2;
		int mesFevereiro = 3;
		int mesEscolhido;
		
		Scanner l = new Scanner(System.in);
		
		System.out.printf("Digite o mês escolhido: 1 - Impar | 2 - Par | 3 - Fevereiro");
		mesEscolhido = l.nextInt();
		
		//Explicação: Geralmente, dias de faturamento são em média 23 a 26 dias por mês.
		if (mesEscolhido == mesImpar) {
			int impar = 31;
			int faturamentoImpar = 0;
			
			faturamentoImpar = (impar - 7);
			System.out.println("Faturamento Mês Impar: " + faturamentoImpar);
		}
		
		if (mesEscolhido == mesPar) {
			int par = 30;
			int faturamentoPar = 0;
			
			faturamentoPar = (par - 7);
			System.out.println("Faturamento Mês Par: " + faturamentoPar);
			
		} else {
			int fevereiro = 28;
			int faturamentoFev = 0;
				
			faturamentoFev = (fevereiro - 7);
			System.out.println("Faturamento Mês Fevereiro: " + faturamentoFev);
		}
		
	//===========================================================================================//		
		//Todas as notas de um aluno de uma disciplina;
		
		String nome = "Gabriel";
		String materia = "POO";
		
		if (materia == "POO") {
			double n1 = 10;
			double n2 = 9.8;
			double n3 = 7.6;
			double n4 = 6.9;
			
			double mediaF = ((n1 + n2 + n3 + n4) / 4);
			System.out.println("Nome: " + nome + " | Notas de POO: " + mediaF);
		}
	//===========================================================================================//	
		//Todos os dados de um carro (placa, chassi, modelo, ano, cor, nome do dono) que foi multado
		
		String placa = "EUJ-4966";
		String chassi = "81992120909AK0209";
		String modelo = "ONIX";
		int ano = 1910;
		String cor = "Preto";
		String dono = "Gabriel";
		
		System.out.println("Placa: " + placa + " | Chassi: " + chassi + " | Modelo: " + modelo + " | Ano: " + ano + " | Cor: " + cor + " | Dono: " + dono);
	}
	
	//===========================================================================================//	
		//O número de ouro da matemática valor 1.61803...
		static double numOuro = 1.61803;
		
	//===========================================================================================//	
		//Os nomes dos alunos de uma turma com 10 alunos
		String[] nomes = new String[10]; {
		
		for(int i = 0; i < nomes.length; i++) { 
			String nomeAlunos = JOptionPane.showInputDialog("Digite o nome"); 
			nomes[i] = nomeAlunos;
			System.out.println("Nomes: " + nomeAlunos);
	}
		
	//===========================================================================================//	
		//Quantidade de pares de tênis de um armário 
		int armario[][] = new int[3][4];
		
		for(int linha = 0; linha < armario.length; linha++) {
			for( int coluna = 0; coluna < armario[linha].length; coluna++) {
				
				armario[linha][coluna] = linha * coluna;
		}
		
}
}
}
