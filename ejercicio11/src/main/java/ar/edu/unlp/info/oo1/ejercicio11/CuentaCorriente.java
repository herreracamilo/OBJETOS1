package ar.edu.unlp.info.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta{
	private double limiteDescubierto;
	
	public CuentaCorriente() {
		super();
		this.limiteDescubierto = 0;
	}

	@Override
	protected boolean puedeExtraer(double unMonto) {
		if((this.getSaldo() - unMonto) >= (-limiteDescubierto)) { // uso el -limiteDescubierto para que compare con negativos
			return true;
		}
		return false;
	}

	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}
	
	
	
}
