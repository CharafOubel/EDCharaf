/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso.numeroa.tarea.entornos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alumno
 */
public class ConcursoNumeroaTareaEntornosTest {
    
    public ConcursoNumeroaTareaEntornosTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception
    {
    }

    @AfterAll
    public static void tearDownClass() throws Exception
    {
    }

    @BeforeEach
    public void setUp() throws Exception
    {
    }

    @AfterEach
    public void tearDown() throws Exception
    {
    }


    /**
     * Test of matrizDeNombresNotas method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testMatrizDeNombresNotas() {
        int numJogadores = 6;
        int[][] expResult = new int[numJogadores][2];
        for ( int i = 0 ; i < numJogadores ; i ++){
            expResult[i][0] = i;
            expResult[i][1] = 0;
        }
        int[][] result = ConcursoNumeroaTareaEntornos.matrizDeNombresNotas(numJogadores);
        assertArrayEquals(expResult, result);
    }

    // NO se puede hacer el Junit porque el Math.ramdom mo se puede probar en Junit 
    /**
     * Test of simbol method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testSimbol() {
        System.out.println("simbol");
        char expResult = ' ';
        char result = ConcursoNumeroaTareaEntornos.simbol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of evaluarExpresion method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testEvaluarExpresion() {
        System.out.println("evaluarExpresion");
        String expresion = "7*5-2+2-7";
        int expResult = 28;
        int result = ConcursoNumeroaTareaEntornos.evaluarExpresion(expresion);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        ConcursoNumeroaTareaEntornos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciarPartida method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testIniciarPartida()
    {
        System.out.println("iniciarPartida");
        ConcursoNumeroaTareaEntornos.iniciarPartida();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numJugadores method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testNumJugadores()
    {
        System.out.println("numJugadores");
        ConcursoNumeroaTareaEntornos.numJugadores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarNombreJugador method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testGuardarNombreJugador()
    {
        System.out.println("guardarNombreJugador");
        ConcursoNumeroaTareaEntornos.guardarNombreJugador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elegirRondas method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testElegirRondas()
    {
        System.out.println("elegirRondas");
        ConcursoNumeroaTareaEntornos.elegirRondas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generaRonda method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testGeneraRonda()
    {
        System.out.println("generaRonda");
        ConcursoNumeroaTareaEntornos.generaRonda();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarPregunta method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testGenerarPregunta()
    {
        System.out.println("generarPregunta");
        ConcursoNumeroaTareaEntornos.generarPregunta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalizarPartida method, of class ConcursoNumeroaTareaEntornos.
     */
    @Test
    public void testFinalizarPartida()
    {
        System.out.println("finalizarPartida");
        ConcursoNumeroaTareaEntornos.finalizarPartida();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}


