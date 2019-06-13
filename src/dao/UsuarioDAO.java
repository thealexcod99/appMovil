package dao;

import java.util.List;

import modelo.Administrador;
import modelo.Invitado;
import modelo.Registrado;
import modelo.Usuario;

public interface UsuarioDAO {
	List<Usuario> getUsuarios();

	/* Registrado */
	boolean crearRegistrado(Registrado registrado);
	Registrado getRegistradoById(int id);
//	boolean actualizarRegistrado(Registrado registrado);
	boolean eliminarRegistrado(Registrado registrado);
	/* Administrador */
	boolean crearAdministrador(Administrador registrado);
	Registrado getAdministradorById(int id);
//	boolean actualizarAdministrador(Administrador registrado);
	boolean eliminarAdministrador(Administrador registrado);
	/* Invitado */
	Invitado getInvitadoById(int id);
	boolean activarDesactivarInvitado(String activado);
}
