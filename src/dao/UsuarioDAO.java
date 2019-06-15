package dao;

import java.util.List;

import modelo.Administrador;
import modelo.Invitado;
import modelo.Registrado;
import modelo.Usuario;

public interface UsuarioDAO {
	List<Usuario> getUsuarios();

	/* Registrado */
	List<Registrado> getRegistrados();
	boolean crearRegistrado(Registrado registrado);
	Registrado getRegistradoById(int id);
//	boolean actualizarRegistrado(Registrado registrado);
	boolean eliminarRegistrado(Registrado registrado);
	/* Administrador */
	List<Administrador> getAdministradores();
	boolean crearAdministrador(Administrador registrado);
	Registrado getAdministradorById(int id);
//	boolean actualizarAdministrador(Administrador registrado);
	boolean eliminarAdministrador(Administrador registrado);
	/* Invitado */
	Invitado getInvitado();
	boolean activarDesactivarInvitado(String activado);
}
