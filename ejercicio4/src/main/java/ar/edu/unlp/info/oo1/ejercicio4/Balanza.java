package ar.edu.unlp.info.oo1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	
	List<Producto> productos;
	
	public Balanza(){
		this.productos = new ArrayList<>();
	}
	
	public void ponerEnCero() {
		this.productos.clear();
	}
	
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public List<Producto> getProductos(){
		return  this.productos;
	}
	
	public Ticket emitirTicket() {
		return new Ticket(getCantidadDeProductos(),getPesoTotal(),getPrecioTotal());
	}


	public int getCantidadDeProductos() {
		return this.productos.size();
	}



	public double getPrecioTotal() {
		double precioTotal=0;
		for (Producto produ : this.productos) {
			precioTotal+= produ.getPrecio();
		}
		return precioTotal;
	}



	public double getPesoTotal() {
		double pesoTotal=0;
		for (Producto produ : this.productos) {
			pesoTotal+= produ.getPeso();
		}
		return pesoTotal;
	}

	
	
}
