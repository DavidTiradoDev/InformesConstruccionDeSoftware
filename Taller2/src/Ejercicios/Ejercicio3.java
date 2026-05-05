package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== DESCUENTOS POR DÍA Y PRODUCTO ===");
		System.out.print("Ingrese el día de la semana (lunes, martes, miércoles, jueves, viernes): ");
		String dia = sc.nextLine().toLowerCase();

		System.out.print("Ingrese el producto (frutas y verduras, carnes, vinos): ");
		String producto = sc.nextLine().toLowerCase();

		System.out.print("Ingrese el valor del producto: ");
		double valor = sc.nextDouble();

		double descuento = 0;

		switch(dia) {
			case "lunes":
				switch(producto) {
					case "frutas y verduras":
						descuento = 0.30;
						break;
					case "carnes":
					case "vinos":
						descuento = 0;
						break;
					default:
						System.out.println("Producto no reconocido");
						return;
				}
				break;

			case "martes":
				switch(producto) {
					case "carnes":
						descuento = 0.30;
						break;
					case "frutas y verduras":
					case "vinos":
						descuento = 0;
						break;
					default:
						System.out.println("Producto no reconocido");
						return;
				}
				break;

			case "miércoles":
				switch(producto) {
					case "carnes":
						descuento = 0.15;
						break;
					case "frutas y verduras":
						descuento = 0.10;
						break;
					case "vinos":
						descuento = 0.05;
						break;
					default:
						System.out.println("Producto no reconocido");
						return;
				}
				break;

			case "jueves":
				switch(producto) {
					case "vinos":
						descuento = 0.30;
						break;
					case "frutas y verduras":
					case "carnes":
						descuento = 0;
						break;
					default:
						System.out.println("Producto no reconocido");
						return;
				}
				break;

			case "viernes":
				switch(producto) {
					case "vinos":
						descuento = 0.15;
						break;
					case "frutas y verduras":
						descuento = 0.10;
						break;
					case "carnes":
						descuento = 0.05;
						break;
					default:
						System.out.println("Producto no reconocido");
						return;
				}
				break;

			default:
				System.out.println("Día no reconocido");
				return;
		}

		double valorDescuento = valor * descuento;
		double costoFinal = valor - valorDescuento;

		System.out.println("\n=== RESULTADO ===");
		System.out.println("Valor original: $" + valor);
		System.out.println("Descuento (" + (descuento * 100) + "%): $" + valorDescuento);
		System.out.println("Costo a pagar: $" + costoFinal);

		sc.close();
	}

}
