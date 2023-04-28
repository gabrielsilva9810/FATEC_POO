package asdf;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MeuApp extends Application {

	@Override
	public void start(Stage stage) {
	//======================================================================================================
		// primeiro se cria o painel de fundo e depois a cena e chama a cena no painel de fundo.		
//		Pane painel = new Pane();
//		painel.setStyle("-fx-background-color: '#FFFFDD'");// nome ou cód hexadecimal.
//		Scene cena = new Scene(painel, 600, 400);//aqui não estão no stage, cena gera o painel de 600x400
//		
//		
//		Button btnTeste = new Button("me aperta ...");
//		painel.getChildren().add(btnTeste);
//		btnTeste.relocate(250, 300);
//		
//		
//		Label ldl = new Label("texto simples");
//		painel.getChildren().add(ldl);
//		ldl.relocate(250, 150);
//		
//		
//		
//		TextField txt = new TextField();
//		painel.getChildren().add(txt);
//		txt.relocate(250, 200);
	//======================================================================================================
		
		FlowPane painel = new FlowPane();
		painel.setStyle("-fx-background-color: '#FFFFDD'");// nome ou cód hexadecimal.
		Scene cena = new Scene(painel, 600, 400);//aqui não estão no stage, cena gera o painel de 600x400
		
		Button btnTeste = new Button("me aperta ...");
		
		Label ldl = new Label("texto simples");
		
		TextField txt = new TextField();
		painel.getChildren().addAll(txt,btnTeste,ldl);
	//======================================================================================================	
		
		
		
		
		
		stage.setScene(cena);
		stage.setTitle("meu app");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
