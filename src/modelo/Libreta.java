package modelo;

import java.util.ArrayList;

public class Libreta {
	private int idLibreta;
	private String nombre;
	private int idRegistrado;
	private ArrayList<Contacto> listaContactos;

	public Libreta(int idLibreta, String nombre, int idRegistrado, ArrayList<Contacto> listaContactos) {
		this.idLibreta = idLibreta;
		this.nombre = nombre;
		this.idRegistrado = idRegistrado;
		this.listaContactos = new ArrayList<>(listaContactos);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdLibreta() {
		return idLibreta;
	}

	public int getIdRegistrado() {
		return idRegistrado;
	}

	@Override
	public String toString() {
		return "Libreta [idLibreta=" + idLibreta + ", nombre=" + nombre + ", idRegistrado=" + idRegistrado + "]";
	}
	

}
