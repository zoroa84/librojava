package com.ipartek.formacion.javalibro.pojo.interfaces;

import java.util.ArrayList;

import com.ipartek.formacion.javalibro.pojo.Libro;
import com.ipartek.formacion.javalibro.pojo.Participante;
/**
 * lista para contenero objetos de las clases participante y libro
 * @author Administrador
 *
 */
public class ListaInterfaz {

	public static void main(String[] args) {
		
		ArrayList<Imprimible> lista = new ArrayList<Imprimible>();
		Libro l = new Libro("los pilares de la tierra");
		Libro l2 = new Libro("los pilares de la tierra 2");
		Participante p = new Participante("mikel","50");
		
		lista.add(l);
		lista.add(l2);
		lista.add(p);
		
		for (Imprimible elem : lista) {
			if (elem instanceof Libro) {
				Libro libro  = (Libro) elem;
			} else if (elem instanceof Participante) {
				Participante parti = (Participante)elem;
				System.out.println("participante " + parti.getNombre());
			}else {
				System.out.println("no conocemos esa clase");
			}
		}
		
	}

}
