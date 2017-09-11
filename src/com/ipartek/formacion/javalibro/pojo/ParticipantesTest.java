import junit.framework.TestCase;

public class ParticipantesTest extends TestCase {

	public void testConstructorVacio() {
		Participante p = new Participante();
		assertEquals("", p.getNombre());
		assertEquals("", p.getUsuarioGit());
		assertEquals("", p.getEmail());
		assertFalse(p.isTrabajador());
		assertEquals("https://github.com/", p.getLinkGitHub());

		try {
			Participante matusalen = new Participante("matu", 235);
			fail("deveria haber saltado excepcion");
		} catch (Exception e) {
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_CIEN, e.getMessage());
		}

	}

	public void testConstructor() {

		Participante p1 = new Participante("mikel", "zoroa84");
		p1.setEmail("zoroa84@gmail.com");

		assertEquals("mikel", p1.getNombre());
		assertEquals("zoroa84", p1.getUsuarioGit());
		assertEquals("zoroa84@gmail.com", p1.getEmail());
		assertEquals(false, p1.isTrabajador());
		assertEquals("https://github.com/zoroa84", p1.getLinkGitHub());
	}

	public void testException() {
		Participante p1 = new Participante("mikel", "zoroa84");
		try {
			p1.setEdad(88);
		} catch (ParticipanteException e) {
			fail("no deveria lanzar Excepcion con edad 88");

		}

		try {
			p1.setEdad(-3);
			fail("deveria haber lanzado Excepcion");
		} catch (ParticipanteException e) {
			assertEquals(ParticipanteException.EXCEPTION_MENOR_CERO, e.getMessage());
		}
		try {
			p1.setEdad(253);
			fail("deveria haber lanzado Excepcion");
		} catch (ParticipanteException e) {
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_CIEN, e.getMessage());
		}
	}

}
