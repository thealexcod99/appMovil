package modelo;

public class Invitado {
	private int idInvitado;
	private String fecUltimaConex;
	
	public Invitado(int idInvitado, String fecUltimaConex) {
		this.idInvitado = idInvitado;
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
