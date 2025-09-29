package ar.edu.unlp.info.oo1.ejercicio10;

public class EmpleadoJerarquico extends Empleado{
	
	public EmpleadoJerarquico(String nombre) {
		super(nombre);
	}


	public double bonoPorCategoria() {
		return 8000;
	}
	
	
	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
	public double montoBasico() {
		return 4500;
	}
}
