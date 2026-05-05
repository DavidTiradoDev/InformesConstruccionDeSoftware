package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Ingresa una palabra: ");
			String palabra = scanner.next();
			
			System.out.println(palabra.replace("a", "e"));
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
		scanner.close();
	}

}
