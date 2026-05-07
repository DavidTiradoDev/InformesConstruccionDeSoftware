package Ejercicios;

import java.util.Scanner;

public class Trim {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("ingresa una palabra: ");
		String palabra = escaner.next();
		
		System.out.println(palabra.trim());
		
		escaner.close();

	}

}
