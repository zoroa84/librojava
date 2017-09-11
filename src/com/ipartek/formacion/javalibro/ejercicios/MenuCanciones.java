package com.ipartek.formacion.javalibro.ejercicios;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.ipartek.formacion.javalibro.pojo.Canciones;

public class MenuCanciones {

	public static ArrayList<Canciones> song = new ArrayList<Canciones>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		String validar = "quedarse";
		inicializarLista();
		boolean opcioncorrecta = false;

		while (validar == "quedarse") {
			do {

				try {
					System.out.println("MENU CANCIONES");
					System.out.println("elija 1 para listar, 2 para borrar, 3 para añadir y 4 salir");
					opcioncorrecta = true;

					opcion = (int) sc.nextFloat();
				} catch (Exception e) {
					System.out.println("solo deve elejir un numero 1-4, no letras");
				}
			} while (opcioncorrecta != true);
			switch (opcion) {
			case 1:
				for (int i = 0; i < song.size(); i++) {
					System.out.println((i+1)+"º cancion "+song.get(i));
				}
				break;
			case 2:
				System.out.println("que numero de cancion quieres eliminar");
				int numCancion = (int) sc.nextInt();
				song.remove(numCancion - 1);
				System.out.println("cancion eliminada");
				break;
			case 3:
				String nomCancion = "";
				String nomAutor = "";
				int durCancion = -1;
				System.out.println("añadir el nombre de la cancion");
				nomCancion = sc.next();
				System.out.println("añadir el nombre del autor");
				nomAutor = (String) sc.next();
				System.out.println("añadir la duracion de la cancion");
				durCancion = (int) sc.nextInt();
				song.add(new Canciones(nomCancion, nomAutor, durCancion));
				System.out.println("cancion añadida a la biblioteca");
				break;

			default:
				validar = "irse";
				System.out.println("gracias y hasta la proxima");
				break;
			}
		}
		sc.close();
	}

	private static void inicializarLista() {
		song.add(new Canciones("ayer soñe", "benito kamelas", 3));
		song.add(new Canciones("he decidido", "benito kamelas", 4));
		song.add(new Canciones("fue mi abuelo", "benito kamelas", 5));
		song.add(new Canciones("loko", "benito kamelas", 4));
		song.add(new Canciones("pikolo", "benito kamelas", 3));
		song.add(new Canciones("el rincon de mi cabeza", "benito kamelas", 4));
		song.add(new Canciones("y no cambiamos ni un solo minuto", "benito kamelas", 5));
		song.add(new Canciones("lola", "benito kamelas", 4));
		song.add(new Canciones("sin trampa ni carton", "benito kamelas", 3));
		song.add(new Canciones("corazon de luna", "benito kamelas", 4));

	}

}
