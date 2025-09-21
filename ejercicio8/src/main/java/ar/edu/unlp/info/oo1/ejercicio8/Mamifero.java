package ar.edu.unlp.info.oo1.ejercicio8;


import java.util.Date;

public class Mamifero {
	
	private String nombre;
	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String nombre) {
		this.nombre = nombre;
	}
	public Mamifero() {
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(String id) {
		this.identificador = id;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
		
	}
	
	public Mamifero getAbueloMaterno() {
	    if (this.madre != null) {
	        return this.madre.getPadre();
	    }
	    return null;
	}

	
	public Mamifero getAbuelaMaterna() {
		if(this.madre != null) {
			return this.madre.getMadre();
		}
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.padre != null) {
			return this.padre.getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.padre != null) {
			return this.padre.getMadre();
		}
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		// yo no puedo ser mi ancestro asi que si unMamifero es igual a mi o es null deveulvo false
		if(unMamifero == null || this.equals(unMamifero)) {
			return false;
		}
		
		// si mi papá es igual a unMamifero o tiene como ancestro a unMamifero devuelvo true
		if(this.padre != null) {
			if(this.padre.equals(unMamifero) || this.padre.tieneComoAncestroA(unMamifero)) {
				return true;
			}
		}
		
		
		// si mi mamá es igual a unMamifero o tiene como ancestro a unMamifero devuelvo true
		if(this.madre != null) {
			if(this.madre.equals(unMamifero) || this.madre.tieneComoAncestroA(unMamifero)) {
				return true;
			}
		}
		
		// si no hay conincidencias devuelvo false
		return false;
	}
	
}
