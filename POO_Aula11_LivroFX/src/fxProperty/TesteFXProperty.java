package fxProperty;

//APLICACAO
import javafx.application.Application;

//SCENAS
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import javafx.scene.control.TextArea;

//STAGE
import javafx.stage.Stage;


public class TesteFXProperty extends Application {
	
	private TextField txtNumero1 = new TextField();
	private TextField txtNumero2 = new TextField();
	private Label lblResposta = new Label("Resposta: ");
	

	@Override
	public void start(Stage stage) throws Exception {
		FlowPane fp = new FlowPane();
		Scene scn = new Scene(fp, 400, 200);
		
		fp.getChildren().addAll(new Label("Numero 1: "), txtNumero1);
		fp.getChildren().addAll(new Label("Numero 2: "), txtNumero1);
		fp.getChildren().addAll(lblResposta);
		
		//ARROW FUNCTION
		txtNumero1.textProperty().addListener(
				(o, antigo, novo) -> {
			int r = Integer.parseInt(novo) +
					Integer.parseInt(txtNumero2.getText());
			lblResposta.setText("Resposta: " + r);
		});
	}
}