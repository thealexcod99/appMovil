package modelo;

public class Invitado extends Usuario {
	private int idInvitado;
	private String fecUltimaConex;
	
	

	public Invitado(int idInvitado, String nombre, String apellido, String email, String password,
			String fecUltimaConex) {
		super(idInvitado, nombre, apellido, email, password);
		this.fecUltimaConex = fecUltimaConex;
	}

	public String getFecUltimaConex() {
		return fecUltimaConex;
	}

	public void setFecUltimaConex(String fecUltimaConex) {
		this.fecUltimaConex = fecUltimaConex;
	}

	public int getIdInvitado() {
		return idInvitado;
	}

	@Override
	public String toString() {
		return "Invitado [idInvitado=" + idInvitado + ", fecUltimaConex=" + fecUltimaConex + "]";
	}
	
	

}
