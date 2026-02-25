import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class EjemploPressentacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Nombre: ");
        var nombre = consola.nextLine();
        System.out.println("edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("Hijo unico? true o false: ");
        var hijoUnico = Boolean.parseBoolean(consola.nextLine());
        System.out.println("Bebida favorita: ");
        var bebidaFavorita = consola.nextLine();
        System.out.println("Precio bebida favorita: ");
        var precioBebidaFavorita = Float.parseFloat(consola.nextLine());

        System.out.println("Nombre = " + nombre);
        System.out.println("Edad = " + edad);
        System.out.println("Hijo unico = " + hijoUnico);
        System.out.println("Bebida favorita = " + bebidaFavorita);
        System.out.println("Precio bebida favorita = " + precioBebidaFavorita);
    }
}
