public class OperadoresUnarios {
    public static void main(String[] args) {
        //Operadores Unarios
        int a=3, b=-2, resultado = 0;
        

        //Operador unario -
        resultado = -a;
        System.out.println("-a = " + resultado);
        resultado = -b;
        System.out.println("-b = " + resultado);

        //Operador unario ++(incremento en uno)
        a=3;
        resultado = ++a;
        System.out.println("Pre-incremento ++a = " + resultado);
        a=3;
        resultado = a++;
        System.out.println("Post-incremento a++ = " + resultado);
        System.out.println("a = "+ a);

        //Operador unario -- (decrementa en uno)
        b=-2;
        resultado = --b;
        System.out.println("Pre-decremento --b = " + resultado);
        b=-2;
        resultado = b--;
        System.out.println("Post-decremento b-- = " + resultado);
        System.out.println("b = "+ b);

        //Operador negacion ! (invierte el valor logico)
        var c = true;
        var resultado2 = !c;
        System.out.println("Negacion !c = " + resultado2);
    }

}
