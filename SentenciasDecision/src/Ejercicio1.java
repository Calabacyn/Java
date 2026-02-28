import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.print("** Identificar el Mayor de 2 numeros ** ");

        var consola = new Scanner(System.in);
        System.out.print("Proporciona un numero: ");
        var numero1 = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona el segundo numero: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        if(numero1 > numero2){
            System.out.println("El numero mayor es = " + numero1);
        }
        else if(numero1 == numero2){
            System.out.println("Ambos numeos son iguales = " + numero2 +", "+numero1);

        }
        else{
            System.out.println("El numero mayor es = " + numero2);
        }
    }
}
