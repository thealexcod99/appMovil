package dao;

import java.util.List;

import modelo.Contacto;

public interface ContactoDAO {
	List<Contacto> getListaContactos();
	boolean crearContacto(Contacto contacto);
	Contacto getContactoById();
//	boolean actualizarContacto(Contacto contacto);
	boolean eliminarContacto(Contacto contacto);
}
