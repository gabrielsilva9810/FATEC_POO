import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlunoBoundary extends Application {

    private List<Aluno> alunos = new ArrayList<>(); // Lista de alunos

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Cria os campos de entrada para os dados do aluno
        TextField idField = new TextField();
        idField.setPromptText("ID");

        TextField raField = new TextField();
        raField.setPromptText("RA");

        TextField nomeField = new TextField();
        nomeField.setPromptText("Nome");

        TextField nascimentoField = new TextField();
        nascimentoField.setPromptText("Nascimento (aaaa-mm-dd)");

        // Cria um botão para adicionar um aluno
        Button adicionarButton = new Button("Adicionar");

        // Adiciona um evento ao botão Adicionar
        adicionarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Cria uma instância de Aluno com os dados informados
                int id = Integer.parseInt(idField.getText());
                String ra = raField.getText();
                String nome = nomeField.getText();
                LocalDate nascimento = LocalDate.parse(nascimentoField.getText());

                Aluno aluno = new Aluno(id, ra, nome, nascimento);

                // Adiciona o aluno na lista de alunos
                alunos.add(aluno);

                // Limpa os campos de entrada
                idField.clear();
                raField.clear();
                nomeField.clear();
                nascimentoField.clear();
            }
        });

        // Cria um botão para pesquisar um aluno
        Button pesquisarButton = new Button("Pesquisar");

        // Adiciona um evento ao botão Pesquisar
        pesquisarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Procura na lista pelo primeiro aluno com o nome informado
                String nome = nomeField.getText();

                for (Aluno aluno : alunos) {
                    if (aluno.getNome().equals(nome)) {
                    	
                        // Exibe os dados do aluno encontrado no console
                        System.out.println("ID: " + aluno.getId() + ", RA: " + aluno.getRa() +
                                ", Nome: " + aluno.getNome() + ", Nascimento: " + aluno.getNascimento());
                        break;
                    }
                }
            }
        });

        // Cria um painel para os campos de entrada
        GridPane inputPane = new GridPane();
        inputPane.setHgap(10);
        inputPane.setVgap(5);
        inputPane.setPadding(new Insets(10));
        inputPane.addRow(0, new Label("ID:"), idField);
        inputPane.addRow(1, new Label("RA:"), raField);
        inputPane.addRow(2, new Label("Nome:"), nomeField);
        inputPane.addRow(3, new Label("Nascimento:"), nascimentoField);

        // Cria um painel para os botões
        HBox buttonPane = new HBox(10);
        
        buttonPane.setPadding(new Insets(10));
        buttonPane.getChildren().addAll(adicionarButton, pesquisarButton);

        // Cria um painel para exibir a lista de alunos
        BorderPane listPane = new BorderPane();

        // Cria um rótulo para exibir o número de alunos na lista
        Label countLabel = new Label("Número de alunos: " + alunos.size());
        listPane.setTop(countLabel);

        // Cria uma cena com o layout final
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));
        root.setCenter(inputPane);
        root.setBottom(buttonPane);
        root.setRight(listPane);

        Scene scene = new Scene(root, 500, 300);

        primaryStage.setTitle("Cadastro de Alunos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
       
