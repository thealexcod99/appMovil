package modelo;

public class Nota {
	private int idNota;
	private String asunto;
	private String descripcion;
	private String fecCreacion;
	private String fecModificacion;
	private int idUsuario;
	
	public Nota(int idNota, String asunto, String descripcion, String fecCreacion, String fecModificacion,
			int idUsuario) {
		this.idNota = idNota;
		this.asunto = asunto;
		this.descripcion = descripcion;
		this.fecCreacion = fecCreacion;
		this.fecModificacion = fecModificacion;
		this.idUsuario = idUsuario;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFecCreacion() {
		return fecCreacion;
	}

	public void setFecCreacion(String fecCreacion) {
		this.fecCreacion = fecCreacion;
	}

	public String getFecModificacion() {
		return fecModificacion;
	}

	public void setFecModificacion(String fecModificacion) {
		this.fecModificacion = fecModificacion;
	}

	public int getIdNota() {
		return idNota;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	@Override
	public String toString() {
		return "Nota [idNota=" + idNota + ", asunto=" + asunto + ", descripcion=" + descripcion + ", fecCreacion="
				+ fecCreacion + ", fecModificacion=" + fecModificacion + ", idUsuario=" + idUsuario + "]";
	}
	

}
