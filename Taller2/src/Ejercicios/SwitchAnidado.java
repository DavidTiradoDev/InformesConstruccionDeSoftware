package Ejercicios;

import java.util.Scanner;

public class SwitchAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("ingresa tu promedio: ");
		int promedio = escaner.nextInt();
		
		System.out.println("ingresa nota parcial: ");
		int notaParcial = escaner.nextInt();
		
		
		switch (promedio) {
		
		case 1:
		case 2:
			System.out.println("perdiste la materia");
			break;
		case 3:
		case 4:
		case 5: 
			System.out.println("ganaste la materia");
			switch (notaParcial) {
			
			case 1:
			case 2:
			case 3:
				System.out.println("pero perdiste el parcial");
				break;
			case 4:
			case 5:
				System.out.println("y también el parcial");
				break;
			}
			break;
			default:
				System.out.println("ERROR!");
		}
		
		
		escaner.close();
	}

}
