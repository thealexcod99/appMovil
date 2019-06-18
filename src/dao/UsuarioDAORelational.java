package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.ConexionSQLite;
import modelo.Administrador;
import modelo.Invitado;
import modelo.Registrado;
import modelo.Usuario;

public class UsuarioDAORelational implements UsuarioDAO{
	private List<Registrado> listaRegistrados = new ArrayList<>();
	private List<Administrador> listaAdministradores = new ArrayList<>();
	private List<Usuario> listaUsuarios = new ArrayList<>();
	private Invitado invitado;
	
	public UsuarioDAORelational() {
		rellenarListaRegistrados();
		rellenarListaAdministrador();
		rellenarListaUsuarios();
		rellenarInvitado();
	}
	
	private void rellenarListaUsuarios() {
		ConexionSQLite conexionSQLite = new ConexionSQLite();
		Connection conexion = conexionSQLite.getConexion();
		String sql = "SELECT * FROM USUARIO;";
		try (Statement statement = conexion.createStatement();){
			ResultSet rsSet = statement.executeQuery(sql);
			while(rsSet.next()) {
				int idRegistrado = rsSet.getInt("ID_USUARIO");
				String nombre = rsSet.getString("NOMBRE");
				String apellido  = rsSet.getString("APELLIDO");
				String email     = rsSet.getString("EMAIL");
				String password  = rsSet.getString("PASSWORD");
				listaUsuarios.add(
						new Usuario(idRegistrado, nombre, apellido, email, password));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Usuario> getUsuarios() {
		return listaUsuarios;
	}
	
/* REGISTRADO */
	
	private void rellenarListaRegistrados() {
		ConexionSQLite conexionSQLite = new ConexionSQLite();
		Connection conexion = conexionSQLite.getConexion();
		String sql = "SELECT * FROM VISTA_REGISTRADO;";
		try (Statement statement = conexion.createStatement();){
			ResultSet rsSet = statement.executeQuery(sql);
			while(rsSet.next()) {
				int idRegistrado = rsSet.getInt("ID_REGISTRADO");
				String nombre = rsSet.getString("NOMBRE");
				String apellido  = rsSet.getString("APELLIDO");
				String email     = rsSet.getString("EMAIL");
				String password  = rsSet.getString("PASSWORD");
				String nick    = rsSet.getString("NICK");
				listaRegistrados.add(
						new Registrado(idRegistrado, nombre, apellido, email, password, nick));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Registrado> getRegistrados() {
		return listaRegistrados;
	}
	
	@Override
	public boolean crearRegistrado(Registrado registrado) {
		
		return false;
	}

	@Override
	public Registrado getRegistradoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public boolean actualizarRegistrado(Registrado registrado) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean eliminarRegistradoById(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
/* ADMINISTRADOR */	
	
	private void rellenarListaAdministrador() {
		ConexionSQLite conexionSQLite = new ConexionSQLite();
		Connection conexion = conexionSQLite.getConexion();
		String sql = "SELECT * FROM VISTA_ADMINISTRADOR;";
		try (Statement statement = conexion.createStatement();){
			ResultSet rsSet = statement.executeQuery(sql);
			while(rsSet.next()) {
				int idAdministrador = rsSet.getInt("ID_ADMINISTRADOR");
				String nombre = rsSet.getString("NOMBRE");
				String apellido  = rsSet.getString("APELLIDO");
				String email     = rsSet.getString("EMAIL");
				String password  = rsSet.getString("PASSWORD");
				String fecUltimaConex    = rsSet.getString("FEC_ULTIMA_CONEX");
				listaAdministradores.add(
						new Administrador(idAdministrador, nombre, apellido, email, password, fecUltimaConex));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Administrador> getAdministradores() {
		return listaAdministradores;
	}
	
	@Override
	public boolean crearAdministrador(Administrador registrado) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Registrado getAdministradorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public boolean actualizarAdministrador(Administrador registrado) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean eliminarAdministrador(Administrador registrado) {
		// TODO Auto-generated method stub
		return false;
	}

/* INVITADO */
	
	private void rellenarInvitado() {
		ConexionSQLite conexionSQLite = new ConexionSQLite();
		Connection conexion = conexionSQLite.getConexion();
		String sql = "SELECT * FROM VISTA_INVITADO;";
		try (Statement statement = conexion.createStatement();){
			ResultSet rsSet = statement.executeQuery(sql);
			int idInvitado = rsSet.getInt("ID_INVITADO");
			String nombre = rsSet.getString("NOMBRE");
			String apellido  = rsSet.getString("APELLIDO");
			String email     = rsSet.getString("EMAIL");
			String password  = rsSet.getString("PASSWORD");
			String fecUltimaConex    = rsSet.getString("FEC_ULTIMA_CONEX");
			invitado = new Invitado(idInvitado, nombre, apellido, email, password, fecUltimaConex);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public Invitado getInvitado() {
		return invitado;
	}

	@Override
	public boolean activarDesactivarInvitado(String activado) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		UsuarioDAORelational usuarioDao = new UsuarioDAORelational();
		
	}

}
