package Modelo;

public class Persona {

	
	private String identificacion; 
	private String nombre;
	private String direccion;
	private String telefono;
	private String email;
	
	public Persona() {
		this.identificacion = null;
		this.nombre = null;
		this.direccion = null;
		this.telefono = null;
		this.email = null;
	}
	
	public Persona(String identificacion, String nombre, String direccion,
			String telefono, String email) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return identificacion + "\t\t"+ nombre + "\t\t" + direccion + "\t\t"+  telefono  + "\t\t"+ email;
		/*return "Persona [identificacion=" + identificacion + ", nombre="
				+ nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + ", email=" + email + "]";*/
	}
	
	
	
}
