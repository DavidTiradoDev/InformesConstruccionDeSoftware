package Ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {

		final String producto = "Cable HDMI";
		final int unidades = 3;
		final double precioUnitario = 12.50;
		
		double subtotal = precioUnitario * unidades;
		
		System.out.println("Producto: " + producto);
		System.out.println("Unidades: " + unidades);
		System.out.printf("Precio: $ %.2f%n", precioUnitario);
		System.out.printf("Subtotal: $ %.2f%n", subtotal);
		
	}

}
