package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FormContato extends Application {

	@Override
	public void start(Stage stage) {
	//======================================================================================================
		AnchorPane painel = new AnchorPane();
		painel.setStyle("-fx-background-color: '#F4F4F4'");
		Scene cena = new Scene(painel, 560, 218);
		
		//---------------------------------------------------------------------
		Label lblID = new Label("Id: ");		
		Label lblNome = new Label("Nome: ");
		Label lblTel = new Label("Telefone: ");
		//---------------------------------------------------------------------
		TextField txtID = new TextField();
		TextField txtNome = new TextField();
		TextField txtTel = new TextField();
		//---------------------------------------------------------------------
		Button btnSalvar = new Button("Salvar");
		btnSalvar.setPrefWidth(50);
		Button btnPesq = new Button("Pesquisar");
		btnPesq.setPrefWidth(70);
		
		painel.getChildren().addAll(lblID, lblNome, lblTel, txtID, txtNome, txtTel, btnSalvar, btnPesq);
		
		AnchorPane.setTopAnchor(lblID, 10.0);
		AnchorPane.setLeftAnchor(lblID, 10.0);
		
		AnchorPane.setTopAnchor(lblNome, 50.0);
		AnchorPane.setLeftAnchor(lblNome, 10.0);
		
		AnchorPane.setTopAnchor(lblTel, 90.0);
		AnchorPane.setLeftAnchor(lblTel, 10.0);
		
		AnchorPane.setTopAnchor(txtID, 10.0);
		AnchorPane.setLeftAnchor(txtID, 150.0);
		AnchorPane.setRightAnchor(txtID, 20.0);
		
		AnchorPane.setTopAnchor(txtNome, 50.0);
		AnchorPane.setLeftAnchor(txtNome, 150.0);
		AnchorPane.setRightAnchor(txtNome, 20.0);
		
		AnchorPane.setTopAnchor(txtTel, 90.0);
		AnchorPane.setLeftAnchor(txtTel, 150.0);
		AnchorPane.setRightAnchor(txtTel, 20.0);
		
		AnchorPane.setTopAnchor(btnSalvar, 130.0);
		AnchorPane.setLeftAnchor(btnSalvar, 10.0);
		
		AnchorPane.setTopAnchor(btnPesq, 130.0);
		AnchorPane.setLeftAnchor(btnPesq, 60.0);

	//======================================================================================================
	
		stage.setScene(cena);
		stage.setTitle("Agenda de Contatos");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
