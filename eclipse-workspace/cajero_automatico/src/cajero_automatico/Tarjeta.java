package cajero_automatico;

public class Tarjeta extends Cliente{
  
	int tipo_trajeta=0;
	String tipo_tarjeta_2=null;
	double numero_tarjeta=0;
    
	public Tarjeta(String nombre_cajero, double numero_cajero, String usuario, String clave, int tipo_persona,
			String tipo_persona_2, int tipo_trajeta, String tipo_tarjeta_2, double numero_tarjeta) {
		super(nombre_cajero, numero_cajero, usuario, clave, tipo_persona, tipo_persona_2);
		this.tipo_trajeta = tipo_trajeta;
		this.tipo_tarjeta_2 = tipo_tarjeta_2;
		this.numero_tarjeta = numero_tarjeta;
	}
	
	public int getTipo_trajeta() {
		return tipo_trajeta;
	}
	public void setTipo_trajeta(int tipo_trajeta) {
		this.tipo_trajeta = tipo_trajeta;
	}
	public String getTipo_tarjeta_2() {
		return tipo_tarjeta_2;
	}
	public void setTipo_tarjeta_2(String tipo_tarjeta_2) {
		this.tipo_tarjeta_2 = tipo_tarjeta_2;
	}
	public double getNumero_tarjeta() {
		return numero_tarjeta;
	}
	public void setNumero_tarjeta(double numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}
}
