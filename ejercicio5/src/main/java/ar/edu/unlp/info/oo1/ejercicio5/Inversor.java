package ar.edu.unlp.info.oo1.ejercicio5;

import java.util.ArrayList; 
import java.util.List;

public class Inversor {
	
	private List <Inversion> listaAcciones;


	public Inversor() {
		listaAcciones = new ArrayList<Inversion>();
	}
	
	public void agregarInversion(Inversion unaInversion) {
		this.listaAcciones.add(unaInversion);
	}
	
	public void eliminarInversion(Inversion unaInversion) {
		this.listaAcciones.remove(unaInversion);
	}
	
	public double valorTotalActual() {
		double valor = 0;
		for (Inversion inv: listaAcciones) {
			valor+=inv.valorActual();
		}
		return valor;
	}

}