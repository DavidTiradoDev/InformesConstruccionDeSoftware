package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese un valor entero: ");
		int numero = sc.nextInt();

		int contador = 0;

		System.out.println("\nMúltiplos de 7 desde 0 hasta " + numero + ":");
		for (int i = 0; i <= numero; i++) {
			if (i % 7 == 0 && i != 0) {
				System.out.print(i + " ");
				contador++;
			}
		}

		System.out.println("\n\nEl número " + numero + " tiene el 7 incluido " + contador + " veces.");

		sc.close();
	}

}
