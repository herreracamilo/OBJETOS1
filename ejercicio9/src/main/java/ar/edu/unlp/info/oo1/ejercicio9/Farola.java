package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.ArrayList;

public class Farola {
	private boolean estado;
	private ArrayList<Farola> vecinos;
	
	public Farola() {
		this.estado = false;
		this.vecinos = new ArrayList<Farola>();
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. 
	* La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		if(!this.vecinos.contains(otraFarola)) {
			this.vecinos.add(otraFarola);
			otraFarola.vecinos.add(this);
		}
	}

	
	/*
	* Retorna sus farolas vecinas
	*/
	public ArrayList<Farola> getNeighbors (){
		return this.vecinos;
	}
	
	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(!this.estado) {
			this.estado = true;
			for(Farola farola : vecinos) {
				farola.estado = true;
			}
		}
	}
	
	
	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.estado) {
			this.estado = false;
			for(Farola farola : vecinos) {
				farola.estado = false;
			}
		}
	}

	
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		if(this.estado) {
			return true;
		}
		return false;
	}
	/*
	* Retorna true si la farola está apagada.
	*/
	public boolean isOff() {
		if(!this.estado) {
			return true;
		}
		return false;
	}


}
