package com.ipartek.formacion.javalibro.utilidades;

import junit.framework.TestCase;

public class ValidacionesTest extends TestCase {
	public void testEmail() {
		
		assertFalse(Validaciones.email(null));
		assertFalse(Validaciones.email("auraga.ipartek.com"));
		assertFalse(Validaciones.email("@ipartek.com"));
		
		
		assertTrue(Validaciones.email("auraga@ipartek.com"));
		
	}
}
