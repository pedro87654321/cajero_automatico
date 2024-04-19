package cajero_automatico;

public class Banco extends Tarjeta{
	
    String banco=null;
    double numero_cuenta=0;
    double saldo_disponible=0;
    
	public Banco(String nombre_cajero, double numero_cajero, String usuario, String clave, int tipo_persona,
			String tipo_persona_2, int tipo_trajeta, String tipo_tarjeta_2, double numero_tarjeta, String banco,
			double numero_cuenta, double saldo_disponible) {
		super(nombre_cajero, numero_cajero, usuario, clave, tipo_persona, tipo_persona_2, tipo_trajeta, tipo_tarjeta_2,
				numero_tarjeta);
		this.banco = banco;
		this.numero_cuenta = numero_cuenta;
		this.saldo_disponible = saldo_disponible;
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public double getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(double numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public double getSaldo_disponible() {
		return saldo_disponible;
	}
	public void setSaldo_disponible(double saldo_disponible) {
		this.saldo_disponible = saldo_disponible;
	}
}
