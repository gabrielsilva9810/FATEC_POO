package control;

import bd.acessBD;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskController {

    private acessBD bdManager;

    public TaskController() {
        bdManager = new acessBD();
    }

    //CRIANDO TABELA TAREFAS
    public void criarTabelaTarefas() {
        try {
            Connection connection = bdManager.getConnection();
            PreparedStatement statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS tarefas (id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "titulo VARCHAR(100) NOT NULL, descricao TEXT, data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP, ");
            statement.executeUpdate();
            System.out.println("Tabela tarefas criada com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //INSERINDO TABELAS
    public void inserirTarefa(String titulo, String descricao) {
        try {
            Connection connection = bdManager.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO tarefas (titulo, descricao) VALUES (?, ?)");
            statement.setString(1, titulo);
            statement.setString(2, descricao);
            statement.executeUpdate();
            System.out.println("Tarefa inserida com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //ATUALIZANDO TABELA TAREFAS
    public void atualizarTarefa(int id, String titulo, String descricao) {
        try {
            Connection connection = bdManager.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE tarefas SET titulo = ?, descricao = ? WHERE id = ?");
            statement.setString(1, titulo);
            statement.setString(2, descricao);
            statement.setInt(3, id);
            statement.executeUpdate();
            System.out.println("Tarefa atualizada com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    //EXCLUINDO TABELA TAREFAS
    public void excluirTarefa(int id) {
        try {
            Connection connection = bdManager.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM tarefas WHERE id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Tarefa excluída com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //SELECT TABELA TAREFAS - POR ID
    public void localizarTarefaPorId(int id) {
        try {
            Connection connection = bdManager.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tarefas WHERE id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int taskId = resultSet.getInt("id");
                String title = resultSet.getString("titulo");
                String description = resultSet.getString("descricao");
                boolean status = resultSet.getBoolean("status");
                System.out.println("Tarefa encontrada:");
                System.out.println("ID: " + taskId);
                System.out.println("Título: " + title);
                System.out.println("Descrição: " + description);
                System.out.println("Status: " + status);
            } else {
                System.out.println("Tarefa não encontrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // EXIBIR TODAS AS TAREFAS
    public void exibirTodasTarefas() {
        try {
            Connection connection = bdManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tarefas");

            // EXIBE TAREFAS ENCONTRADAS
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String titulo = resultSet.getString("titulo");
                String descricao = resultSet.getString("descricao");

                System.out.println("ID: " + id);
                System.out.println("Título: " + titulo);
                System.out.println("Descrição: " + descricao);
                System.out.println("----------------------");
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //ENCERRANDO A CONEXAO
    public void encerrarConexao() {
        bdManager.closeConnection();
    }
}
