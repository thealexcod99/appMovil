package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import dao.UsuarioDAO;
import dao.UsuarioDAORelational;
import modelo.Registrado;
import vista.ModeloTablaRegistrados;
import vista.vistaAniadirRegistrado;
import vista.vistaTablaRegistrados;

public class controladorTablaRegistrados implements ActionListener, MouseListener{
	UsuarioDAORelational usuarioDao;
	vistaTablaRegistrados vistaRegistrados;
	vistaAniadirRegistrado vistaAniadirRegistrado;
	ModeloTablaRegistrados modeloTablaRegistrados;
	int fila_pull;
	
	public controladorTablaRegistrados(UsuarioDAORelational usuarioDao, ModeloTablaRegistrados modelo,vistaAniadirRegistrado vistaAniadirRegistrado, vistaTablaRegistrados vistaRegistrados) {
		this.usuarioDao = usuarioDao;
		this.modeloTablaRegistrados = modelo;
		this.vistaRegistrados = vistaRegistrados;
		this.vistaAniadirRegistrado = vistaAniadirRegistrado;
		this.listarRegistrados();
	}
	
	public void listarRegistrados() {
		modeloTablaRegistrados.setListaRegistrados(usuarioDao.getRegistrados());
		vistaRegistrados.setModelo(modeloTablaRegistrados);
	}
	
	public void eliminarRegistrado() {
		int id = (int) vistaRegistrados.getTabla().getValueAt(fila_pull, 0);
		usuarioDao.eliminarRegistradoById(id);
		modeloTablaRegistrados.actualizar();
	}
	
//	public void aniadirRegistrado() {
//		Registrado registrado = new Registrado(idRegistrado, nombre, apellido, email, password, nick)
//		usuarioDao.crearRegistrado(registrado);
//		modeloTablaRegistrados.actualizar();
//	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = vistaRegistrados.getTabla().rowAtPoint(e.getPoint());
		Registrado registrado = usuarioDao.getRegistradoById((int) vistaRegistrados.getTabla().getValueAt(row, 0));
		fila_pull = row;
		
		vistaAniadirRegistrado.setTextField_nombre(registrado.getNombre());
		vistaAniadirRegistrado.setTextField_apellido(registrado.getApellido());
		vistaAniadirRegistrado.setTextField_email(registrado.getEmail());
		vistaAniadirRegistrado.setTextField_password(registrado.getPassword());
		vistaAniadirRegistrado.setTextField_nick(registrado.getNick());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().contentEquals("CERRAR")) {
			vistaRegistrados.setVisible(false);
		} else {
			if (e.getActionCommand().contentEquals("ANIADIR")) {
				vistaAniadirRegistrado.setVisible(true);
			} else {
				if (e.getActionCommand().contentEquals("ELIMINAR")) {
					this.eliminarRegistrado();
					modeloTablaRegistrados.actualizar();
				} else {
					if (e.getActionCommand().contentEquals("ACTUALIZAR")) {
						vistaAniadirRegistrado.setVisible(true);
					} else {
						if (e.getActionCommand().contentEquals("ACEPTAR")) {
							vistaAniadirRegistrado.setVisible(false);
//							this.aniadirRegistrado();
						}
					}
				}
			}
		}
		
	}
	

}
