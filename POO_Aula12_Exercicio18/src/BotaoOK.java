import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BotaoOK extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {

		// Cria um botão com texto "OK"
		Button btn = new Button();
		btn.setText("OK");

		// Adiciona um evento ao botão
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World");
			}
		});

		// Adiciona o botão a um StackPane
		StackPane root = new StackPane();
		root.getChildren().add(btn);

		// Cria uma nova cena com o StackPane como conteúdo
		Scene scene = new Scene(root, 300, 250);

		// Define a cena na janela principal e exibe a janela
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}


