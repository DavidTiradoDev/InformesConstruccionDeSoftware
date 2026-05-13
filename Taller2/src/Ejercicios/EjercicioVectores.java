package Ejercicios;

import java.util.Scanner;

public class EjercicioVectores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombres [] = new String[5];
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println("ingrese un nombre:");
			nombres[i] = sc.nextLine().toUpperCase();
		}
		
		char caracteres[] = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

		int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
            16,17,18,19,20,21,22,23,24,25,26,27};
		
		int x = 0;
		
		String nombreAux = "";
		
		while (x < nombres.length) {
			for(int j = 0; j < nombres[x].length(); j++) {
				for(int k = 0; k < caracteres.length; k++) {
					if(nombres[x].charAt(j) == caracteres[k]) {
						nombreAux = nombreAux + numeros[k];
					}
				}
			}
			
			nombres[x] = nombreAux;
			System.out.println("nombre convertido: " + nombres[x]);
			nombreAux = "";
			x++;
		}
		
		sc.close();
	}
	
}
