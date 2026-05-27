// Clase principal
package Ejercicios;


public class ClaseCasco {

    // Atributos
    String marca;
    String color;
    String talla;

    boolean visera;
    boolean abatible;
    boolean abierto;

    // Métodos
    public void quitar() {
        System.out.println("El casco se ha quitado");
    }

    public void poner() {
        System.out.println("El casco se ha puesto");
    }

    public void amarrar() {
        System.out.println("El casco se ha amarrado");
    }

    // Método main
    public static void main(String[] args) {

        // Objeto casco1
        ClaseCasco casco1 = new ClaseCasco();

        casco1.marca = "Shaft";
        casco1.color = "Azul";
        casco1.talla = "L";
        casco1.abierto = true;

        System.out.println("CASCO 1");
        System.out.println("Marca: " + casco1.marca);
        System.out.println("Color: " + casco1.color);
        System.out.println("Talla: " + casco1.talla);
        System.out.println("Abierto: " + casco1.abierto);

        casco1.quitar();
        casco1.poner();
        casco1.amarrar();

        System.out.println();

        // Objeto casco2
        ClaseCasco casco2 = new ClaseCasco();

        casco2.marca = "ICH";
        casco2.color = "Verde";
        casco2.talla = "M";
        casco2.visera = true;

        System.out.println("CASCO 2");
        System.out.println("Marca: " + casco2.marca);
        System.out.println("Color: " + casco2.color);
        System.out.println("Talla: " + casco2.talla);
        System.out.println("Visera: " + casco2.visera);

        casco2.quitar();
        casco2.poner();
        casco2.amarrar();

        System.out.println();

        // Objeto casco3
        ClaseCasco casco3 = new ClaseCasco();

        casco3.marca = "MT";
        casco3.color = "Naranjado";
        casco3.talla = "XL";
        casco3.abatible = true;

        System.out.println("CASCO 3");
        System.out.println("Marca: " + casco3.marca);
        System.out.println("Color: " + casco3.color);
        System.out.println("Talla: " + casco3.talla);
        System.out.println("Abatible: " + casco3.abatible);

        casco3.quitar();
        casco3.poner();
        casco3.amarrar();
    }
}