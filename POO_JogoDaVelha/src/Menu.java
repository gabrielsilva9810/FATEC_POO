import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		boolean jogarNovamente = true;

		while (jogarNovamente) {

			// CRIA O JOGO DA VELHA
			JogoDaVelha jogo = new JogoDaVelha();

			// MENSAGEM DE BEM VINDO!!!
			JOptionPane.showMessageDialog(null, "BEM VINDO AO JOGO DA VELHA "
					+ "\n \nClique no OK para Iniciar... "
					+ "\n \nFeito por: Gabriel Silva - FATEC ZONA LESTE");
			
			//ESCOLHER A OPCAO DO SIMBOLO
			int option = JOptionPane.showOptionDialog(null, "Escolha seu símbolo", "Jogo da Velha",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[] { "X", "O" }, null);

			//DETERMINANDO OS JOGADORES
			char player1Symbol, player2Symbol;
			if (option == 0) {
				player1Symbol = 'X';
				player2Symbol = 'O';
			} else {
				player1Symbol = 'O';
				player2Symbol = 'X';
			}
			
			//EXIBE JOGADORES
			JOptionPane.showMessageDialog(null, "JOGADOR 1: " + player1Symbol + ""
					+ "\nJOGADOR 2: " + player2Symbol);
			
			//EXIBE TABULEIRO NA TELA
			jogo.fazerJogadas(player1Symbol, player2Symbol);
			
			//DESEJA JOGAR NOVAMENTE
		    int resposta = JOptionPane.showOptionDialog(null, "Deseja jogar novamente?", "Jogo da Velha",
		        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"SIM", "NAO"}, "SIM");
		    
		    if (resposta == JOptionPane.YES_OPTION) {
		    	
		    	// REINICIA O JOGO
		        jogarNovamente = true;
		    	
		    } else {
		        // ENCERRA O JOGO
		        JOptionPane.showMessageDialog(null, "Obrigado por jogar!");
		        System.exit(0);	//FECHA O PROGRAMA
		    }
		}
	}
}
