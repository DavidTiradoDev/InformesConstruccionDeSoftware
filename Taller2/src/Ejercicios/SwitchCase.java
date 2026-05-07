package Ejercicios;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("digita un día de la semana: ");
		int dia = escaner.nextInt();
		
		switch (dia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("dia laborable");
			break;
		case 6:
		case 7:
			System.out.println("fin de semana");
			break;
		default:
			System.out.println("tipo de dato invalido");
			
		}
		escaner.close();
	}

}
