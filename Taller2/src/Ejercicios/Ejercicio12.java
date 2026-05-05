package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Ingresa una palabra: ");
			String primeraPalabra = scanner.next();
			
			System.out.println("Ingresa otra palabra: ");
			String segundaPalabra = scanner.next(); 
			
			System.out.println(primeraPalabra.equals(segundaPalabra));
			System.out.println(primeraPalabra.equalsIgnoreCase(segundaPalabra));
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
		
		
		scanner.close();
	}

}
