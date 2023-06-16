package view;

import control.TaskController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TaskView extends Application {

    private TaskController taskController;

    public TaskView() {
        taskController = new TaskController();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gerenciamento de Tarefas");
        
        //GRIDPANE
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        //ID
        Label idLabel = new Label("ID:");
        grid.add(idLabel, 0, 0);

        TextField idField = new TextField();
        grid.add(idField, 1, 0);
        
        //TITULO
        Label titleLabel = new Label("Título:");
        grid.add(titleLabel, 0, 1);

        TextField titleField = new TextField();
        grid.add(titleField, 1, 1);

        //DESCRIÇÃO
        Label descriptionLabel = new Label("Descrição:");
        grid.add(descriptionLabel, 0, 2);

        TextField descriptionField = new TextField();
        grid.add(descriptionField, 1, 2);

        //-------------------------------------------------------------//
        //INSERINDO TAREFA
        Button addTask = new Button("Inserir Tarefa");
        grid.add(addTask, 0, 4);

        //ATUALIZANDO TAREFA
        Button updateTask = new Button("Atualizar Tarefa");
        grid.add(updateTask, 1, 4);

        //EXCLUINDO TAREFA
        Button deleteTask = new Button("Excluir Tarefa");
        grid.add(deleteTask, 0, 5);
        
        //LOCALIZANDO TAREFA
        Button searchButton = new Button("Localizar Tarefa");
        grid.add(searchButton, 1, 5);
        //-------------------------------------------------------------//

        //------------------------------EVENTOS DOS BOTOES ------------------///
        
        //INSERINDO TAREFAS
        addTask.setOnAction(event -> {
            String title = titleField.getText();
            String description = descriptionField.getText();
            taskController.inserirTarefa(title, description);
            
         //LIMPANDO OS CAMPOS
            idField.clear();
            titleField.clear();
            descriptionField.clear();
        });
        
        //ATUALIZANDO TASK
        updateTask.setOnAction(event -> {
            int id = Integer.parseInt(idField.getText());
            String title = titleField.getText();
            String description = descriptionField.getText();
            taskController.atualizarTarefa(id, title, description);
            
         //LIMPANDO OS CAMPOS
            idField.clear();
            titleField.clear();
            descriptionField.clear();
        });

        //DELETANDO TASK
        deleteTask.setOnAction(event -> {
            int id = Integer.parseInt(idField.getText());
            taskController.excluirTarefa(id);
            
        //LIMPANDO OS CAMPOS
            idField.clear();
            titleField.clear();
            descriptionField.clear();
        });
        
        //LOCALIZANDO TASK
        searchButton.setOnAction(event -> {
        	int id = Integer.parseInt(idField.getText());
            taskController.localizarTarefaPorId(id);
        });
        
        // BOTÃO PARA EXIBIR TODAS AS TAREFAS
        Button showAllButton = new Button("Exibir Todas as Tarefas");
        grid.add(showAllButton, 1, 5);

        // EVENTO DO BOTÃO PARA EXIBIR TODAS AS TAREFAS
        showAllButton.setOnAction(event -> {
            taskController.exibirTodasTarefas();
        });
        
    
        //CENA
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
    	launch(args);
    }
}
