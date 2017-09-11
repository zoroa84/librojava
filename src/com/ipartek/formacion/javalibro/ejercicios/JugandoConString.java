package com.ipartek.formacion.javalibro.ejercicios;
public class JugandoConString {

	public static void main(String[] args) {

		String manolo = "Manolo Kabezabolo";

		// convertir a minusculas
		System.out.println(manolo.toLowerCase());

		// convertir a mayusculas
		System.out.println(manolo.toUpperCase());
		// mostrar numero de caracteres
		System.out.println("la longitud es: " + manolo.length());

		// mostrar posiscion de la letra "K"
		System.out.println(manolo.indexOf("K"));// lastindexof para empezar por al ultima

		// separar en dos variables el nombre y ´apellido' con substring
		String nombre = manolo.substring(0, 6); // Manolo
		String apellido = manolo.substring(7); // Kabezabolo
		/* Comparando */

		String c1 = "casa";
		String c2 = "Casa";

		// comparar c1 y c2 con equals y equalIgnoreCase

		System.out.println("equals: " + c1.equals(c2));
		System.out.println("equalsignore: " + c1.equalsIgnoreCase(c2));

		/* Limpiando entradas de datos */

		String c3 = "perro";
		String c4 = "     perro     ";

		// las dos variables deden ser igual => trim

		System.out.println("los peros son igales " + c3.equals(c4.trim()));

		String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tristique magna non elementum facilisis. Suspendisse ultricies finibus massa, at ullamcorper felis aliquet a. Aliquam gravida volutpat purus nec faucibus. Ut sodales enim ac gravida fermentum. Aenean id est at mauris vehicula tincidunt et sit amet erat. Morbi et tincidunt massa, scelerisque maximus quam. Sed hendrerit fermentum venenatis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin faucibus hendrerit sem. Aliquam erat volutpat. Ut in condimentum eros. Praesent molestie justo quis porta finibus. Etiam laoreet, odio at auctor sodales, arcu arcu finibus ligula, a facilisis elit tellus laoreet turpis. Nulla mattis mattis mi sed aliquet. Duis dignissim commodo vulputate.";
		// mostrar longitud
		System.out.println(lorem.length());
		// contar todas las vocales el split separa las palabras por los espacios en
		// este caso
		System.out.println(lorem.split(" ").length);
		// indicar el numero de vocales
		int contadorVocales = 0;
		char[] aVocales = lorem.toLowerCase().toCharArray();
		char vocal = 'a';
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < aVocales.length; i++) {
			vocal = aVocales[i];
			for (int j = 0; j < vocales.length; j++) {
				if (vocales[j] == vocal) {
					contadorVocales++;
					break;
				}//fin if
			}//fin second for
		}//fin first for
		System.out.println("vocales: " + contadorVocales);
		// numero de at que hay
		
		
		

	}

}
