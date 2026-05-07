package Ejercicios;

import java.util.Scanner;

public class SwitchAsistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("ingresa un nombre: ");
		String nombre = escaner.next();
		
		switch (nombre) {
		
		case "Sebastian":
			System.out.println("vino");
			break;
		case "Gustavo":
			System.out.println("vino");
			break;
		case "Osvaldo":
			System.out.println("vino");
			break;
		case "Julio":
			System.out.println("vino");
			break;
		case "Estefa":
			System.out.println("vino");
			break;
		case "Esteban":
			System.out.println("vino");
			break;
		case "Daniel":
			System.out.println("vino");
			break;
		case "Andres":
			System.out.println("vino");
			break;
		case "Sara":
			System.out.println("vino");
			break;
		case "Manuel":
			System.out.println("vino");
			break;
		case "David":
			System.out.println("vino");
			break;
		case "Johan":
			System.out.println("vino");
			break;
		case "Pablo":
			System.out.println("vino");
			break;
		default:
			System.out.println("no vino");
			break;	
		
		 
		}
		
		escaner.close();
	}

}
