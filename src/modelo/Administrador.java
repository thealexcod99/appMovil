package modelo;

public class Administrador {
	private int idAdministrador;
	private String fecUltimaConex;
	
	public Administrador(int idAdministrador, String fecUltimaConex) {
		this.idAdministrador = idAdministrador;
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
