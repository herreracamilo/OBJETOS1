package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;
import java.util.List;

public class Propiedad {
	private String nombre;
    private String direccion;
    private double precioPorNoche;
    private List<Reserva> reservas;

    
    public Propiedad(String n, String dire, double precio) {
    	this.nombre = n;
    	this.direccion = dire;
    	this.precioPorNoche = precio;
    }
    
    public boolean estaDisponible(DateLapse periodo) {
        return reservas.stream().noneMatch(r -> r.getPeriodo().overlaps(periodo));
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva, LocalDate hoy) {
        if (!reserva.estaEnCurso(hoy)) {
            reservas.remove(reserva);
        }
    }

    public double ingresosEntre(DateLapse periodo) {
        return reservas.stream()
            .filter(r -> r.getPeriodo().overlaps(periodo))
            .mapToDouble(Reserva::calcularPrecio)
            .sum() * 0.75;
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

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

}
