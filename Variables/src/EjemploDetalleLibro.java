import java.sql.SQLOutput;
import java.util.Scanner;

public class EjemploDetalleLibro {

    public static void main(String[] args) {

        // Ejercicio uno

//        Scanner consola = new Scanner(System.in);//in - input - entrada de datos
//        System.out.println("Escribe el titulo: ");
//        var titulo = consola.nextLine();
//        Scanner consola2 = new Scanner(System.in);//in - input - entrada de datos
//        System.out.println("Escribe el autor: ");
//        var autor = consola2.nextLine();
//        System.out.println(titulo + " fue escrito por " + autor);



        //Conversion de tipos de datos

        var consola = new Scanner(System.in);
        System.out.println("Numero 1: ");
        var numero1 = consola.nextLine();
        System.out.println("Numero 2: ");
        var numero2 = consola.nextLine();
        var resultado = Integer.parseInt(numero1) + Integer.parseInt(numero2);
        System.out.println("resultado = " + resultado);
        
        var concatenacion = numero1 + numero2;
        System.out.println("concatenacion = " + concatenacion);


    }
}
