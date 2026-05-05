package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa la palabra que necesitas para saber los carecteres: ");
		String palabra = scanner.next();
		
		System.out.println("La palabra tiene "+ palabra.length() + " caracteres");
		
		scanner.close();
		}
}
