package com.ipartek.formacion.javalibro.excepciones;


public class PropagarExcepciones {
	public static void main(String[] args) {
		comoMarron();
	}
	private static void lanzoExcepcion() throws Exception {
		System.out.println("lanzo Excepcion entro");
		throw new Exception();
		//System.out.println("lanzo excepcion salgo");
	}

	private static void pasoMarron() throws Exception {
System.out.println("paso marron entro");
lanzoExcepcion();
	}

	private static void comoMarron() {
		System.out.println("como marron entro");
		try {
			pasoMarron();
		} catch (Exception e) {
			System.out.println("ya me encargo yo de gestionar");
		}
		System.out.println("como marron salgo");
	}



}
