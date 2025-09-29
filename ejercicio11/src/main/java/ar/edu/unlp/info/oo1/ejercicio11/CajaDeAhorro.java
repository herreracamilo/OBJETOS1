package ar.edu.unlp.info.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta{
	private double saldo;
	
	

	protected boolean puedeExtraer(double unMonto) {
		double montoMasCosto = unMonto * 1.02; // le agrego el 2% al monto que quiero extraer
		if(this.getSaldo() >= montoMasCosto) {
			return true;
		}
		return false;
	}
	
	public void depositar(double unMonto) {
		double descuento = unMonto * 0.02;
		double montoConDescuento = unMonto - descuento;
		super.depositar(montoConDescuento);
	}
	
	

}
