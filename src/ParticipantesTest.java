import junit.framework.TestCase;

public class ParticipantesTest extends TestCase {

	public void testConstructor() {
		
		Participante p1 = new Participante("mikel", "zoroa84");
		p1.setEmail ("zoroa84@gmail.com");
		
		assertEquals("mikel", p1.getNombre());
		assertEquals("zoroa84", p1.getUsuarioGit());
		assertEquals("zoroa84@gmail.com", p1.getEmail());
		assertEquals(false,p1.isTrabajador());
		assertEquals("https://github.com/zoroa84", p1.getLinkGitHub());
	}
	
	
}
