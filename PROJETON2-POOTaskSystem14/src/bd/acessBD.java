package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class acessBD {

    // ACESSANDO O BD
    private static final String JDBC_Driver = "org.mariadb.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/bdTaskSystem";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "Teste@BDMac";
    private Connection connection;

    //ACESSANDO O BANCO
    public acessBD() {
        try {
            Class.forName(JDBC_Driver);
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
            System.out.println("Conexão com o banco de dados estabelecida.");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Falha na Conexão com o Banco de Dados.");
            e.printStackTrace();
        }
    }

    //RETORNANDO CONEXAO COM O BANCO
    public Connection getConnection() {
        return connection;
    }

    //FECHANDO CONEXAO COM O BANCO
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexão com o banco de dados encerrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //EXIBINDO O TESTE COM O BANCO
    public static void main(String[] args) {
        System.out.println("Teste de Banco de Dados");

        acessBD db = new acessBD();
        Connection con = db.getConnection();

        if (con != null) {
            System.out.println("Driver OK");
        }

        db.closeConnection();
    }

}
