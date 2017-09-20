package com.ipartek.formacion.javalibro.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * conectar a una web http://www.example.com/ para descargar codigo fuente
 * 
 * @author Administrador
 *
 */
public class ConectarPAginaWeb {
	public static void main(String[] args) throws MalformedURLException {
		final String PAGINA_WEB = "http://www.example.com/";
		 String paginaWeb = "";
String linea = "";
			String linea1 = "";
		try {
			URL url = new URL(PAGINA_WEB);

			URLConnection con = url.openConnection();
			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			while ((linea = br.readLine()) != null) {

				if (linea.indexOf("<a") != -1) {
					//System.out.println(linea);
					String[] trozos = linea.split("\"");
					//System.out.println(trozos[1]);
					paginaWeb= trozos[1];
				}

			} // fin while
		

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			URL url1 = new URL(paginaWeb);
			try {
				URLConnection con1 =url1.openConnection();
				InputStreamReader isr1 = new InputStreamReader(con1.getInputStream()) ;
				BufferedReader br1 = new BufferedReader(isr1);	
				
				while ((linea1 = br1.readLine()) != null) {

					System.out.println(linea1);

				} // fin while

				
				
				
				}
			 catch (IOException e) {
				e.printStackTrace();
			}
		}

}}
