package Ejercicios;

import java.util.Scanner;


public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.println("Ingresa un numero del 1 al 10 para ver las tablas: ");
			num = scanner.nextInt();
			
			if(num < 0 | num > 10) {
				System.out.println("Ingrese un numero valido");
				continue;
			}
			break;
		}
		
		 for(int i = num; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		 }
		
		scanner.close();
	}

}
