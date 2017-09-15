package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ListarPersonas {

	public static void main(String[] args) throws IOException {
		int cont = 0;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("c:\\desarrollo\\personas.txt");
			br = new BufferedReader(fr);

			String lineas = "";

			while ((lineas = br.readLine()) != null) {
				System.out.println(lineas);
				cont++;

			}
			System.out.println(" ");
			System.out.println(cont + "lineas leidas");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
