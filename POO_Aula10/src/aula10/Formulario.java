package aula10;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Formulario {
	
	public class pratoFormulario extends Application {
		
		@Override
		public void start (Stage stage) {
			GridPane painel = new GridPane();
			
			ColumnConstrainsts col1 = new ColumnConstrainsts();
			col1.setPercentWidth(20);
			
			
			ColumnConstrainsts col2 = new ColumnConstrainsts();
			col1.setPercentWidth(20);
			
			Scene scn = new Scene(painel, 800, 300);
			
			Label lblNome = new Label("Nome do Prato");
			Label lblCodigo = new Label("Codigo");
			Label txtIngredientes = new Label("Codigo");
			
			TextField txtNome = new TextField();
			TextField txtCodigo = new TextField();
			TextField txtIngredientes = new TextField();
			
			Button btnSalvar = new Button("Salvar");
			
			painel.add(lblNome, 0, 0);
			painel.add(txtNome, 1, 0);
			painel.add(lblCodigo, 0, 1);
			
			stage.setScene(scn);
			stage.show();
			
			
		}
		
		public void main(String[] args) {
			javafx.application.Application.launch(args);
		}
	}
}
