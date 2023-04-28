package SistemaDeAlunos;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		// MENU
		Scanner scanner = new Scanner(System.in);
		GestaoAlunos gestaoAlunos = new GestaoAlunos();
		
		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("(C)riar   (E)xibir   (R)emover   (A)tualizar   (S)air");
			
			String textoMaiusculo = scanner.nextLine().toUpperCase();
			char letra = textoMaiusculo.charAt(0);
			
			switch (letra) {
            case 'C':
            	gestaoAlunos.criar();
            	break;
            	
            case 'E':
            	gestaoAlunos.exibir();
            	break;
	
            case 'R':
                gestaoAlunos.excluir();
		        break;

            case 'A':
            	gestaoAlunos.atualizar();
            	break;
	
            case 'S':
                System.exit(0);
		        break;
		
            default:
                System.out.println("Opção inválida.");
		            }
		        }
		    }
}
