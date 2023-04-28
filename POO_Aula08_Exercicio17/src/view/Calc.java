package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Calc extends Application{

	@Override
	public void start(Stage stage) {
	//======================================================================================================
		AnchorPane ap = new AnchorPane();
		ap.setStyle("-fx-background-color: '#F4F4F4'");
		Scene cena = new Scene(ap, 300, 400);
		
		//---------------------------------------------------------------------
		TextField txt = new TextField();
		txt.setPrefHeight(35);
		
		Button btnCe = new Button("CE");
		btnCe.setFont(new Font(10));
		
		ap.getChildren().addAll(txt, btnCe);
		
		TilePane tp = new TilePane();
		tp.setPrefColumns(4);
		tp.setHgap(10);
		tp.setVgap(10);
		
		Button btn1 = new Button("1");Button btn2 = new Button("2");Button btn3 = new Button("3");Button btnMa = new Button("+");
		Button btn4 = new Button("4");Button btn5 = new Button("5");Button btn6 = new Button("6");Button btnMe = new Button("-");
		Button btn7 = new Button("7");Button btn8 = new Button("8");Button btn9 = new Button("9");Button btnVe = new Button("*");
		Button btnPo = new Button(".");Button btn0 = new Button("0");Button btnIg = new Button("=");Button btnDi = new Button("/");
		
		ajustarTam(60, 70, 
					btn1, btn2, btn3, btnMa,			
					btn4, btn5, btn6, btnMe,
					btn7,  btn8, btn9, btnVe,
					btnPo, btn0, btnIg,btnDi);
		
        tp.getChildren().addAll(btn1, btn2, btn3, btnMa, 
        						btn4, btn5, btn6, btnMe, 
        						btn7, btn8, btn9, btnVe, 
        						btnPo, btn0, btnIg, btnDi);
		//---------------------------------------------------------------------
		
        
		AnchorPane.setTopAnchor(txt, 15.0);
		AnchorPane.setLeftAnchor(txt, 10.0);
		AnchorPane.setRightAnchor(txt, 50.0);
		
		AnchorPane.setTopAnchor(btnCe, 20.0);
		AnchorPane.setRightAnchor(btnCe, 15.0);
		
		ap.getChildren().add(tp);
		AnchorPane.setTopAnchor(tp, 70.0);
		AnchorPane.setBottomAnchor(tp, 10.0);
		AnchorPane.setLeftAnchor(tp, 15.0);
		AnchorPane.setRightAnchor(tp, 10.0);
		
	//======================================================================================================
	
		stage.setScene(cena);
//		stage.setResizable(false); // não sei se podia usar, então não usei, mas seria melhor
		stage.setTitle("Agenda de Contatos");
		stage.show();
	}
	
	private void ajustarTam (double width, double height, Button... button) {
	    for(Button btn : button) {
	    	btn.setPrefWidth(width);
		    btn.setPrefHeight(height);
	    }
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}


// eu costumo guardar os códs q eu penso e acho q poderia usar em outro lugar abaixo.
// procuro tirar pra entregar, mas tenho medo de uma hora o cód não funcionar pq tirei muito ráp.
// alias se tiver algum não funcionando pode me pergutar q eu passo novamente. no fundo todos estão funcionando perfeitamente
// mas vou parar de tirar códs

//for(int i =0; i < btn.length; i++) {
//	btn[i] = "btn" + i;
//	Button botao = new Button(btn[i]);
//	ajustarTam(btn[i], 50, 70);
//}
//
//for(String b : btn) {
//	
//}
