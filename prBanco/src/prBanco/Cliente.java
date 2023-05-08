package prBanco;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String estado;
	
	public Cliente(String nombre, String apellidos, String estado) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
