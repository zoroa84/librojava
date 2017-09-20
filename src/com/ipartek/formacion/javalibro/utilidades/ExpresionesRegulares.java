package com.ipartek.formacion.javalibro.utilidades;

// se importa el paquete java.util.regex
import java.util.regex.*;

public class ExpresionesRegulares {
	public static void main(String args[]) {
		// compilamos el patron
		Pattern patron = Pattern.compile("[abc]{1,5}");
		// creamos el Matcher a partir del patron, la cadena como parametro
		Matcher encaja = patron.matcher("aabmanoloaabmanoloabmanolob");
		// invocamos el metodo replaceAll
		String resultado = encaja.replaceAll("-");
		System.out.println(resultado);
		

	}
}
