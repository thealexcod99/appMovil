package modelo;

public class Contacto {
	private int idContacto;
	private String nombre;
	private String apellido;
	private String email;
	private String direccion;
	private String telefono;
	private int idLibreta;
	
	public Contacto(int idContacto, String nombre, String apellido, String email, String direccion, String telefono,
			int idLibreta) {
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.idLibreta = idLibreta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdContacto() {
		return idContacto;
	}

	public int getIdLibreta() {
		return idLibreta;
	}

	@Override
	public String toString() {
		return "Contacto [idContacto=" + idContacto + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
				+ email + ", direccion=" + direccion + ", telefono=" + telefono + ", idLibreta=" + idLibreta + "]";
	}
	
	

}
