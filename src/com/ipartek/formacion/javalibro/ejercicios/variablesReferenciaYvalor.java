/**
 * las variables primiticas se pasan por valor las variables de clases se pasan
 * por referencia
 * 
 * @author Administrador
 *
 */
public class variablesReferenciaYvalor {

	public static void main(String[] args) {

		// int orimitiva = 1;
		// System.out.println("primitiva = "+primitiva);
		// int primitiva2 = sumar(primitiva);
		// System.out.println("primitiva = "+primitiva);
		// System.out.println("primitiva2 = "+primitiva2);
		// TODO mirarlo bien que no cambia
		// variable de clase
		String referencia = "1";
		String referencia2 = sumar(referencia);
		System.out.println("referencia= " + referencia);
		System.out.println("refencia2= " + referencia2);

	}

	// static int sumar ( int i);
	// return ++i;

	static int sumar(int i) {
		return ++i;
	}

	static String sumar(String s) {
		s = "2";
		return s;
	}

}