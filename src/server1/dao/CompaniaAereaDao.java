package server1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import server1.dao.ConnectionFactory;
import server1.model.Voo;

public class CompaniaAereaDao {
	private Connection connection;
	
	public CompaniaAereaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public List<Voo> getListaVoos() {
        try {
            List<Voo> listaVoos = new ArrayList<Voo>();
            PreparedStatement stmt = this.connection.
                    prepareStatement("select * from voo");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Voo
                Voo voo = new Voo();
                //voo.setId(rs.getLong("id"));
                voo.setOrigem(rs.getString("origem"));
                voo.setDestino(rs.getString("destino"));
                voo.setPreco(rs.getFloat("preco"));

                // montando a data através do Calendar
                Calendar data_voo = Calendar.getInstance();
                data_voo.setTime(rs.getDate("data_voo"));
                voo.setData_voo(data_voo);
                
                voo.setCapacidade(rs.getInt("capacidade"));

                // adicionando o objeto à lista
                listaVoos.add(voo);
            }
            rs.close();
            stmt.close();
            return listaVoos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
