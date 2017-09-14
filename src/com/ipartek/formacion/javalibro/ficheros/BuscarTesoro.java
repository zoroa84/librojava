package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

import com.sun.org.apache.xalan.internal.utils.FeatureManager.Feature;

/**
 * Descomprime el fichero "data/buscatesoro.rar" donde quieras y recorre forma
 * recursiva los ficheros, hasta encontrar dentro de un .txt la palabra
 * "osobuko".<br>
 * Muestra por pantalla la ruta del fichero que contiene la palabra a buscar.
 * 
 * @author ur00
 *
 */
public class BuscarPalabra {

	public static void listarDirectorio(File directorio, String separador) {
		String palabra = "osobuko";
		String linea = "";
		File[] ficheros = directorio.listFiles();
		for (int x = 0; x < ficheros.length; x++) {
			// System.out.println(separador + ficheros[x].getName());
			if (ficheros[x].isDirectory()) {
				listarDirectorio(ficheros[x], separador + separador);
			} else {
				try {
					FileReader fr = new FileReader(directorio);
					BufferedReader br = new BufferedReader(fr);
					while (linea != null) {
						int buscar = linea.indexOf(palabra);
						if (linea.equals(palabra)) {
							System.out.println("encontrada!!!!!!!!!!!!!!");
						} else {
							System.out.println("no la encuentra");
						}

					}

				} catch (Exception e) {
					// TODO: handle exception
				}finally {
					br.close();
					fr.close();
				}

			}

		}
	}

	public static void main(String[] args) {

		File f = new File("c:\\desarrollo\\buscatesoro");
		listarDirectorio(f, "----");
	}

}
