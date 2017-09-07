import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String validar = "si";
		do {
			System.out.println("   calculadora iva 21%   ");
		System.out.println("----------------------------------");
		System.out.println("por favor dale el importe en euros");
		
		
		float importe = sc.nextFloat();
		System.out.println("iva repercutido="+importe*0.21);
		System.out.println("desea volver a introducir un valor??");
		sc.next();
		
		} while (sc.next().equalsIgnoreCase(validar) == true);
		


	}

}
