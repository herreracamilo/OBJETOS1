package ar.edu.unlp.info.oo1.ejercicio19;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}


	public LocalDate getFrom() { // “Retorna la fecha de inicio del rango”
		return this.from;
	}
	

	public LocalDate getTo() { //“Retorna la fecha de fin del rango”
		return this.to;
	}

	public boolean includesDate(LocalDate other) { //“Recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
		return (other.isEqual(this.from) || other.isAfter(this.from)) && other.isBefore(this.getTo());
	}
	
    public boolean overlaps(DateLapse other) {
        return !(to.isBefore(other.from) || from.isAfter(other.to));
    }

    public int sizeInDays() {
        return (int) ChronoUnit.DAYS.between(from, to);
    }

    public boolean includes(LocalDate date) {
        return !date.isBefore(from) && !date.isAfter(to);
    }

}