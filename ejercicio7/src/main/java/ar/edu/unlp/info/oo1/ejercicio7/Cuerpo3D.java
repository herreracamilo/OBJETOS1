package ar.edu.unlp.info.oo1.ejercicio7;

public class Cuerpo3D {
	
	Figura2D caraBasal;
	double altura;
	
	
	public void setAltura(double valor) {
		this.altura = valor;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura2D cara) {
		this.caraBasal = cara;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea() * getAltura();
	}
	
	public double getSuperficieExterior(){
		return (2 * this.caraBasal.getArea()) + (this.caraBasal.getPerimetro() * getAltura());
	}
	
}
