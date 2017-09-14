package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

/**
 * listar todas las canciones de la carpeta c:desarrollo\music
 * 
 * @author mikel
 *
 */
public class ListarCanciones {

	public static void main(String[] args) {
		File canal = new File("c:\\desarrollo\\music");
		File[] lista = canal.listFiles();

		for (File c : lista) {
			File[] canciones = c.listFiles();
			System.out.println("[" + canciones.length + "] " + c.getName());
			for (File cancion : canciones) {
				System.out.println(cancion.getName() + " " + cancion.length() / 1024);
			}
		}
	}

}
