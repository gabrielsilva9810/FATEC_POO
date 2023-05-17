import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		//BOOLEAN JOGAR NOVAMENTE
		
		boolean jogarNovamente = true;
		
		while (jogarNovamente) {
			
			JogoDaVelha jogo = new JogoDaVelha();
			
			JOptionPane.showMessageDialog(null, "BEM VINDO AO JOGO DA VELHA "
					+ "\n \nClique no OK para iniciar..."
					+ "\n \nFeito por: Gabriel Silva - FATEC ZONA LESTE");
			
			int option = JOptionPane.showOptionDialog(null, "Escolha seu simbolo", "Jogo da Velha",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[] { "X", "O"}, null);
			
			char player1Symbol, player2Symbol;
			
			if(option == 0) {
				player1Symbol = 'X';
				player2Symbol = 'O';
			} else {
				player1Symbol = 'O';
				player2Symbol = 'X';
			}
			
			
			JOptionPane.showMessageDialog(null, "JOGADOR 1: " + player1Symbol + ""
					+ "\n JOGADOR 2: " + player2Symbol);
			
			jogo.fazerJogadas(player1Symbol, player2Symbol);
			
			int resposta = JOptionPane.showOptionDialog(null, "Deseja jogar novamente?", "Jogo da Velha",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] { "SIM", "NÃO"}, "SIM");
			
			if(resposta == JOptionPane.YES_OPTION) {
				
				//REINICIA O JOGO
				jogarNovamente = true;
				
			} else {
				JOptionPane.showMessageDialog(null, "Obrigado por jogar!");
				System.exit(0); 		//FECHAR O PROGRAMA
			}
			
		}
		
		
		// CRIAR O JOGO -
		// BEM VINDO - (MENSAGEM) -
		// ESCOLHER SIMBOLO --- 
		// DETERMINAR OS JOGADORES ---
		// EXIBE JOGADORES ---
		// EXIBE TABULEIRO NA TELA ---
		// DESEJA JOGAR NOVAMENTE?
		
	}
}
