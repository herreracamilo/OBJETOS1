package ar.edu.unlp.info.oo1.ejercicio5;

public class Acciones implements Inversion{
	private String nombre;
	private double valorUnitario;
	private int cantAcciones;

	public Acciones(String unNombre, double unValorUnitario, int unaCantidad) {
		this.nombre = unNombre;
		this.valorUnitario = unValorUnitario;
		this.cantAcciones = unaCantidad;
	}

	public double valorActual() {
		return this.valorUnitario * this.cantAcciones;
	}
}
