package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;

public class EjemploDAO {

	private Connection conexion;

	public EjemploDAO () {
		try {
			conexion =  Conexion.getConexion();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo de conexión no encontrado");
//			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Ejemplo> obtenerTodasLasPersonas(){
		List<Ejemplo> lista = new ArrayList<>();
		String sql = "SELECT * FROM persona;";
		try (Statement sentencia = conexion.createStatement();
				ResultSet resultado = sentencia.executeQuery(sql);)
		{
			while (resultado.next())
				lista.add(new Ejemplo(resultado.getInt("id"), resultado.getString("first_name"),
						resultado.getString("last_name"), resultado.getString("email")));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public Ejemplo obtenerPersonaPorEmail(String email) {
		// SELECT * FROM persona WHERE email = 'ksimkinrf@elpais.com';
		Ejemplo persona = new Ejemplo();
		String sql = "SELECT * FROM persona WHERE email = ?;";
		try (PreparedStatement psStatement = conexion.prepareStatement(sql);){
			psStatement.setString(1, email);
			ResultSet rsSet = psStatement.executeQuery();
			while (rsSet.next())
				persona = new  Ejemplo(rsSet.getInt("id"),
						rsSet.getString("first_name"), rsSet.getString("last_name"),
						rsSet.getString("email"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return persona;
	}

	public boolean borrarPersona(String email) {
		int rows = 0;
		String sql = "DELETE FROM persona WHERE email = ?;";
		try (PreparedStatement psStatement = conexion.prepareStatement(sql);){
			psStatement.setString(1, email);
			rows = psStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows != 0;
	}

	public boolean actualizarPersona(int id, String email) {
		int rows = 0;
		String sql = "UPDATE persona SET email = ? WHERE id = ?;";
		try (PreparedStatement psStatement = conexion.prepareStatement(sql);){
			psStatement.setString(1, email);
			psStatement.setInt(2, id);
			rows = psStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows != 0;
	}

	public boolean insertarPersona(Ejemplo persona) {
		int rows = 0;
		String sql = "INSERT INTO persona VALUES (?, ?, ?, ?);";
		try (PreparedStatement psStatement = conexion.prepareStatement(sql);){
			psStatement.setInt(1, persona.getId());
			psStatement.setString(2, persona.getFirstName());
			psStatement.setString(3, persona.getLastName());
			psStatement.setString(4, persona.getEmail());
			rows = psStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows != 0;
	}

}