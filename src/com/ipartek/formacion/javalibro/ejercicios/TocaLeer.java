package com.ipartek.formacion.javalibro.ejercicios;

public class TocaLeer {

	
	
	static String [] alumnos = {"Arkaitz","Erlantz","Fran","cristian","erlantz2","leire","mikel","josu","alberto","jon","naiara","lander","yeray","german"};
	static String [] git = {"arkaitzgl","erliglesias","FranPerez92","CristianVar","-Erlantzcabrejas ","LeireBustin","Katakume","amsoria91","(alarconsolis)","(naiaramateos)","LanderAB","LordBlacKhiin"};
	/*
	 * *
	 * @param args
	 */
	public static void main(String[] args) {
		int numAleatorio = generarNuneroAleatorio(alumnos.length);

		
		
		System.out.println("el afortunad@ es: " + alumnos[numAleatorio]);
	}
	/**
	 * genera numero aleatorio entre cero y <code>max</code>
	 * @param max int numero maximo que puede generar
	 * @return int aleatorio
	 */
	public static int generarNuneroAleatorio(int max){
		//TODO falta implementar logica
		
		//generar numero aleatorio
		int resul= -1;
		resul = (int)(Math.random()*max);
		
		
		return resul;
	}

}
