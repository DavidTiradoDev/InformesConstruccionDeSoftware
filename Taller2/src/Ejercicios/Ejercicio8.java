package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroAleatorio = (int)(Math.random() * 20) + 1;
		int num = 0;

		
		while(true) {
			// Validacion de numero correcto
			while(true) {
				System.out.println("Ingresa un número entre el 1 y el 20 para adivinar el correcto: ");
				num = scanner.nextInt();
				if (num < 1 | num > 25) {
					System.out.println("Ingresa un numero válido");
					continue;
				}
				break;
			}
			
			if(num == numeroAleatorio) {
				System.out.println("Felicitaciones, el número era el " + numeroAleatorio);
				break;
			} else {
				System.out.println("Sigue intentando!\n");
				continue;
			}
		}
		scanner.close();
	}
}
