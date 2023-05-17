import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ManutencaoCursos {
    
    private ManutencaoCursos control;
    
    private TextField txtId = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtCodigoCurso = new TextField();
    private TextField txtNomeCoordenador = new TextField();
    private TextField txtQuantidadeAlunos = new TextField();
    
    public ManutencaoCursos() {
        control = new ManutencaoCursos();
    }
    
    public void start(Stage stage) {
        Label lblTitulo = new Label("Cadastro de Cursos");
        lblTitulo.setStyle("-fx-font-size: 20pt; -fx-font-weight: bold;");
        
        Label lblId = new Label("ID:");
        Label lblNome = new Label("Nome:");
        Label lblCodigoCurso = new Label("Código do Curso:");
        Label lblNomeCoordenador = new Label("Nome do Coordenador:");
        Label lblQuantidadeAlunos = new Label("Quantidade de Alunos:");
        
        Button btnAdicionar = new Button("Adicionar");
        btnAdicionar.setOnAction(e -> adicionarCurso());
        
        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setOnAction(e -> pesquisarCurso());
        
        GridPane gridCampos = new GridPane();
        gridCampos.setAlignment(Pos.CENTER);
        gridCampos.setHgap(10);
        gridCampos.setVgap(10);
        gridCampos.setPadding(new Insets(10));
        gridCampos.add(lblId, 0, 0);
        gridCampos.add(txtId, 1, 0);
        gridCampos.add(lblNome, 0, 1);
        gridCampos.add(txtNome, 1, 1);
        gridCampos.add(lblCodigoCurso, 0, 2);
        gridCampos.add(txtCodigoCurso, 1, 2);
        gridCampos.add(lblNomeCoordenador, 0, 3);
        gridCampos.add(txtNomeCoordenador, 1, 3);
        gridCampos.add(lblQuantidadeAlunos, 0, 4);
        gridCampos.add(txtQuantidadeAlunos, 1, 4);
        
        GridPane gridBotoes = new GridPane();
        gridBotoes.setAlignment(Pos.CENTER);
        gridBotoes.setHgap(10);
        gridBotoes.setPadding(new Insets(10));
        gridBotoes.add(btnAdicionar, 0, 0);
        gridBotoes.add(btnPesquisar, 1, 0);
        
        GridPane gridPrincipal = new GridPane();
        gridPrincipal.setAlignment(Pos.CENTER);
        gridPrincipal.setVgap(10);
        gridPrincipal.setPadding(new Insets(10));
        gridPrincipal.add(lblTitulo, 0, 0);
        gridPrincipal.add(gridCampos, 0, 1);
        gridPrincipal.add(gridBotoes, 0, 2);
        
        Scene scene = new Scene(gridPrincipal, 400, 300);
        
        stage.setScene(scene);
        stage.setTitle("Cadastro de Cursos");
        stage.show();
    } 


    private Object pesquisarCurso() {
		// TODO Auto-generated method stub
		return null;
	}

	private void adicionarCurso() {
        Curso curso = new Curso();
        curso.setNome(txtNome.getText());
		curso.setCodigo(txtCodigo.getText());
        curso.setCoordenador(txtCoordenador.getText());
        curso.setQuantidadeAlunos(Integer.parseInt(txtQuantidadeAlunos.getText()));
        cursoControl.adicionarCurso(curso);
        limparCampos();
    }
}


