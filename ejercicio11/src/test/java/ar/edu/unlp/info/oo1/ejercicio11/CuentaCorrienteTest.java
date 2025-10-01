package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {

    CuentaCorriente corriente, otraCorriente;

    @BeforeEach
    void setUp() throws Exception {
        corriente = new CuentaCorriente();
        otraCorriente = new CuentaCorriente();
        corriente.setLimiteDescubierto(200);
        otraCorriente.setLimiteDescubierto(100);
    }

    @Test
    public void testDepositoSinDescuento() {
        corriente.depositar(100);
        assertEquals(100, corriente.getSaldo(), 0.01);
    }

    @Test
    public void testExtraccionConDescubiertoPermitido() {
        corriente.depositar(100);
        boolean pudoExtraer = corriente.extraer(250); // saldo quedaría en -150
        assertTrue(pudoExtraer);
        assertEquals(-150, corriente.getSaldo(), 0.01);
    }

    @Test
    public void testExtraccionExcedeDescubierto() {
        corriente.depositar(100);
        boolean pudoExtraer = corriente.extraer(310); // saldo quedaría en -210
        assertFalse(pudoExtraer);
        assertEquals(100, corriente.getSaldo(), 0.01);
    }

    @Test
    public void testTransferenciaConDescubierto() {
        corriente.depositar(100);
        corriente.extraer(250); // saldo = -150
        boolean pudoTransferir = corriente.transferirACuenta(30, otraCorriente); // saldo = -180
        assertTrue(pudoTransferir);
        assertEquals(-180, corriente.getSaldo(), 0.01);
        assertEquals(30, otraCorriente.getSaldo(), 0.01);
    }
}