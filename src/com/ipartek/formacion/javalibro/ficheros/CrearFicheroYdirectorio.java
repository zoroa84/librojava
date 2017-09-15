package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Pide por pantalla:
 * <ol>
 * <li>Nombre de un directorio</li>
 * <li>Nombre fichero.txt</li>
 * <li>Palabras a guardar dentro del fichero.txt</li>
 * </ol>
 * 
 * Crea la carpeta en C:
 * 
 * @author ur00
 *
 */
public class CrearFicheroYdirectorio {
	public static void main(String[] args) {
		
		File fc = null;
		FileWriter fc1 = null;
		Scanner sc =null;
		try {
			
			sc = new Scanner(System.in);
			System.out.println("inroduce el nombre de la carpeta");
			String carpeta = sc.nextLine();
			System.out.println("introduce el nombre del archivo sin extension(.txt)");
			String archivo = sc.nextLine();
			System.out.println("introduzca el texto que desea introducir en el documento");
			String texto = sc.nextLine();

			//crear carpeta
			//si usamos "new filewriter( file.getAbsoluteFile())" para que no machaque el archivo
			fc = new File("c:\\desarrollo\\" + carpeta + "");
			fc.mkdirs();
			//crear fichero
			fc1 = new FileWriter("c:\\desarrollo\\" + carpeta + "\\" + archivo + ".txt");
			//escribir en el fichero
			fc1.write(texto+"\n\r");  //\r retorno de carro  \n salto de linera
			sc.close();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				// fc.close();
				fc1.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
