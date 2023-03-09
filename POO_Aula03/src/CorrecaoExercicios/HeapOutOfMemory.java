package CorrecaoExercicios;

public class HeapOutOfMemory {

	public static void main(String[] args) {
		
		long contador = 0;
		
		//Inicializando NÓS na memória heap
		No raiz = new No();
		No t = new No();
		
		raiz.proximo = t; 				//Está apontando para T
		
		while(true) {
			t.proximo = new No();		//Criando diversas variaveis em LOOP
			t = t.proximo;				//Apontando o ponteiro para o próximo nó
			System.out.println(contador++);
		}
		
		/* Uma das formas de estourar a memória HEAP é criando diversas instancias.
		 * Nesse código, é estourado a memória, devido criar diversos INSTANCIAS.		 * 
		 */
	}
	

}
