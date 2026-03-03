import java.util.Scanner;

public class FuncionNumeroPar {

    //Funcion para saber si un nuemro es par

    static boolean esPar(int numero){
//        if(numero % 2 == 0){
//            return true;}
//        else {
//            return false;
//        }
        return  (numero % 2 == 0)? true : false;
    }

    public static void main(String[] args) {
        System.out.println("Proporciona un valor numerico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("numero es par? = " + esPar(numero));
    }
}
