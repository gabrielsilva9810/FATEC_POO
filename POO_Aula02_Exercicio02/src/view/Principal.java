package view;

public class Principal {

	/*
	 * ENUNCIADO - CONTANDO DE 100 MIL ATÉ 0
	 * 
	 * Faça um código em Java para estourar a memória Stack. 
	 * Você saberá que o programa foi bem sucedido quando ocorrer um erro de StackOverflow
	 * 
	 * Quanto mais 0, mais fácil de estourar a memória...
	 */
	
	public static void main(String[] args) {
		int x = 100000;
		recursive(x);
}

	public static void recursive(int x) {
		if (x == 0) {
			return;
		}
		
		System.out.println(x);
		recursive (x - 1);
	}
	
}