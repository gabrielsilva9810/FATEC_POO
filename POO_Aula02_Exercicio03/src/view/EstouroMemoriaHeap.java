package view;

public class EstouroMemoriaHeap {

	public static void main(String[] args) {
		
		/*
		 * ENUNCIADO - Provocar erro de estouro da memória Heap
		 * 
		 * Faça um código em Java para estourar a memória Heap.
		 * Você saberá que o programa foi bem sucedido quando ocorrer um erro de Out of Memory - Java Heap Error, ou algo parecido.
		 *
		 */
		
		String[] a = new String [100000 * 100000];
		
		Pessoa p = new Pessoa(1, "GABRIEL");
		System.out.print(p);
	}

}
