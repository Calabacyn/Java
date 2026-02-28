import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Dia de la semana (1 - 7)
        System.out.print("Proporciona la calificacion en numero (0-10): ");
        var calificacionNumero = Integer.parseInt(new Scanner(System.in).nextLine());
        // switch mejorada
        switch(calificacionNumero){
            case 0 -> System.out.println("Calificacion: " + calificacionNumero + "Letra: F ");
            case 1 -> System.out.println("Calificacion: " + calificacionNumero + "Letra: F ");
            case 2 -> System.out.println("Calificacion: " + calificacionNumero + "Letra: F ");
            case 3 -> System.out.println("Calificacion: " + calificacionNumero + "Letra: F ");
            case 4 -> System.out.println("Calificacion: " + calificacionNumero + "Letra: F ");
            case 5 -> System.out.println("Calificacion: " + calificacionNumero + "Letra: F ");
            case 6 -> System.out.println("Calificacion: " + calificacionNumero + "Letra: D ");
            case 7 -> System.out.println("Calificacion: " + calificacionNumero + "Letra: C ");
            case 8 -> System.out.println("Calificacion: " + calificacionNumero + "Letra: B ");
            case 9 -> System.out.println("Calificacion: " + calificacionNumero + "Letra: A ");
            case 10 ->System.out.println("Calificacion: " + calificacionNumero + "Letra: A ");
            default -> System.out.println("Valor erroneo: " + calificacionNumero);
        }
    }
}
