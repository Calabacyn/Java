import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ProyectoGeneradorID {
    public static void main(String[] args) {
        generadorIdUnico();
    }

    static void generadorIdUnico(){
        System.out.println("*** Generador ID Unico ***");
        var consola = new Scanner(System.in);
        System.out.print("Cual es tu nombre? ");
        var nombre = consola.nextLine().substring(0,2).toUpperCase();
        System.out.print("Cual es tu apellido? ");
        var apellido = consola.nextLine().substring(0,2).toUpperCase();
        System.out.print("Cual es tu año de nacimiento (YYYY)? ");
        var anio = consola.nextLine().substring(2,4);
        var aleatorio = new Random().nextInt(0, 9999);
        var valorAleatorio = new DecimalFormat("####").format(aleatorio);
        var idUnico = nombre + apellido + anio + valorAleatorio;
        System.out.println("Felicidades! tu nuevo numero de ID Unico es: " + idUnico);
    }
}
