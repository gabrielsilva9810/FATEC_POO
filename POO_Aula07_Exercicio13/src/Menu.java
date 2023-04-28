import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		
		// MENU
		Scanner scanner = new Scanner(System.in);
		GestaoFuncionarios gestaoFuncionario = new GestaoFuncionarios();

		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("(C)riar   (E)xibir   (R)emover   (A)tualizar   (S)air");

			String textoMaiusculo = scanner.nextLine().toUpperCase();
			char letra = textoMaiusculo.charAt(0);

			switch (letra) {
			case 'C':
				gestaoFuncionario.criar();
				break;

			case 'E':
				gestaoFuncionario.exibir();
				break;

			case 'R':
				gestaoFuncionario.excluir();
				break;

			case 'A':
				gestaoFuncionario.atualizar();
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
