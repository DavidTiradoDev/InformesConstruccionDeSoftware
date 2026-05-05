package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = -1;

		while (numero < 0 || numero > 100) {
			System.out.print("Ingrese un valor entero del 0 al 100: ");
			numero = sc.nextInt();

			if (numero < 0 || numero > 100) {
				System.out.println("Error: El número debe estar entre 0 y 100. Intente nuevamente.\n");
			}
		}

		System.out.println("\n=== NÚMEROS DEL 0 AL " + numero + " ===");
		for (int i = 0; i <= numero; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n=== NÚMEROS PARES DEL 0 AL " + numero + " ===");
		for (int i = 0; i <= numero; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println("\n");

		sc.close();
	}

}
