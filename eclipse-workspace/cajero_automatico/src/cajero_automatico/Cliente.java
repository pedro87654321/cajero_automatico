package cajero_automatico;

public class Cliente extends Cajero{

	String usuario=null;
	String clave=null;
	int tipo_persona=0;
	String tipo_persona_2=null;
	
	public Cliente(String nombre_cajero, double numero_cajero, String usuario, String clave, int tipo_persona,
			String tipo_persona_2) {
		super(nombre_cajero, numero_cajero);
		this.usuario = usuario;
		this.clave = clave;
		this.tipo_persona = tipo_persona;
		this.tipo_persona_2 = tipo_persona_2;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getTipo_persona() {
		return tipo_persona;
	}
	public void setTipo_persona(int tipo_persona) {
		this.tipo_persona = tipo_persona;
	}
	public String getTipo_persona_2() {
		return tipo_persona_2;
	}
	public void setTipo_persona_2(String tipo_persona_2) {
		this.tipo_persona_2 = tipo_persona_2;
	}
}
