package cajero_automatico;

public class Cajero {

	String nombre_cajero=null;
	double numero_cajero=0;
	
	public Cajero(String nombre_cajero, double numero_cajero) {
		super();
		this.nombre_cajero = nombre_cajero;
		this.numero_cajero = numero_cajero;
	}

	public String getNombre_cajero() {
		return nombre_cajero;
	}

	public void setNombre_cajero(String nombre_cajero) {
		this.nombre_cajero = nombre_cajero;
	}

	public double getNumero_cajero() {
		return numero_cajero;
	}

	public void setNumero_cajero(double numero_cajero) {
		this.numero_cajero = numero_cajero;
	}
	
}
