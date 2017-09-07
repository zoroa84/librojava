import java.util.Scanner;

public class JuegoAcertar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroAleatorio = 2;
		int intro = 0;
		int contador = 0;
		Scanner pedir = new Scanner(System.in);
		boolean acertar = false;
		
		System.out.println("introduzca el numero entero que quieres adivinar");
		intro = pedir.nextInt();
		
		do {
			if (numeroAleatorio == intro) {
			System.out.println("eres un figura acertaste");
			acertar = true;
			break;
		}else {
			
			System.out.println("eres un manta no acertaste");
			//pedir = new Scanner(System.in);
			intro = pedir.nextInt();
			contador++;
			if(contador>=2) {
				System.out.println("GAME OVER");
			}
			
		}
		} while ((contador<2) && (acertar = false));
		
		pedir.close();
	}

}
