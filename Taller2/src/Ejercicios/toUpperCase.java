package Ejercicios;

import java.util.Scanner;

public class toUpperCase {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("ingresa una palabra: ");
		String palabra = escaner.next();
		
		System.out.println(palabra.toUpperCase());
		
		escaner.close();

	}

}
