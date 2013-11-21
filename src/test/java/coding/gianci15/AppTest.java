package coding.gianci15;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest {

	static App aplicacion;
	String resultado;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		// Arrange
		aplicacion =new App();
	}

	@Test
	public void testSuma() {

 	
	resultado=aplicacion.suma(5,9);
	assertEquals("La suma deberia ser :14","14",resultado);
    
	}
	
	@Test
	public void testResta() {
		
	resultado=aplicacion.resta(9,5);
	assertEquals("La resta deberia ser :4","4",resultado);

	}
	
	@Test
	public void test3() {
		assert(true);
	}

	
	@Test
	public void testHolaMundo() {
		
		// act 
		String prueba= aplicacion.HolaMundo();
		
		// Assert
		assertEquals("El resultado deberia ser : Hola Mundo","Hola Mundo",prueba);
	}

}
