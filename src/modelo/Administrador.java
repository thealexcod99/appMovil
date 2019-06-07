package modelo;

public class Administrador extends Usuario {
	private int idAdministrador;
	private String fecUltimaConex;

	public Administrador(int idAdministrador, String nombre, String apellido, String email, String password,
		String fecUltimaConex) {
		super(idAdministrador, nombre, apellido, email, password);
		this.fecUltimaConex = fecUltimaConex;
	}

	public String getFecUltimaConex() {
		return fecUltimaConex;
	}

	public void setFecUltimaConex(String fecUltimaConex) {
		this.fecUltimaConex = fecUltimaConex;
	}

	public int getIdAdministrador() {
		return idAdministrador;
	}

	@Override
	public String toString() {
		return "Administrador [idAdministrador=" + idAdministrador + ", fecUltimaConex=" + fecUltimaConex + "]";
	}
	

}
