package SistemaDeAlunos;

import java.sql.Date;
import java.text.ParseException;
import java.util.Scanner;


public class GestaoAlunos {
	
	//CARACTERISTICAS
	private int indice;
	private Aluno[] alunos;
	
	public GestaoAlunos() {
		this.indice = 0;
		this.alunos = new Aluno [50];
	}
	
	//COMPORTAMENTOS - CRIAR | ATUALIZAR | EXCLUIR | EXIBIR | MENU
	public void criar() {
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		String nome = scan.nextLine();
		
		System.out.println("Digite o RA do aluno");
		String ra = scan.nextLine();
		
		System.out.println("Digite a data de nascimento do aluno");
		String nascimento = scan.nextLine();  

		//VERIFICAR DATA
		
		
		//NOME | RA | NASCIMENTO
		Aluno aluno = new Aluno(nome, ra, nascimento);

        this.alunos[this.indice] = aluno;
        this.indice++;

        System.out.println("Aluno criado com sucesso!");
	}
	
	public void exibir() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o RA do aluno:");
        String ra = scan.nextLine();

        //PEGA O RA E MOSTRA ATRAVES DO TO-STRING
        for (int i = 0; i < this.indice; i++) {
            if (this.alunos[i].getRa().equals(ra)) {
                System.out.println(this.alunos[i].toString());
                return;
            }
        }
        
        //SENAO ACHAR PELO RA, VAI EXIBIR A MENSAGEM:
        System.out.println("Aluno não encontrado.");
    }
	
	public void excluir() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o RA do aluno:");
        String ra = scan.nextLine();
        
        // INICIA QTD DE EXCLUIDOS EM 0
        int qtdExcluidos = 0;
        
        //EXCLUI O ALUNO COM BASE NO RA DIGITADO
        for (int i = 0; i < this.indice; i++) {
            if (this.alunos[i].getRa().equals(ra)) {
                this.alunos[i] = null;
                qtdExcluidos++;
            }
        }

        //SE A QUANTIDADE DE ALUNO EXCLUIDO PERMANECER EM 0, MOSTRA MSG
        if (qtdExcluidos == 0) {
            System.out.println("Aluno não encontrado.");
            
        //SENAO, EXIBE QUE O ALUNO SELECIONADO FOI EXCLUIDO
        } else {
            System.out.println(qtdExcluidos + " aluno(s) excluído(s) com sucesso!");
        }
    
	}
	
	public void atualizar() {
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite o RA do aluno que deseja atualizar.");
        String ra = scan.nextLine();
        
        for (int i = 0; i < indice; i++) {
            if (alunos[i].getRa() == ra) {
                System.out.print("Digite o novo nome do aluno: ");
                String nome = scan.nextLine();
                
        //VERIFICAR DATA

                System.out.println("Aluno atualizado com sucesso.");
                return;
            }
        }
        
        System.out.println("Aluno não encontrado.");
	}

}

        

