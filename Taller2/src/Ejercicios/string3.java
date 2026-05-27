package Ejercicios;
import java.util.Scanner;
public class string3 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingresa la primera palabra: ");
	        String palabra1 = scanner.nextLine();

	        System.out.println("Ingresa la segunda palabra: ");
	        String palabra2 = scanner.nextLine();

	        if (palabra1.equals(palabra2)) {
	            System.out.println("✔ Son iguales (distinguiendo mayúsculas).");
	        } else {
	            System.out.println("✘ No son iguales (distinguiendo mayúsculas).");
	        }

	        if (palabra1.equalsIgnoreCase(palabra2)) {
	            System.out.println("✔ Son iguales (ignorando mayúsculas).");
	        } else {
	            System.out.println("✘ No son iguales (ignorando mayúsculas).");
	        }

	        scanner.close();

	}

}
