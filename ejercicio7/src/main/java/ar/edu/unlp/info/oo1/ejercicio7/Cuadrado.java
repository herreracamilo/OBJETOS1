package ar.edu.unlp.info.oo1.ejercicio7;

public class Cuadrado implements Figura2D {
	
	double lado;

	
	public void setLado(double valor) {
		this.lado = valor;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getPerimetro() {
		return this.lado * 4;
	}
	
	public double getArea() {
		return Math.pow(this.lado, 2);
	}
}
