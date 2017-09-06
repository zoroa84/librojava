import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		System.out.println("   calculadora iva 21%   ");
		System.out.println("----------------------------------");
		System.out.println("por favor dale el importe en euros");
		Scanner sc = new Scanner(System.in);
		
		float importe = sc.nextFloat();
		
		System.out.println("iva repercutido="+importe*0.21);

	}

}
