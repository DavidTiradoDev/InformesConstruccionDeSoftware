package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Ingresa una frase");
			String frase = scanner.nextLine();
			
			System.out.println(frase.toUpperCase());
			System.out.println(frase.toLowerCase());
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
		
		
		
		scanner.close();

	}
}
