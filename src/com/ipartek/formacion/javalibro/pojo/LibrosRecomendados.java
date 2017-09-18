package com.ipartek.formacion.javalibro.pojo;

public class LibrosRecomendados  {

	/**
	 * 
	 */
	

	public static void main(String[] args) {
		
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
		lp.setPaginas(739);
		
			

		System.out.println(l);
		System.out.println(le);
		System.out.println(lp);
		
		
	le.imprimir();
	}

	

}
