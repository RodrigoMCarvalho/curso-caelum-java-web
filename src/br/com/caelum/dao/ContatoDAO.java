package br.com.caelum.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.ConnectionFactory;
import br.com.caelum.modelo.Contato;

public class ContatoDAO {
	
	// a conexão com o banco de dados
    private Connection connection;

    public ContatoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Contato contato) {
        String sql = "insert into contatos " +
                "(nome,email,endereco,dataNascimento)" +
                " values (?,?,?,?)";

        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores de contato
            stmt.setString(1,contato.getNome());
            stmt.setString(2,contato.getEmail());
            stmt.setString(3,contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

            // executa e salva no BD
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
