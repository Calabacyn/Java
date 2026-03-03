public class FuncionSumar {
    // Definimos la funcion sumar
    static int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        int arg1 = 5, arg2 = 7;
        var res = sumar(arg1, arg2);
        System.out.println("Resultado suma: " + res);
        res = sumar(8,9);
        System.out.println("Resultado suma: " +res);
    }
}
