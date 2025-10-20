package ar.edu.unlp.info.oo1.ejercicio20;

import java.util.List;

public class Usuario {
	   private String nombre;
	    private String direccion;
	    private String dni;
	    private List<Propiedad> propiedades;
	    private List<Reserva> reservas;
	    
	    public Usuario(String n, String d, String dni) {
	    	this.nombre = n;
	    	this.direccion = d;
	    	this.dni = dni;
	    }

	    public void reservar(Propiedad propiedad, DateLapse periodo) {
	        if (propiedad.estaDisponible(periodo)) {
	            Reserva r = new Reserva(this, propiedad, periodo);
	            reservas.add(r);
	            propiedad.agregarReserva(r);
	        }
	    }

	    public double ingresosTotales(DateLapse periodo) {
	        return propiedades.stream()
	            .mapToDouble(p -> p.ingresosEntre(periodo))
	            .sum();
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public List<Propiedad> getPropiedades() {
			return propiedades;
		}

		public void setPropiedades(List<Propiedad> propiedades) {
			this.propiedades = propiedades;
		}

		public List<Reserva> getReservas() {
			return reservas;
		}

		public void setReservas(List<Reserva> reservas) {
			this.reservas = reservas;
		}
	    
	    
}
