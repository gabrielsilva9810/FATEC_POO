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
			
			int posicao = Integer.parseInt(JOptionPane.showInputDialog(mensagem + "\nEscolha uma posição (1-9)"));

			// VERIFICA SE A POSIÇÃO É VALIDA
			if(posicao < 1 || posicao > 9) {
				JOptionPane.showInputDialog(null + "Posição Invalida! Escolha uma posição de 1 a 9");
				continue;
			}
			
			// CALCULA A POSICAO DO TABULEIRO
			int linha = (posicao - 1) / 3;
			int coluna = (posicao - 1) % 3;
			
			// VERIFICA SE A POSICAO JA FOI ESCOLHIDA
			if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
				JOptionPane.showInputDialog(null + "Posição já escolhida! Escolha outra posição");
				continue;
			}

			// PREENCHENDO POSICAO ATUAL DO JOGADOR
			char simbolo;
			if(jogadorAtual == 1) {
				simbolo = player1Symbol; //X
				jogadorAtual = 2;			//bolinha
			} else {
				simbolo = player2Symbol;	//bolinha
				jogadorAtual = 1;			//x
			}

			// COLOCA O SIMBOLO NA POSICAO DIGITADA
			tabuleiro[linha][coluna] = simbolo;

			// VERIFICA SE HOUVE VENCEDOR OU EMPATE
			if(verificarVencedor(tabuleiro)) {
				JOptionPane.showInputDialog(null + "Jogador " + jogadorAtual + "(" + simbolo + ") venceu o jogo!");
				fimDeJogo = true;
				
			} else if (verificarEmpate(tabuleiro)) {
				JOptionPane.showInputDialog(null + "Empate!");
				fimDeJogo = true;
			}
		}
	}

	// METODO PARA VERIFICAR VENCEDOR
	public boolean verificarVencedor(char[][] tabuleiro) {

		for (int i = 0; i < 3; i++) {

			// verificar linhas
			if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] == tabuleiro[i][2]) {
				return true;
			}

			// verificar colunas
			if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[0][i] == tabuleiro[2][i]) {
				return true;
			}
		}

			//verificar diagonais -> \\\\
			if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2]) {
			return true;
			}
			//verificar diagonais -> ////
			if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[0][2] == tabuleiro[2][0]) {
				return true;
			}
			
			//PULA EMPATE
			return false;
		}
	
	// METODO PARA VERIFICAR EMPATE	
	public boolean verificarEmpate(char[][] tabuleiro) {
		
		int cont = 0;
		
			for(int linha = 0; linha < 3; linha ++) {
				for(int coluna = 0; coluna < 3; coluna++) {
					
					if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
						cont++;
						
						if(cont == 9) {
							
							return true;		//FINAL DO JOGO - MENSAGEM DE EMPATE
						}
						
					}
				}
			}
			
			//SE NAO DER EMPATE - CONTINUAR
			return false;
	}
		
	}

		
		

	

	
	
	
	
	
	
	// METODO PARA VERIFICAR EMPATE	

