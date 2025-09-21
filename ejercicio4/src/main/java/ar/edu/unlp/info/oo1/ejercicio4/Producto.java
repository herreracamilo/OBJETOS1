package ar.edu.unlp.info.oo1.ejercicio4;

public class Producto {
	
	double peso;
	double precioPorKilo;
	String descripcion;
	
	public Producto(String unaDesc ,double unPeso, double unPrecioPorKilo) {
		this.peso = unPeso;
		this.precioPorKilo = unPrecioPorKilo;
		this.descripcion = unaDesc;
	}
	
	public double getPrecio() {
		return this.precioPorKilo * this.peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Producto [peso=" + peso + ", precioPorKilo=" + precioPorKilo + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
