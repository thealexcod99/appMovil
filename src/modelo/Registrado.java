package modelo;

public class Registrado {
	private int idRegistrado;
	private String nick;
	
	public Registrado(int idRegistrado, String nick) {
		this.idRegistrado = idRegistrado;
		this.nick = nick;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getIdRegistrado() {
		return idRegistrado;
	}

	@Override
	public String toString() {
		return "Registrado [idRegistrado=" + idRegistrado + ", nick=" + nick + "]";
	}
	

}
