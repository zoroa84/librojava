package com.ipartek.formacion.javalibro.ejercicios;

import java.util.Arrays;

public class OrdenarArray {

	static int[] numeros = { 0, 3, 4, 6, 9, 2, 5, 7, 8, 1 };
	static int i, j;

	public static void main(String[] args) {

		Arrays.sort(numeros);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
