package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;

public class Reserva {
	private Usuario usuario;
    private Propiedad propiedad;
    private DateLapse periodo;

    public Reserva(Usuario u, Propiedad p, DateLapse peri) {
    	this.usuario = u;
    	this.propiedad = p;
    	this.periodo = peri;
    }
    
    public double calcularPrecio() {
        return periodo.sizeInDays() * propiedad.getPrecioPorNoche();
    }

    public boolean estaEnCurso(LocalDate hoy) {
        return periodo.includes(hoy);
    }

    public DateLapse getPeriodo() {
        return periodo;
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}
    
    
}
