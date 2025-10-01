package ar.edu.unlp.info.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta{	

	protected boolean puedeExtraer(double unMonto) {
		double montoMasCosto = unMonto * 1.02; // le agrego el 2% al monto que quiero extraer
		if(this.getSaldo() >= montoMasCosto) {
			return true;
		}
		return false;
	}
	
	public void depositar(double unMonto) {
		double descuento = unMonto * 0.02; // le saco 2% a lo que quiero meter
		double montoConDescuento = unMonto - descuento;
		super.depositar(montoConDescuento);
	}
	
	public boolean extraer(double unMonto) {
		double montoMasCosto = unMonto * 1.02; // le agrego el 2% al monto que quiero extraer
		if(this.puedeExtraer(unMonto)) {
			this.extraerSinControlar(montoMasCosto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double unMonto, Cuenta cuentaDestino) {
		double montoMasCosto = unMonto * 1.02; // le agrego el 2% al monto que quiero transferir
		if(this.puedeExtraer(unMonto)) {
			this.extraerSinControlar(montoMasCosto);
			cuentaDestino.depositar(unMonto);
			return true;
		}
		return false;
	}
	

}
