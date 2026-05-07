package Ejercicios;

import java.util.Scanner;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("palabra # 1: ");
		String a = escaner.next();
		
		System.out.println("palabra # 2: ");
		String b = escaner.next();
		
		System.out.println(a.equalsIgnoreCase(b));
		
		escaner.close();

	}

}
