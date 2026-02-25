public class OperadoresLogicos  {
    public static void main(String[] args) {
        //Operadores logicos

        boolean a = true, b= false;

        //and (regresa true si ambos son true)
        var resultado = a && b;
        System.out.println("resultado: a && b = " + resultado);

        //or (regresa verdadero si cualquier valor a evaluar es verdadero)
        resultado= a || b;
        System.out.println("resultado: a || b = " + resultado);

        //! (not) (invierte el valor logico)
        resultado= !a;
        System.out.println("resultado: !a  " + resultado);
    }

}
