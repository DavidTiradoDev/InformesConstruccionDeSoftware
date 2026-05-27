package Ejercicios;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("ingrese una frase: ");
		String frase = escaner.next();
		
		System.out.println(frase.contains("estamos"));
		
		escaner.close();

	}

}
