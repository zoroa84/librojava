package com.ipartek.formacion.javalibro.ejercicios;
import junit.framework.TestCase;

public class TocaLeerTest extends TestCase {

	public void testGenerarNuneroAleatorio() {
		int numAleatorio = -1;
		boolean[] aCheck = new boolean[15];

		for (int i = 0; i < 1000; i++) {
			numAleatorio = TocaLeer.generarNuneroAleatorio(15);
			aCheck[numAleatorio] = true;
		}

		// comprobar que todas posiciones sean true

		for (int i = 0; i < aCheck.length; i++) {
			assertTrue("deberia haber salido 0"+i,aCheck[i]);
		}

	}

}
