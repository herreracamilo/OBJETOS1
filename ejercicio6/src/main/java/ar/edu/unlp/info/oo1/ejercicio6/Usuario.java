package ar.edu.unlp.info.oo1.ejercicio6;


import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String domicilio;
	private ArrayList<Consumo> historialConsumos;
	
	public Usuario(String unNombre, String unDomicilio) {
		this.nombre = unNombre;
		this.domicilio = unDomicilio;
		this.historialConsumos = new ArrayList<Consumo>();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public Consumo getUltimoConsumo() {
		if (!historialConsumos.isEmpty()){
			return historialConsumos.get(historialConsumos.size()-1);
		}else return null;
	
	}
	
}
