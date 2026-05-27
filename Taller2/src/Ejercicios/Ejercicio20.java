package Ejercicios;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

        // Número aleatorio entre 1 y 20
        int numeroSecreto = random.nextInt(20) + 1;
        int intentos = 0;
        int intento;

        System.out.println("=== ADIVINA EL NÚMERO ===");
        System.out.println("He pensado un número entre 1 y 20, ¡intenta adivinarlo!");

        do {
            System.out.print("\nIngresa tu número: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("❌ Vuelve a intentarlo... el número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("❌ Vuelve a intentarlo... el número es menor.");
            }

        } while (intento != numeroSecreto);

        System.out.println("\n🎉 ¡GANASTE!");
        System.out.println("El número era: " + numeroSecreto);
        System.out.println("Lo lograste en " + intentos + " intentos.");

        scanner.close();
	}

}
