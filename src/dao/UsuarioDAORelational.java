package dao;

import java.util.List;

import modelo.Administrador;
import modelo.Invitado;
import modelo.Registrado;
import modelo.Usuario;

public class UsuarioDAORelational implements UsuarioDAO{

	@Override
	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}
	
/* REGISTRADO */
	
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
