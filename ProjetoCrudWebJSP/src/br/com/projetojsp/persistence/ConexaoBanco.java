package br.com.projetojsp.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

	public static Connection getConexao() throws SQLException {
		try {

			Class.forName("org.postgresql.Driver");
			System.out.println("conectado ao banco");
			return DriverManager.getConnection("jdbc:postgresql:bdAulaWebCrudjsp", "postgres", "123456");

		} catch (Exception ex) {
			throw new SQLException(ex.getMessage());

		}
	}

}
