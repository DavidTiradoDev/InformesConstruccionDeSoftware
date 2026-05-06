package Ejercicios;

import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args) {
		Scanner escanner = new Scanner(System.in); 
		
		try { 
			System.out.print("Ingrese un número entero: "); 
			int numero = Integer.parseInt(escanner.nextLine()); 
			System.out.println("Número ingresado: " + numero); 
			} catch (NumberFormatException e) { 
				System.out.println("Error: Debe ingresar un número válido."); 
			}
		
		escanner.close();
	}
	

}
