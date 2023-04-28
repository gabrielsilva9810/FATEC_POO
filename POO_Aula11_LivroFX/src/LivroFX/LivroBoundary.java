package LivroFX;

//DATE
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//APLICACAO
import javafx.application.Application;

//SCENAS
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import javafx.scene.control.TextArea;

//STAGE
import javafx.stage.Stage;

//ARRAYLIST
import java.util.ArrayList;

public class LivroBoundary extends Application{
	
	private TextField txtTitulo = new TextField();
	private TextField txtPaginas = new TextField();
	private TextField txtPublicacao = new TextField();
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	//LISTA -->
	private ArrayList<Livro> lista = new ArrayList<>();
	
	//FUNCAO DE ADICIONAR
	public void adicionar() {
		Livro l = new Livro();
		l.setTitulo(txtTitulo.getText());
		l.setPaginas(Integer.parseInt(txtPaginas.getText()));
		LocalDate date =
				LocalDate.parse(txtPublicacao.getText(), dtf);
		l.setDataPublicado(date);
	}
	
	//FUNCAO DE PESQUISAR
	public void pesquisar() {
		for (Livro l : lista) {
			if (l.getTitulo().contains(txtTitulo.getText())) {				//Pega o que contem no texto;
				txtTitulo.setText(l.getTitulo());
				txtPaginas.setText(String.valueOf(l.getPaginas()));
				txtPublicacao.setText(dtf.format(l.getDataPublicado()));
				
				break;
			}
		}
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane principal = new BorderPane();
		Scene scn = new Scene(principal, 600, 400);
		
		GridPane grid = new GridPane();
		grid.add(new Label("Titulo: "), 0, 0);
		grid.add(txtTitulo, 1, 0);
		
		grid.add(new Label("#Paginas: "), 0, 1);
		grid.add(txtPaginas, 1, 1);
		
		grid.add(new Label("#Data de Publicação: "), 0, 2);
		grid.add(txtPublicacao, 1, 2);
		
		Button btnAdicionar = new Button("Adicionar");
		btnAdicionar.setOnAction(e -> adicionar());
		
		Button btnPesquisar = new Button("Pesquisar");
		btnPesquisar.setOnAction(e -> pesquisar());
	}
	
	public static void main(String[] args) {
		
		//PARA RODAR O CODIGO
		Application.launch(args);
	}
	

}
