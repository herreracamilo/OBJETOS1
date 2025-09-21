package ar.edu.unlp.info.oo1.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	
	private double valorInicial;
	private LocalDate fecha;
	private double porcentaje;

	public PlazoFijo(double unValorInicial, double unPorcentaje) {
		this.fecha = LocalDate.now();
		this.valorInicial = unValorInicial;
		this.porcentaje = unPorcentaje;
	}
	
	
	public double valorActual() {
		double interesDiario = (this.porcentaje / 100) / 365;
		long diasTotales = ChronoUnit.DAYS.between(this.fecha, LocalDate.now());
		double interesesGenerados = this.valorInicial * interesDiario * diasTotales;
		return this.valorInicial + interesesGenerados;

	}
}
