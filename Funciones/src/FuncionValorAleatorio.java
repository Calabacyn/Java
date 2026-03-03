import java.util.Random;

public class FuncionValorAleatorio {
    
    //Funcion Numero Aleatorios

    public static void main(String[] args) {
        var aleatorio = new Random();
        //Generar los valores entre 0 y 100 (no se incluye el valor limite)
        
        int valorAleatorio = aleatorio.nextInt(0,100+1);
        System.out.println("valorAleatorio(0 y 100) = " + valorAleatorio);

        valorAleatorio = aleatorio.nextInt(0,200+1);
        System.out.println("valorAleatorio(0 y 200) = " + valorAleatorio);
    }
}
