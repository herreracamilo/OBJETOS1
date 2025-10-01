package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {

    CajaDeAhorro caja, otraCaja;

    @BeforeEach
    void setUp() throws Exception {
        caja = new CajaDeAhorro();
        otraCaja = new CajaDeAhorro();
    }

    @Test
    public void testDepositoConDescuento() {
        caja.depositar(1000); // se descuenta 2%
        assertEquals(980, caja.getSaldo(), 0.01);
    }

    @Test
    public void testExtraccionExitosa() {
        caja.depositar(1000); // saldo = 980
        boolean pudoExtraer = caja.extraer(500); // requiere 510
        assertTrue(pudoExtraer);
        assertEquals(470, caja.getSaldo(), 0.01);
    }

    @Test
    public void testExtraccionFallida() {
        caja.depositar(100); // saldo = 98
        boolean pudoExtraer = caja.extraer(100); // requiere 102
        assertFalse(pudoExtraer);
        assertEquals(98, caja.getSaldo(), 0.01);
    }

    @Test
    public void testTransferenciaExitosa() {
        caja.depositar(1000); // saldo = 980
        boolean pudoTransferir = caja.transferirACuenta(400, otraCaja); // requiere 408
        assertTrue(pudoTransferir);
        assertEquals(572, caja.getSaldo(), 0.01);
        assertEquals(392, otraCaja.getSaldo(), 0.01);
    }
}