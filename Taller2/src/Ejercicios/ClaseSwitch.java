package Ejercicios;
import java.util.Scanner;
public class ClaseSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa cualquier numero de dias de la semana: ");
		int semana = scanner.nextInt();
		System.out.println("ingresaste el dia de semana : " + semana );
		String dia_de_semana = scanner.nextLine();
		System.out.println(dia_de_semana);
		
		switch(semana)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dia_de_semana = " dia de semana para trabajar";
			break;
		case 6:
			dia_de_semana = " cae sabado un dia de ir a la universidad ";
			break;
		case 7:
			dia_de_semana = " dia de descanso y las cervecitas ";
			break;
		}
		System.out.println( semana + " es un dia " + dia_de_semana );
		scanner.close();
	}
}