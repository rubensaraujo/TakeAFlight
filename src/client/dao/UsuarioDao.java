package client.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import client.model.Usuario;

public class UsuarioDao {
	private Connection connection;

	public UsuarioDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

	public void adiciona(Usuario usuario) {
	     String sql = "insert into usuario " +
	             "(nome,sobrenome,dataNascimento,cpf,senha)" +
	             " values (?,?,?,?,?)";

	     try {
	         // prepared statement para inserção
	         PreparedStatement stmt = connection.prepareStatement(sql);

	         // seta os valores
	         stmt.setString(1,usuario.getNome());
	         stmt.setString(2,usuario.getSobrenome());
	         stmt.setDate(3, new Date(usuario.getDataNascimento().getTimeInMillis()));
	         stmt.setString(4,usuario.getCpf());
	         stmt.setString(5, usuario.getSenha());

	         // executa
	         stmt.execute();
	         stmt.close();
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }

}
