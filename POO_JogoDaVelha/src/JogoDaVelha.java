import javax.swing.JOptionPane;

public class JogoDaVelha {

	private char[][] tabuleiro;
	private char jogadorAtual;

	// CONSTRUTOR - LIMPA O INICIO DO CODIGO
	public JogoDaVelha() {
		this.tabuleiro = new char[][] { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		this.jogadorAtual = 1;
	}

	// JOGADAS
	public void fazerJogadas(char player1Symbol, char player2Symbol) {
		char[][] tabuleiro = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		boolean fimDeJogo = false;

		while (!fimDeJogo) {

			// PREENCHE O TABULEIRO - VAZIO
			String mensagem = "";
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					mensagem += tabuleiro[i][j] + " ";
				}
				mensagem += "\n";
			}

			int posicao = Integer.parseInt(JOptionPane.showInputDialog(mensagem + "\nEscolha uma posição (1-9):"));

			// VERIFICA SE A POSIÇÃO É VALIDA
			if (posicao < 1 || posicao > 9) {
				JOptionPane.showMessageDialog(null, "Posição inválida! Escolha uma posição de 1 a 9.");
				continue;
			}

			// CALCULA A POSICAO DO TABULEIRO
			int linha = (posicao - 1) / 3;
			int coluna = (posicao - 1) % 3;

			// VERIFICA SE A POSICAO JA FOI ESCOLHIDA
			if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
				JOptionPane.showMessageDialog(null, "Posição já escolhida! Escolha outra posição.");
				continue;
			}

			// PREENCHENDO POSICAO ATUAL DO JOGADOR
			char simbolo; // char
			if (jogadorAtual == 1) {
				simbolo = player1Symbol; // PREENCHE O PLAYER 1 CONFORME SELECIONADO
				jogadorAtual = 2;
			} else {
				simbolo = player2Symbol; // PREENCHE O PLAYER 2 CONFORME SELECIONADO
				jogadorAtual = 1;
			}

			// COLOCA O SIMBOLO NA POSICAO DIGITADA
			tabuleiro[linha][coluna] = simbolo;

			// VERIFICA SE HOUVE VENCEDOR OU EMPATE
			if (verificarVencedor(tabuleiro)) {
				JOptionPane.showMessageDialog(null, "Jogador " + jogadorAtual + "(" + simbolo + ") venceu o jogo!");
				fimDeJogo = true;

			} else if (verificarEmpate(tabuleiro)) {
				JOptionPane.showMessageDialog(null, "Empate!");
				fimDeJogo = true;
			}
		}

	}

	// METODO PARA VERIFICAR VENDEDOR
	public boolean verificarVencedor(char[][] tabuleiro) {

		for (int i = 0; i < 3; i++) {

			// VERIFICANDO LINHAS
			if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] == tabuleiro[i][2]) {
				return true;
			}

			// VERIFICANDO COLUNAS
			if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[0][i] == tabuleiro[2][i]) {
				return true;
			}
		}

		// VERIFICANDO DIAGNONAIS -> \\\\\\\\\
		if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2]) {
			return true;
		}

		// VERIFICANDO DIAGONAIS -> /////////
		if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[0][2] == tabuleiro[2][0]) {
			return true;
		}

		// PULA PARA O EMPATE
		return false;
	}

	// METODO PARA VERIFICAR EMPATE
	public boolean verificarEmpate(char[][] tabuleiro) {
		
		int cont = 0;
		
		for (int linha = 0; linha < 3; linha++) {	
			for (int coluna = 0; coluna < 3; coluna++) {
				
				if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
					cont++;
					
					if(cont == 9) {
						
						//FINAL DO JOGO - MENSAGEM DE EMPATE
						return true;
					}
				}
			}
		}

		//SE NAO DER EMPATE - CONTINUA
		return false;
	}
}
