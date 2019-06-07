package modelo;

public class Registrado extends Usuario {
	private int idRegistrado;
	private String nick;

	public Registrado(int idRegistrado, String nombre, String apellido, String email, String password,
			String nick) {
		super(idRegistrado, nombre, apellido, email, password);
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
