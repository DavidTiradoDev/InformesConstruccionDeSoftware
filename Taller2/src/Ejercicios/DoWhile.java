package Ejercicios;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		int opcion;

        do {
            int numero = (int)(Math.random() * 100) + 1;
            System.out.println("número aleatorio: " + numero);

            System.out.print("desea continuar? (1 = sí / 0 = no): ");
            opcion = escaner.nextInt();

        } while (opcion == 1);
        
        System.out.println("Has finalizado");
		
		escaner.close();
	}

}
