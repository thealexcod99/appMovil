package gui;

import controlador.controladorTablaRegistrados;
import dao.UsuarioDAORelational;
import vista.ModeloTablaRegistrados;
import vista.vistaTablaRegistrados;

public class Gui {

	public static void main(String[] args) {
		UsuarioDAORelational usuarioDao = new UsuarioDAORelational();
		ModeloTablaRegistrados modeloTablaRegistrados = new ModeloTablaRegistrados();
		controladorTablaRegistrados controladorRegistrados = new controladorTablaRegistrados(usuarioDao, modeloTablaRegistrados);
		vistaTablaRegistrados vistaRegistrados = new vistaTablaRegistrados();
		vistaRegistrados.setVisible(true);
	}

}
