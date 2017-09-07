
public class TocaLeer {

	
	
	static String [] alumnos = {"Arkaitz","Erlantz","Fran","cristian","leire","mikel","josu","alberto","jon","naiara","lander","german"};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numAleatorio = generarNuneroAleatorio(alumnos.length);

		
		
		System.out.println("el afortunad@ es: " + alumnos[numAleatorio]);
	}
	/**
	 * genera numero aleatorio entre cero y <code>max</code>
	 * @param max int numero maximo que puede generar
	 * @return int aleatorio
	 */
	public static int generarNuneroAleatorio(int max){
		//TODO falta implementar logica
		
		//generar numero aleatorio
		int resul= -1;
		resul = (int)(Math.random()*max);
		
		
		return resul;
	}

}
