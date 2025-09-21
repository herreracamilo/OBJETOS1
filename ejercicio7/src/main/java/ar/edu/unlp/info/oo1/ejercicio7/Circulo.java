package ar.edu.unlp.info.oo1.ejercicio7;

public class Circulo implements Figura2D{
	
	double pi = Math.PI;
	double diametro;
	double radio;
	double perimetro;
	double area;
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	public void setDiametro(double valor) {
		this.diametro = valor;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double valor) {
		this.radio = valor;
	}
	
	public double getPerimetro() {
		return pi * getDiametro();
	}
	
	public double getArea() {
		return pi * Math.pow(getRadio(), 2);
	}
}
