package Ejercicios;
import java.util.Scanner;
public class string2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.println("En mayúsculas: " + frase.toUpperCase());
        System.out.println("En minúsculas: " + frase.toLowerCase());

        scanner.close();

	}

}
