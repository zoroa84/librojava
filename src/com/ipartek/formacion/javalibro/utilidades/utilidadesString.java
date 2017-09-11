package com.ipartek.formacion.javalibro.utilidades;

public class utilidadesString {
	/**
	 * cuenta las palabras que esten contenidas dentro del texto
	 * 
	 * @param texto
	 *            string donde buscar las palabras
	 * @param busqueda
	 *            palabra que buscamos dentro del texto
	 * @return int 0 si no encuentra, numero de palabras encontradas
	 */
	static int buscarPalabra(String texto, String busqueda) {
		int resultado = -1;
		
		if (texto == null || busqueda ==null) {
			resultado = 0;
		}else {
						
			int pos = texto.indexOf(busqueda);
			//while o for hasta pos =-1
			
			do {
				//busca la palabra
				texto = texto.substring(pos)+1;
				//esiste???
				if (pos != -1) {
					resultado++;
					pos = texto.indexOf(busqueda);
				}
				
				
				
			} while (pos !=-1);					
		}
		
		return resultado;
	}

}
