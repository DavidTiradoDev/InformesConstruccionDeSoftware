package Ejercicios;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("palabra # 1: ");
		String p1 = escaner.next();
		
		System.out.println("palabra # 2: ");
		String p2 = escaner.next();
		
		System.out.println(p1.equals(p2));
		
		escaner.close();

	}

}
