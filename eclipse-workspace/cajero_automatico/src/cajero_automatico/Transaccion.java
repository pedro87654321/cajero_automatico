package cajero_automatico;

public class Transaccion extends Banco{
	 
	double retiro=0;
	double deposito=0;
	int transaccion=0;
	String transaccion_2=null;
	
	public Transaccion(String nombre_cajero, double numero_cajero, String usuario, String clave, int tipo_persona,
			String tipo_persona_2, int tipo_trajeta, String tipo_tarjeta_2, double numero_tarjeta, String banco,
			double numero_cuenta, double saldo_disponible, double retiro, double deposito, int transaccion,
			String transaccion_2) {
		super(nombre_cajero, numero_cajero, usuario, clave, tipo_persona, tipo_persona_2, tipo_trajeta, tipo_tarjeta_2,
				numero_tarjeta, banco, numero_cuenta, saldo_disponible);
		this.retiro = retiro;
		this.deposito = deposito;
		this.transaccion = transaccion;
		this.transaccion_2 = transaccion_2;
	}

	public double getRetiro() {
		return retiro;
	}

	public void setRetiro(double retiro) {
		this.retiro = retiro;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public int getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(int transaccion) {
		this.transaccion = transaccion;
	}

	public String getTransaccion_2() {
		return transaccion_2;
	}

	public void setTransaccion_2(String transaccion_2) {
		this.transaccion_2 = transaccion_2;
	}
}
