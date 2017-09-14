package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerarFichero {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("c:\\desarrollo\\prueva.txt");
			bw = new BufferedWriter(fw);
			bw.write("yeahhhhh");

			System.out.println("fichero creado con exito");

		} catch (IOException e) {
			System.out.println("no se puede escribir el fichero");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("no se puede cerrar el buffer y writer");
				e.printStackTrace();
			}

		}

	}

}
