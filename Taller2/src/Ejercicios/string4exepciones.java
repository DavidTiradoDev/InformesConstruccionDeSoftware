package Ejercicios;
import java.util.Scanner;
public class string4exepciones {

	public static void main(String[] args) {
		// replace
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        String resultado = cadena.replace("a", "e");

        System.out.println("Cadena original:  " + cadena);
        System.out.println("Cadena modificada: " + resultado);

        scanner.close();

	}

}
