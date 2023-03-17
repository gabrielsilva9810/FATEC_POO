package view;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		
		/*
		 * ENUNCIADO - 
		 * 
		 * Faça um programa que solicite ao usuário para digitar dois números que serão guardados em variáveis do tipo double
		 * Em seguida o programa deve mostrar a soma destas variáveis na tela.
		 * Assumindo que a primeira linha é aquela linha executada em primeiro na função public static void main
		 * Faça um desenho da memória Stack e Heap no momento em que o código estiver executando a 5ª linha.
		 * 
		 */
		
		//SCANNER
		Scanner l = new Scanner(System.in);
		
		//VARIAVEIS
		double n1;
		double n2;
		double res;
		
		//VALOR DIGITADO
		System.out.println("Digite o primeiro numero");
		n1 = l.nextDouble();

		System.out.println("Digite o segundo numero");
		n2 = l.nextDouble();

		//CONTA
		res = n1 + n2;
		System.out.println("Resultado: " + res);
	}
}
