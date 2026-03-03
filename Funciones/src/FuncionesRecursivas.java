public class FuncionesRecursivas {

    //Imprimir 5 al 1

    //Funcion recursiva

    static void funcionRecursiva(int numero){
        //Caso Base
        if(numero == 1){
            System.out.println("numero fin = " + numero);
        }
        else {
            //Caso recursivo
            System.out.println("numero recursivo = " + numero);
            funcionRecursiva(numero - 1);

            System.out.println("numero recursivo 2 = " + numero);
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }


}
