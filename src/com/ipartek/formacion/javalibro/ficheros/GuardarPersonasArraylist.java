package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.ipartek.formacion.javalibro.pojo.Persona;
import com.ipartek.formacion.javalibro.utilidades.Validaciones;


public class GuardarPersonasArraylist {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw1 = null;
		FileWriter fw2 = null;
		BufferedWriter bw1 = null;
		BufferedWriter bw2 = null;
		
		int contBuenos = 0;
		int contBasura = 0;

		try {
			fr = new FileReader("data\\personas.txt");
			br = new BufferedReader(fr);
			fw1 = new FileWriter("data\\bueno.txt");
			bw1 = new BufferedWriter(fw1);
			fw2 = new FileWriter("data\\basura.txt");
			bw2 = new BufferedWriter(fw2);
			String lineas = "";
		
			while ((lineas = br.readLine()) != null) {
				String[] partes = lineas.split(",");
				System.out.println(lineas);
				if (partes.length == 7 && Persona.MAYOR_EDAD <= Integer.parseInt(partes[3]) && Validaciones.dni(partes[5]) && Validaciones.email(partes[4]) ) {				
					
					// si es igual a 7 a bueno.txt	
					bw1.write(lineas+"\r\n");
					bw1.flush();
					contBuenos++;
				} else {
					//si es basura aki
					bw2.write(lineas+"\r\n");
					bw2.flush();
					contBasura++;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("aceptadas: "+contBuenos+"\nno validas: "+contBasura);
		}

	}

}