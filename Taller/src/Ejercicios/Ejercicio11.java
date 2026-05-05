package Ejercicios;

public class Ejercicio11 {

	public static void main(String[] args) {
		int flags = 0;
		flags = flags | 4;
		flags = flags | 1;
		
		System.out.println("flags (dec) = " + flags);
		System.out.println("flags (bin) = " + Integer.toBinaryString(flags));
	}
}
