package com.ipartek.formacion.javalibro.ejercicios;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class EjemploIterator {

	public static void main(String[] args) {
		
		long tiempo = System.currentTimeMillis();
		
		HashSet<String> listaNombres = new HashSet<>();
		listaNombres.add("manolo");
		listaNombres.add("manola");
		listaNombres.add("manolito");
		listaNombres.add("manolita");
		listaNombres.add("manuel");
		
		//iterator es mas optimo para recorrer colecciones que un for
		Iterator<String> it = listaNombres.iterator();
		String nombre="";
		while (it.hasNext()) {
			nombre = (String)it.next();
			System.out.println(nombre);
		}
		//para ordenar de mayor a menor 
		
		long tFin =  System.currentTimeMillis();
		System.out.println("tiempo de ejecucion " + (tFin - tiempo));
	}

}
