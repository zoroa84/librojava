import java.util.ArrayList;
import java.util.Scanner;

public class MenuCanciones {

	public static ArrayList song = new ArrayList();
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;

		inicializarLista();
		
		System.out.println("MENU CANCIONES");
		System.out.println("elija 1 para listar, 2 para borrar y 3 para añadir");
		opcion = (int) sc.nextFloat();
		
		switch (opcion) {
		case 1:
			for (int i = 0; i < song.size(); i++) {
				System.out.println(song.get(i));
			}
			break;
		case 2:
			System.out.println("que numero de cancion quieres eliminar");
			int numCancion = (int) sc.nextInt();		
		song.remove(numCancion-1);
		//no consigo que borre la cancion
			break;
		case 3:
		 	String nomCancion = "";
		 	String nomAutor = "";
		 	int durCancion = -1;
			 
			System.out.println("añadir el nombre de la cancion");
			nomCancion =  sc.next();
			System.out.println("añadir el nombre del autor");
			nomAutor = (String) sc.next();
			System.out.println("añadir la duracion de la cancion");
			durCancion = (int) sc.nextInt();
			
			song.add(new Canciones(nomCancion, nomAutor, durCancion));
			
			break;
		

		default:
			break;
		}
		sc.close();
		listar();
		
		borrar();
		

	}


	private static void borrar() {
		
		
	}


	private static void listar() {
		
		
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
