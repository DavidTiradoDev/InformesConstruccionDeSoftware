package Ejercicios;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("ingrese una palabra: ");
		String palabra = escaner.next();
		
		System.out.println(palabra.substring(2));
		
		escaner.close();

	}

}
