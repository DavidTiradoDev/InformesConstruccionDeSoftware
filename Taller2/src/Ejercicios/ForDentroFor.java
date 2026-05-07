package Ejercicios;

import java.util.Scanner;

public class ForDentroFor {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("ingresa un número: ");
		int num = escaner.nextInt();
		
		for (int i = num; i <= 10; i++) {
			System.out.println("tabla de multiplicar de " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
		escaner.close();
	}

}
