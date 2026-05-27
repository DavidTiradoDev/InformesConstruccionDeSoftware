package Ejercicios;

public class Switchcaseasistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String nombre = "Johan"; 

        switch (nombre) {
            case "Juan Pablo":
                System.out.println("Hola Juan Pablo, ¿cómo te va?");
                break;
            case "David":
                System.out.println("David, ¡qué bueno verte!");
                break;
            case "Johan":
                System.out.println("Johan, ¿todo bien por allá?");
                break;
            case "Sara":
                System.out.println("Sara, lindísima como siempre");
                break;
            case "Juan Manuel":
                System.out.println("Juan Manuel, ¿cómo está la familia?");
                break;
            case "Sebastian":
                System.out.println("Sebastian, ¡qué elegante hoy!");
                break;
            case "Estefania":
                System.out.println("Estefania, lindo día para ti");
                break;
            case "Julio":
                System.out.println("Julio, ¡siempre tan puntual!");
                break;
            case "Juan Esteban":
                System.out.println("Juan Esteban, ¿qué hay de nuevo?");
                break;
            default:
                System.out.println("Error: nombre no reconocido");
        }
    }

	}

