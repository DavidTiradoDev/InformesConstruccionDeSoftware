package Ejercicios;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio18 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String respuesta;

        System.out.println(" NÚMEROS ALEATORIOS ");

        do {
            int numeroAleatorio = random.nextInt(100) + 1;
            System.out.println("\n Número aleatorio: " + numeroAleatorio);

            System.out.print("¿Deseas continuar? (si/no): ");
            respuesta = scanner.nextLine().toLowerCase();

            if (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println(" Respuesta no válida, escribe 'si' o 'no'.");
                respuesta = "si";
            }

        } while (respuesta.equals("si"));

        System.out.println("\n ¡Hasta luego!");

        scanner.close();

	}
	

}
