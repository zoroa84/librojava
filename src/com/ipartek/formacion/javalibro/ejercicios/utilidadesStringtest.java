import junit.framework.TestCase;

public class utilidadesStringtest extends TestCase {

	public void testBuscarPalabra() {

		// casos null
		
		assertEquals(0, utilidadesString.buscarPalabra(null, null));
		assertEquals(0, utilidadesString.buscarPalabra(null, "descanso"));
		assertEquals(0, utilidadesString.buscarPalabra("Ahora toca descanso", null));
		
		// caso facil
		assertEquals(1, utilidadesString.buscarPalabra("Ahora toca descanso", "descanso"));
		assertEquals(1, utilidadesString.buscarPalabra("Ahora toca descanso.", "descanso"));
		assertEquals(2, utilidadesString.buscarPalabra("Ahora toca descanso descanso", "descanso"));
		assertEquals(0, utilidadesString.buscarPalabra("Ahora toca descansodescanso", "descanso"));

	}

}
