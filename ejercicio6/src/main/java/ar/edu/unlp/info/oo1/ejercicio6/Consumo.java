package ar.edu.unlp.info.oo1.ejercicio6;

public class Consumo {
	private double eActiva;
	private double eReactiva;
	
	public Consumo(double activa, double reactiva) {
		this.eActiva = activa;
		this.eReactiva = reactiva;
	}
	
	public double geteActiva() {
		return eActiva;
	}
	public void seteActiva(double eActiva) {
		this.eActiva = eActiva;
	}
	public double geteReactiva() {
		return eReactiva;
	}
	public void seteReactiva(double eReactiva) {
		this.eReactiva = eReactiva;
	}
	
	public double factorDePotencia() {
	    return this.eActiva / Math.sqrt(Math.pow(this.eActiva, 2) + Math.pow(this.eReactiva, 2));
	}
	
	public double consumo(double precioKWH) {
		return this.eActiva * precioKWH;
	}
	
}
