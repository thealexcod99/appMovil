package vista;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import modelo.Registrado;

public class ModeloTablaRegistrados extends AbstractTableModel {
	private List<Registrado> listaRegistrados;
	private String[] nombreColumnas;
	
	public ModeloTablaRegistrados() {
		// TODO Auto-generated constructor stub
		nombreColumnas = new String[] {"ID","NOMBRE","APELLIDO","EMAIL","NICK"};
	}
	
	public void setListaRegistrados(List<Registrado> lista) {
		listaRegistrados = lista;
	}
	
	public void addRegistrado(Registrado registrado) {
		listaRegistrados.add(registrado);
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return nombreColumnas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listaRegistrados.size();
	}

	@Override
	public Object getValueAt(int fila, int columna) {
		switch (columna) {
		case 0:
			return listaRegistrados.get(fila).getIdRegistrado();
			
		case 1:
			return listaRegistrados.get(fila).getNombre();
			
		case 2:
			return listaRegistrados.get(fila).getApellido();
			
		case 3:
			return listaRegistrados.get(fila).getEmail();
			
		case 4:
			return listaRegistrados.get(fila).getNick();

		default:
			return null;
		}
	}
	
	@Override
	public void setValueAt(Object registrado, int fila, int columna) {
		switch (columna) {
		case 0:
			listaRegistrados.get(fila).getIdRegistrado();
			break;
			
		case 1:
			listaRegistrados.get(fila).setNombre(registrado.toString());
			break;

		case 2:
			listaRegistrados.get(fila).setApellido(registrado.toString());
			break;

		case 3:
			listaRegistrados.get(fila).setEmail(registrado.toString());
			break;

		case 4:
			listaRegistrados.get(fila).setNick(registrado.toString());
			break;

		default:
			break;
		}
		this.fireTableCellUpdated(fila, columna);
		this.fireTableRowsUpdated(fila, columna);
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void actualizar() {
		this.fireTableDataChanged();
	}

}
