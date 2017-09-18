package com.ipartek.formacion.javalibro.pojo.interfaces;

import com.ipartek.formacion.javalibro.pojo.Libro;
import com.ipartek.formacion.javalibro.pojo.LibroElectronico;
import com.ipartek.formacion.javalibro.pojo.LibroPapel;

import junit.framework.TestCase;

public class VendibleTest extends TestCase {
	public void testprecio() {
		
		
		Libro l =new Libro("100 años de soledad");
		l.setAutor("gabriel garcia");
		l.setPaginas(303);
		
		LibroElectronico le =new LibroElectronico("años salvajes");
		le.setAutor("william finnegan");
		le.setTamanyo(23);
		le.setPaginas(523);
		
		LibroPapel lp = new LibroPapel("papillon");
		lp.setAutor("henri caharriere");
		lp.setTapaBlanda(false);
		lp.setPaginas(789);
		
		assertEquals(60.6f,l.getprecio(), 0.01);
	
		assertEquals(99.6f, le.getprecio(),0.01);
	
		
		
		
	}
}
