package Ejercicios;
import java.util.Scanner;

public class switchcaseanidadopromediodenotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa tu promedio: ");
        int promedio = scanner.nextInt();
        System.out.println("ingresa porcentaje de parcial: ");
        int parcial = scanner.nextInt();

        if (promedio > 5 || parcial > 5) {
            System.out.println("dato erroneo es de 0 a 5 los promedios");
        } else {
            switch (promedio) {
                case 1:
                case 2:
                    System.out.println("perdistes la asignatura");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("ganastes la asignatura");
                    switch (parcial) {
                        case 1:
                        case 2:
                            System.out.println("no te alcanzo la nota perdistes la asignatura");
                            break;
                        case 3:
                        case 4:
                        case 5:
                            System.out.println("pasastes sobrado");
                            break;
                    }
                    break;
                default:
                    System.out.println("error de datos ingresados");
            }
        }
        scanner.close();
    }
}