import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.print("** Promedio de Calificaciones ** ");

        var promedio = 0;

        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Cuantas calificaciones deseas agregar: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        // Creamos de manera dinamica el arreglo
        int[] enteros = new int[largoArreglo];

        //Solicitamos los valores del arreglo
        for(int i=0; i < largoArreglo; i++){
            System.out.print("Calificacion[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }

        // Imprimir los valores del arreglo
        System.out.println("\nImpresion del Arreglo: ");
        for(int i=0; i < largoArreglo; i++){

            promedio = promedio + enteros[i];

        }
        System.out.println("Promedio de las calificaciones: " + (promedio/largoArreglo));
    }
}
