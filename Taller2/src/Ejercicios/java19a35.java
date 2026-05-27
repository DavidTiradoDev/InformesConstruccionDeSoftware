package Ejercicios;
import java.util.Scanner;
public class java19a35 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        System.out.println("La longitud de \"" + cadena + "\" es: " + cadena.length());

        scanner.close();
	}

}
