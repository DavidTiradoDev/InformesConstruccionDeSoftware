package Ejercicios;
import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una palabra o frase: ");
        String palabra = scanner.nextLine().toLowerCase();

        // Contadores para cada vocal
        int A = 0, E = 0, I = 0, O = 0, U = 0;
        int i = 0;
        while (i < palabra.length()) {
            char letra = palabra.charAt(i);
            if (letra == 'a') A++;
            else if (letra == 'e') E++;
            else if (letra == 'i') I++;
            else if (letra == 'o') O++;
            else if (letra == 'u') U++;

            i++;
        }
        System.out.println("\n--- Resultado ---");
        System.out.println("Vocal 'a': " + A + " veces");
        System.out.println("Vocal 'e': " + E + " veces");
        System.out.println("Vocal 'i': " + I + " veces");
        System.out.println("Vocal 'o': " + O + " veces");
        System.out.println("Vocal 'u': " + U + " veces");

        scanner.close();
    
}
	
	


}
