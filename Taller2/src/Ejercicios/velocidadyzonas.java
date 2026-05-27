package Ejercicios;
import java.util.Scanner;
public class velocidadyzonas {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("ingresa la velocidad: ");
	int velocidad = scanner.nextInt();
	System.out.println("la velocidad fue: " + velocidad );
	if (velocidad >= 0 && velocidad <= 40) {
		System.out.println(" puedes trancitar por Zonas escolares");
	}
	else if (velocidad > 40 && velocidad <= 60) {
		System.out.println("puedes trancitar por Vias Rurales");
	}
	else if (velocidad > 60 && velocidad <= 80) {
		System.out.println("Puedes trancitar por vias Urbanas");
	}
	else if (velocidad > 80 && velocidad <= 100) {
		System.out.println("Puedes trancitar por AUTOPISTAS y Rutas Nacionales");
	}
	else {
		System.out.println("estas excediendo los limites de velocidad te vas a matar perro");
	}
	scanner.close();
}
}