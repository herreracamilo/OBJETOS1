package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {

	String detalle;
	int cantidad;
	double costoUnitario;
	
	public Item(String detalle, int cant, double costoU) {
		this.detalle = detalle;
		this.cantidad = cant;
		this.costoUnitario = costoU;
	}
	
	public double costo() {
		return this.costoUnitario * this.cantidad;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	
}
