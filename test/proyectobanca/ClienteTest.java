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
public class ClienteTest {

    /**
     * Test of getIdcliente method, of class Cliente.
     */
    @Test
    public void testGetIdcliente() {
        System.out.println("getIdcliente");
        Cliente instance = new Cliente(1, "Pipo", "Pipiolo", 20, "Calle Madrid", "Y0694205X", 697314054);
        int expResult = 1;
        int result = instance.getIdcliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente(1, "Pipo", "Pipiolo", 20, "Calle Madrid", "Y0694205X", 697314054);
        String expResult = "Pipo";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getApellidos method, of class Cliente.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Cliente instance = new Cliente(1, "Pipo", "Pipiolo", 20, "Calle Madrid", "Y0694205X", 697314054);
        String expResult = "Pipiolo";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEdad method, of class Cliente.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Cliente instance = new Cliente(1, "Pipo", "Pipiolo", 20, "Calle Madrid", "Y0694205X", 697314054);
        int expResult = 20;
        int result = instance.getEdad();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDireccion method, of class Cliente.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Cliente instance = new Cliente(1, "Pipo", "Pipiolo", 20, "Calle Madrid", "Y0694205X", 697314054);
        String expResult = "Calle Madrid";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNif method, of class Cliente.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Cliente instance = new Cliente(1, "Pipo", "Pipiolo", 20, "Calle Madrid", "Y0694205X", 697314054);
        String expResult = "Y0694205X";
        String result = instance.getNif();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente(1, "Pipo", "Pipiolo", 20, "Calle Madrid", "Y0694205X", 697314054);
        double expResult = 697314054;
        double result = instance.getTelefono();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of GetClientes method, of class Cliente.
     */
    @Test
    public void testGetClientes() {
        System.out.println("GetClientes");
        Cliente instance = new Cliente(1, "Pipo", "Pipiolo", 20, "Calle Madrid", "Y0694205X", 697314054);
        String expResult = "Cliente '1' nombre 'Pipo'";
        String result = instance.GetClientes();
        assertEquals(expResult, result);
    }

}
