package Ejercicios;

public class EstructuraEquals {

	public static void main(String[] args) {
		//estructura equals
		
		String x = new String("hola");
		String y = new String("hola");
		
		//x==y: false
		if(x == y) {
			System.out.println("x es igual a y");
		}
		
		//x.equals(y): true
		if(x.equals(y)) {
			System.out.println("x es igual a y");
		}

	}

}
