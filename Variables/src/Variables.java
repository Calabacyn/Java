import java.util.Scanner;

public class Variables {
    //Variables
    public static void main(String[] args) {
//        int edad1;
//        edad1 = 40;
        var edad = 30;
        double sueldo = 203300.50;
        //String nombre = "Karla";

        //Acceder a los valores

        System.out.println(edad);
        System.out.println(sueldo);
        //System.out.println(nombre);

        //Modificar el valor de las variables

        edad = 35;

        System.out.println("Edad modificada: "+edad);


        //Concatenacion

        //var nombre = "Karla";
        var apellido = "Lara";
        //var nombreCompleto = nombre +apellido;
       //System.out.println("nombreCompleto = " + " "+ nombreCompleto);


        //Introducir valores por la consola

        Scanner consola = new Scanner(System.in);//in - input - entrada de datos
        System.out.println("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

    }


}
