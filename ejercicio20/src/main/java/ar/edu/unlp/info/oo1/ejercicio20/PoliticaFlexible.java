package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaCancelacion{

	@Override
	public double calcularReembolso(Reserva reserva, LocalDate fechaCancela) {
		return reserva.calcularPrecio();
	}

}
