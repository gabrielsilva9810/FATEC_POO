import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestaoFuncionarios {
    private int indice;
    private Funcionario[] funcionarios;

    public GestaoFuncionarios() {
        this.indice = 0;
        this.funcionarios = new Funcionario[50];
    }

    //COMPORTAMENTOS
    public void criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criando novo funcionário...");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Admissão (dd/MM/yyyy): ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
  
        Date admissao = null;
        try {
            admissao = dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Demissão (dd/MM/yyyy): ");
        Date demissao = null;
        try {
            demissao = dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        System.out.print("Salário: ");
        float salario = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Horário: ");
        String horario = scanner.nextLine();
        
        Funcionario funcionario = new Funcionario(indice + 1, nome, matricula, admissao, demissao, salario, horario);
        funcionarios[indice] = funcionario;
        indice++;
        
        System.out.println("Funcionário criado com sucesso!");
    }
    
    //====================================================================================================//
    public void atualizar() {
    	Scanner input = new Scanner(System.in);
        System.out.print("Digite a matrícula do funcionário a ser atualizado: ");
        
        int matricula = Integer.parseInt(input.nextLine());
        boolean encontrado = false;
        
        for (int i = 0; i < this.indice; i++) {
            if (this.funcionarios[i].getMatricula().equals(matricula)) {
            	
                System.out.print("Digite o novo nome do funcionário: ");
                this.funcionarios[i].setNome(input.nextLine());
                
                System.out.print("Digite a nova data de admissão do funcionário (DD/MM/AAAA): ");
                this.funcionarios[i].setAdmissao(input.nextLine());
                
                System.out.print("Digite a nova data de demissão do funcionário (DD/MM/AAAA): ");
                this.funcionarios[i].setDemissao(input.nextLine());
                
                System.out.print("Digite o novo salário do funcionário: ");
                this.funcionarios[i].setSalario(Double.parseDouble(input.nextLine()));
                
                System.out.print("Digite o novo horário de trabalho do funcionário: ");
                this.funcionarios[i].setHorario(input.nextLine());
                
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("Funcionário atualizado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    //====================================================================================================//
    public void excluir() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a matrícula do funcionário a ser excluído: ");
        int matricula = Integer.parseInt(input.nextLine());
        boolean encontrado = false;
        for (int i = 0; i < this.indice; i++) {
        	
            if (this.funcionarios[i].getMatricula().equals(matricula)) {
                for (int j = i; j < this.indice - 1; j++) {
                    this.funcionarios[j] = this.funcionarios[j + 1];
                }
                this.indice--;
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Funcionário excluído com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    //=================================================================================================================//
    public void exibir() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a matrícula do funcionário que deseja exibir: ");
        String matricula = scanner.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < indice; i++) {
            if (funcionarios[i].getMatricula().equals(matricula)) {
                funcionarios[i].exibir();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }
    }
}