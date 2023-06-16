package gabriel.mac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteBD {

	//ACESSANDO O BD
	private static final String JDBC_Driver = "org.mariadb.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/bancoteste";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "Teste@BDMac";
	
	public static void main(String[] args) {
		
		System.out.println("Teste de Banco de Dados");
		
		//LOCALIZAR O DRIVER DA MARIA DB
		try {
			Class.forName(JDBC_Driver);
			Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			//System.out.println("Driver OK");
			
			/*
			PreparedStatement stm2 = con.prepareStatement("CREATE TABLE teste (id INT PRIMARY KEY,\n"
					+ "  nome VARCHAR(50),\n"
					+ "  idade INT)"); 
			
			stm2.executeUpdate();
			System.out.println("CRIADO com sucesso");
			*/
			
			//INSERINDO -------
			/*
			PreparedStatement stm = con.prepareStatement("INSERT INTO teste (id, nome, idade)"
					+ "VALUES (5, 'Gabriela', 27),\n"
					+ "       (6, 'Wyldner', 31),\n"
					+ "       (7, 'Paulo', 34);"); 
			
			stm.executeUpdate();
			System.out.println("Inserido com sucesso");
			*/
			
			//CONSULTANDO
			System.out.println("================================================================");
			PreparedStatement stmcons = con.prepareStatement("SELECT * FROM teste;");
			ResultSet rs = stmcons.executeQuery();
			System.out.println("produtos do BD");

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				int idade = rs.getInt("idade");
				System.out.println("Id: " + id + " nome: " + nome + " idade: " + idade);
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver nao encontrado");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Falha na Conexao com o Banco de Dados");
			e.printStackTrace();
		}
	}
}
