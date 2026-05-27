package Ejercicios;

import java.util.Scanner;

public class ejerciciosconcondicionales {

	public static void main(String[] args) {
		// solicitar un numero al usuario e imprimir 
		//"el numero que ingresastes es par"
		// si se cumple lo anterior "si el numero es multiplo de 3 de lo contrario imprimir el # es par pero no es multiplo de 3"
		Scanner scanner = new Scanner(System.in);
		System.out.print("escribe un numero entero: ");
		int numero = scanner.nextInt();
		System.out.println("el numero que dijitastes fue: " + numero  );
		scanner.close();
			if (numero % 2 == 0  && numero % 3 == 0) { 
				System.out.print("el numero " + numero + "es par y multiplo de 3");	
			} else { 
			if (numero % 2 == 0  && numero % 3 == 0) {
			System.out.print("el numero " + numero + "es par PERO NO ES multiplo de 3");	
			}else {
		System.out.print("el numero " + numero +  " es impar ");
		
		
		}
	}
}
}