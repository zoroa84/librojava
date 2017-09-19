package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import com.ipartek.formacion.javalibro.pojo.Persona;

public class GuardarPersonasHasmap {

	public static void main(String[] args) throws IOException {
		boolean encontrar=false;
		String dni = "37382958T";
		FileReader fr = null;
		BufferedReader br = null;
		HashSet<Persona> listaNombres = new HashSet<Persona>();

		try {
			fr = new FileReader("c:\\desarrollo\\personas.txt");
			br = new BufferedReader(fr);
			
			String lineas = "";
			double tInicio = System.currentTimeMillis();
			while ((lineas = br.readLine()) != null) {

				String[] partes = lineas.split(",");
				if (partes.length == 7) {

					listaNombres.add(new Persona(partes[0], partes[1], partes[2], partes[3],partes[4], partes[5],partes[6]));
				}
			}
			double tFinal = System.currentTimeMillis();
			System.out.println("tiempo de ejecucion " + (tFinal - tInicio) / 1000 + " segundos");
		 encontrar = listaNombres.contains(dni);
		if(encontrar == true) {
			System.out.println("encontrado el dni");
		}else {
			System.out.println("no encontrado");
		}

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