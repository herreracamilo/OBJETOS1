package ar.edu.unlp.info.oo1.ejercicio6;

import java.time.LocalDate;

public class Factura {
	private Usuario user;
	private LocalDate fechaEmision;
	private double bonificacion;
	private double montoFinal;
	
	
	public Factura(Usuario user, CuadroTarifario tarifa) {
		this.user = user;
		this.fechaEmision = LocalDate.now();
		this.calcularFactura(tarifa);
	}
	
	private void calcularFactura(CuadroTarifario tarifa) {
		Consumo ultConsumo = user.getUltimoConsumo();
		double costo = ultConsumo.geteActiva() * tarifa.getPrecioKWH();
		if(ultConsumo.factorDePotencia() > 0.8) {
			this.bonificacion = costo * 0.10;
		}else this.bonificacion= 0;
		this.montoFinal = costo - this.bonificacion;
		
	}

	public Usuario getUser() {
		return user;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public double getBonificacion() {
		return bonificacion;
	}

	public double getMontoFinal() {
		return montoFinal;
	}

	
	
}
