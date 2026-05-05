package Ejercicios;

public class Ejercicio10 {

	public static void main(String[] args) {
		long bytes = 5_000_000;
		double kb = bytes/1000;
		double kib = bytes/1024;
		
		System.out.println("Bytes: " + bytes);
		System.out.println("KB (decimal): " + kb);
		System.out.println("KiB (binario): " + kib);

	}

}
