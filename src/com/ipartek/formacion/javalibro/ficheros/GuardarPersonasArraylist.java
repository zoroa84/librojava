package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class GuardarPersonasArraylist {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw1 = null;
		FileWriter fw2 = null;
		BufferedWriter bw1 = null;
		BufferedWriter bw2 = null;
		FileWriter fw3 = null;
		BufferedWriter bw3 = null;
		
		int contBuenos = 0;
		int contBasura = 0;

		try {
			fr = new FileReader("data\\personas.txt");
			br = new BufferedReader(fr);
			fw1 = new FileWriter("data\\bueno.txt");
			bw1 = new BufferedWriter(fw1);
			fw2 = new FileWriter("data\\basura.txt");
			bw2 = new BufferedWriter(fw2);
			fw3 = new FileWriter("data\\basura.txt");
			bw3 = new BufferedWriter(fw2);
			
			
			
			String lineas = "";
			
			while ((lineas = br.readLine()) != null) {
				String[] partes = lineas.split(",");
				System.out.println(lineas);
				if (partes.length == 7) {
					
					if(Integer.parseInt("18") < Integer.parseInt(partes[3]) ) {
					
					// si es igual a 7 a bueno.txt	
					bw1.write(lineas+"\r\n");
					bw1.flush();
					contBuenos++;
					}else {
						
						bw3.write(partes+"\r\n");
						bw3.flush();
						contBasura++;
					}

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