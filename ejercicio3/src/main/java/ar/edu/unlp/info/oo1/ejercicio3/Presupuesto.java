package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Presupuesto {

	LocalDate fecha;
	String cliente;
	List<Item> items;
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Item item : this.items) {
			total += item.costo();
		}
		return total;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
}
