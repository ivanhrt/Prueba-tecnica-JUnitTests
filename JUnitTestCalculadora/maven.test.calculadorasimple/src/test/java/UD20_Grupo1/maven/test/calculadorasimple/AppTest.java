package UD20_Grupo1.maven.test.calculadorasimple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	Calculadora calcTest = new Calculadora();
	MainApp main = new MainApp();
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testsuma() {
    	assertEquals(20.0,calcTest.suma(15, 5));
    }
    @Test
    public void testresta() {
    	assertEquals(10.0,calcTest.resta(15, 5));
    }
    @Test
    public void testmultiplicacion() {
    	assertEquals(75.0,calcTest.multiplicacion(15, 5));
    }
    @Test
    public void testdivision() {
    	assertEquals(3.0,calcTest.division(15, 5));
    }
    
    @Test
    public void testmain() {
    	main.main(null);
    }
    
    
    
}
