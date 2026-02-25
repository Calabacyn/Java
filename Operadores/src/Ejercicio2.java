import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("**** Calculo Area Rectangulo ****");

        var consola = new Scanner(System.in);

        System.out.println("Ingrese la base : ");
        var base= Integer.parseInt(consola.nextLine());

        System.out.println("Ingrese la altura : ");
        var altura= Integer.parseInt(consola.nextLine());

        var resultado= base * altura;
        System.out.println("Area del Rectangulo : "+ resultado);
    }
}
