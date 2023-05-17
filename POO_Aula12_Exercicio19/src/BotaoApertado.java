import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BotaoApertado extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Cria um botão com texto "OK"
        Button btn = new Button();
        btn.setText("OK");

        // Cria um label para exibir o texto
        Label label = new Label("Pressione o botão");

        // Adiciona um evento ao botão
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText("Botão Apertado");
            }
        });

        // Adiciona o botão e o label a um BorderPane
        BorderPane root = new BorderPane();
        root.setTop(label);
        root.setCenter(btn);

        // Cria uma nova cena com o BorderPane como conteúdo
        Scene scene = new Scene(root, 300, 250);

        // Define a cena na janela principal e exibe a janela
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
