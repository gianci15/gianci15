package coding.gianci15;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.runner.RunWith;
public class AppTest {

	static App aplicacion;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		// Arrange
		aplicacion =new App();
	}

	@Test
	public void test() {
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
