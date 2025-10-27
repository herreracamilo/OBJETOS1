package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements PoliticaCancelacion{

	@Override
	public double calcularReembolso(Reserva reserva, LocalDate fechaCancela) {
		int diasAntes = (int) ChronoUnit.DAYS.between(fechaCancela, reserva.getPeriodo().getFrom());
		if(diasAntes >= 7) return reserva.calcularPrecio();
		if(diasAntes >= 2) return reserva.calcularPrecio() * 0.5;
		return 0;
	}
	
}
