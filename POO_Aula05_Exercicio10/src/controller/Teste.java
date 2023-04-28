package controller;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		//INSTANCIA
		Dinossauro Skeep = new Dinossauro();
		
		//MENU DE OPCOES
		 do {
	     Skeep.mostrarAtributos();
	            String textoMaiusculo = JOptionPane
	                    .showInputDialog("ATIVIDADES COM O SKEEP: \n" + "(P)ular" + "\n" + "co(R)rer" + "\n" + "(C)omer"
	                            + "\n" + "(B)rincar" + "\n" + "Tomar (S)ol" + "\n" + "Ficar na S(O)mbra");
	            textoMaiusculo = textoMaiusculo.toUpperCase();
	
	            char letra = textoMaiusculo.charAt(0);
	            
	            //OPCOES
	            switch (letra) {
	            case 'P':
	                Skeep.pular();
	                break;
	            case 'R':
	                Skeep.correr();
	                break;
	            case 'C':
	                Skeep.comer();
	                break;
	            case 'B':
	                Skeep.brincar();
	                break;
	            case 'S':
	                Skeep.tomarSol();
	                break;
	            case 'O':
	                Skeep.ficarNaSombra();
	                break;

	            default:
	                JOptionPane.showMessageDialog(null, "Skeep não consegue fazer isso!");
	                Skeep.setVida(false);
	                JOptionPane.showMessageDialog(null, "Skeep foi de Drake e Josh...");
	                break;
	            }
	        } while (Skeep.getvida()== true);
	    }

}

