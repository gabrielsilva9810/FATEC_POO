package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FormContato extends Application {

	@Override
	public void start(Stage stage) {
	//======================================================================================================
		Pane painel = new Pane();
		painel.setStyle("-fx-background-color: '#F4F4F4'");
		Scene cena = new Scene(painel, 560, 218);
		
		//---------------------------------------------------------------------
		Label lblID = new Label("Id: ");
		painel.getChildren().add(lblID);
		lblID.relocate(10, 10);
		lblID.setPrefWidth(100);
//		lblID.setPrefHeight(50);
		
		Label lblNome = new Label("Nome: ");
		painel.getChildren().add(lblNome);
		lblNome.relocate(10, 50);
		
		Label lblTel = new Label("Telefone: ");
		painel.getChildren().add(lblTel);
		lblTel.relocate(10, 90);
		
		//---------------------------------------------------------------------
		TextField txtID = new TextField();
		painel.getChildren().add(txtID);
		txtID.relocate(150, 10);
		txtID.setPrefWidth(400);
		
		TextField txtNome = new TextField();
		painel.getChildren().add(txtNome);
		txtNome.relocate(150, 50);
		txtNome.setPrefWidth(400);
		
		TextField txtTel = new TextField();
		painel.getChildren().add(txtTel);
		txtTel.relocate(150, 90);
		txtTel.setPrefWidth(400);
		
		//---------------------------------------------------------------------
		Button btnSalvar = new Button("Salvar");
		painel.getChildren().add(btnSalvar);
		btnSalvar.relocate(10, 130);
		btnSalvar.setPrefWidth(50);
		
		Button btnPesq = new Button("Pesquisar");
		painel.getChildren().add(btnPesq);
		btnPesq.relocate(60, 130);
		btnPesq.setPrefWidth(70);
	//======================================================================================================
	
		stage.setScene(cena);
		stage.setResizable(false);
		stage.setTitle("Agenda de Contatos");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

