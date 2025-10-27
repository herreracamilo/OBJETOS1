package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;

public interface PoliticaCancelacion {
	double calcularReembolso(Reserva reserva, LocalDate fechaCancela);
}
