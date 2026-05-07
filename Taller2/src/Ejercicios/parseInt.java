package Ejercicios;

import java.util.Scanner;

public class parseInt {

	public static void main(String[] args) {
		Scanner escanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        String entrada = escanner.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error, no ingresaste un número válido");
        }

        escanner.close();

	}

}
