package com.ipartek.formacion.javalibro.ejercicios;
import java.util.Scanner;

public class JuegoAcertar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroAleatorio = (int) (Math.random() * 10);
		int intro = 0;
		int contador = 0;
		Scanner pedir = new Scanner(System.in);
		boolean acertar1 = false;

		System.out.println("introduzca el numero entero que quieres adivinar");
		intro = pedir.nextInt();
		do {
			if (numeroAleatorio == intro) {
				System.out.println("eres un figura acertaste");
				acertar1 = true;
			} else {
				System.out.println("eres un manta no acertaste");
				pedir = new Scanner(System.in);
				intro = pedir.nextInt();
				contador++;
				if (contador >= 2) {
					System.out.println("GAME OVER");
				}
			}
		} while ((contador <= 2) && (acertar1 == false));

		pedir.close();
	}
}
