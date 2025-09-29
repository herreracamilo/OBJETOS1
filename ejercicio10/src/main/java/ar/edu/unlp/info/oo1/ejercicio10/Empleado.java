package ar.edu.unlp.info.oo1.ejercicio10;

public class Empleado {
	private String nombre;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public double aportes() {
		return 13500;
	}
	
	public double montoBasico() {
		return 3500;
	}
	
	public double sueldoBasico() {
		return this.montoBasico() + this.aportes();
	}
}
