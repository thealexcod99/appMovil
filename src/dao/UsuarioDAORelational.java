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
	
	@Override
	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}
	
/* REGISTRADO */
	
	private void rellenarListaRegistrados() {
		Connection conexion = ConexionSQLite.getConexion();
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
	public boolean crearRegistrado(Registrado registrado) {
		// TODO Auto-generated method stub
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
	public boolean eliminarRegistrado(Registrado registrado) {
		// TODO Auto-generated method stub
		return false;
	}
	
/* ADMINISTRADOR */	

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
	
	@Override
	public Invitado getInvitadoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean activarDesactivarInvitado(String activado) {
		// TODO Auto-generated method stub
		return false;
	}

}
