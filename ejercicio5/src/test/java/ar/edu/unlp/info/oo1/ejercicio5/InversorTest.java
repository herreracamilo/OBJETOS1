package ar.edu.unlp.info.oo1.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InversorTest {

    @Test
    public void testValorTotalActual() {
        Inversor inversor = new Inversor();

        Acciones google = new Acciones("Google", 1500.0, 2); // 3000.0
        Acciones tesla = new Acciones("Tesla", 800.0, 1);     // 800.0
        PlazoFijo plazo = new PlazoFijo(10000.0, 30.0);       // depende de los días

        inversor.agregarInversion(google);
        inversor.agregarInversion(tesla);
        inversor.agregarInversion(plazo);

        double total = inversor.valorTotalActual();

        // Verificamos que el total sea mayor que la suma de las acciones (porque el plazo fijo genera interés)
        assertTrue(total > 3800.0);
    }
}