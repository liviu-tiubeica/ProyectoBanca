/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CuentasTest {

    /**
     * Test of getIdcuenta method, of class Cuentas.
     */
    @Test
    public void testGetIdcuenta() {
        Cuentas instance = new Cuentas(1, 1, 500);
        int expResult = 1;
        int result = instance.getIdcuenta();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdcliente method, of class Cuentas.
     */
    @Test
    public void testGetIdcliente() {
        Cuentas instance = new Cuentas(1, 1, 500);
        int expResult = 1;
        int result = instance.getIdcliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDinero method, of class Cuentas.
     */
    @Test
    public void testGetDinero() {
        Cuentas instance = new Cuentas(1, 1, 500);
        double expResult = 500;
        double result = instance.getDinero();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setDinero method, of class Cuentas.
     */
    @Test
    public void testSetDinero() {
        Cuentas instance = new Cuentas(1, 1, 500);
        instance.setDinero(900.15);
        double expResult = 900.15;
        double result = instance.getDinero();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getCuentas method, of class Cuentas.
     */
    @Test
    public void testGetCuentas() {
        System.out.println("getCuentas");
        Cuentas instance = new Cuentas(1, 1, 500);
        String expResult = "Cuenta con id '1' pertenece al idcliente '1'";
        String result = instance.getCuentas();
        assertEquals(expResult, result);
    }

}
