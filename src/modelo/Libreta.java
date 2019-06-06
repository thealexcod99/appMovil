package modelo;

public class Libreta {
	private int idLibreta;
	private String nombre;
	private int idRegistrado;
	
	public Libreta(int idLibreta, String nombre, int idRegistrado) {
		this.idLibreta = idLibreta;
		this.nombre = nombre;
		this.idRegistrado = idRegistrado;
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
