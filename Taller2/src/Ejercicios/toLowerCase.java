package Ejercicios;

import java.util.Scanner;

public class toLowerCase {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("ingresa una palabra: ");
		String palabra = escaner.next();
		
		System.out.println(palabra.toLowerCase());
		
		escaner.close();

	}

}
