import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        //definir las variables limites

        final int MINIMO= 0;
        final int MAXIMO= 5;

        //SOLICITAR UN VALOR ENTRE 0 Y 5

        var consola= new Scanner(System.in);
        System.out.println("Proporciona un dato entre 0 y 5: ");

        //Verifica si el dato esta dentro de rango
        var dato = Integer.parseInt(consola.nextLine());
        var dentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("Valor dentro rango? = " + dentroRango);

    }
}
