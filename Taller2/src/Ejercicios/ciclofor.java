package Ejercicios;
import java.util.Scanner;

class ciclofor {

	public static void main(String[] args) {
		// ejercicio del 0 al 100
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingresa cualquier numero del 0 al 100");
		int numero = scanner.nextInt();
		System.out.println("ingresaste este numero: " + numero);
		for (int i = 0; i <= numero; i++) {
			System.out.println(i);
		}
		System.out.println("Números pares");
        for (int i = 0; i <= numero; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
        }		
	scanner.close();	
		}
	}
