import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String validar = "si";
		float importe = 0;
		boolean importeCorrecto = false;
		String continuar = " ";
		do {
			System.out.println("   calculadora iva 21%   ");
			System.out.println("----------------------------------");
			System.out.println("por favor dale el importe en euros");

			// comprobar que sea un numero
			do {
				try {

					// TODO hacer lo que querais pero que pase por las otras excepciones
					// sc = null; sc.next(); esto da null
					// para excepcion

					sc = new Scanner(System.in);
					importe = sc.nextFloat();
					importeCorrecto = true;
				} catch (NullPointerException e) {
					System.out.println("ya me diras como has metido un null");
				} catch (InputMismatchException e) {
					System.out.println("valor incorrecto, introduce un valor numerico con decimales (12.32)");
				} catch (Exception e) {
					System.out.println("el proceso a fallado");
				}

			} while (!importeCorrecto);

			// calculo del iva
			System.out.println("iva repercutido=" + importe * 0.21);
			System.out.println("desea volver a introducir un valor??");
			continuar = sc.next();

			// repetir la operacion
		} while (validar.equalsIgnoreCase(continuar));
		System.out.println("agur");
		sc.close();

	}

}
