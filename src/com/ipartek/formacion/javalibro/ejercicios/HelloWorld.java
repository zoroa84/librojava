package com.ipartek.formacion.javalibro.ejercicios;

public class HelloWorld {
	
	final int DIAS_SEMANA = 7;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		System.out.println("----- listdo de alumnos -----");
		String [] alumnos = {"ander","Arkaitz","Erlantz","Fran","cristian","leire","mikel","josu","alberto","jon","lander","german"};
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println((i+1) + " - " +alumnos[i]);
		}
		
		
	}

}
